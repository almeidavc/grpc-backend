package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.lib.*;
import com.almeidavc.grpcbackend.patient.PatientEntity;
import com.almeidavc.grpcbackend.patient.PatientRepository;
import com.almeidavc.grpcbackend.hospital.HospitalRepository;

import com.google.protobuf.Empty;
import io.grpc.testing.StreamRecorder;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GrpcPatientHospitalRelationshipServiceTest {
    static final String[][] PATIENTS_TEST_DATA = {
            {"john", "adams", "cancer", "chemotherapy"},
            {"sophia", "smith", "cancer", "chemotherapy"},
            {"tyler", "brown", "cancer", "chemotherapy"}
    };

    static final String[][] HOSPITALS_TEST_DATA = {
            {"h1", "example address 400"},
            {"h2", "example address 404"},
            {"h3", "example address 408"}
    };

    @Autowired
    private GrpcPatientHospitalRelationshipService grpcPatientHospitalRelationshipService ;
    @Autowired
    private GrpcPatientService grpcPatientService;
    @Autowired
    private GrpcHospitalService grpcHospitalService;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private HospitalRepository hospitalRepository;

    @BeforeEach
    public void deleteAllEntriesFromRepositories() {
        patientRepository.deleteAll();
        hospitalRepository.deleteAll();
    }

    @Test
    public void testRegisterPatientInHospital() throws Exception {
        // setup
        PatientEntity patientEntity = patientRepository.save(new PatientEntity("john", "adams", "cancer", "chemotherapy"));
        HospitalEntity hospitalEntity = hospitalRepository.save(new HospitalEntity("h1", "example address 400"));

        // test grpc service method
        RegisterPatientInHospitalRequest request = RegisterPatientInHospitalRequest.newBuilder()
                .setPatientId(patientEntity.getId())
                .setHospitalId(hospitalEntity.getId())
                .build();
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();
        grpcPatientHospitalRelationshipService.registerPatientInHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Empty> results = responseObserver.getValues();
        assertEquals(1, results.size());
        assertEquals(Empty.newBuilder().build(), results.get(0));

        // assert patient was registered in hospital
        patientEntity = patientRepository.findById(patientEntity.getId()).get();
        assertEquals(1, patientEntity.getHospitals().size());
        assertEquals(hospitalEntity.getId(), ((HospitalEntity) patientEntity.getHospitals().toArray()[0]).getId());
    }

    @Test
    public void testListPatientsByHospital() throws Exception {
        // setup
        HospitalEntity hospitalEntity = hospitalRepository.save(new HospitalEntity("h1", "example address 400"));
        Set<Patient> patients = new HashSet<>();
        for (String[] patientData : PATIENTS_TEST_DATA) {
            PatientEntity patientEntity = patientRepository.save(new PatientEntity(patientData[0], patientData[1], patientData[2], patientData[3]));
            patientEntity.getHospitals().add(hospitalEntity);
            patientEntity = patientRepository.save(patientEntity);
            patients.add(patientEntity.mapToGrpcInterface());
        }

        // test grpc service method
        ListPatientsByHospitalRequest request = ListPatientsByHospitalRequest.newBuilder()
                .setHospitalId(hospitalEntity.getId())
                .build();
        StreamRecorder<ListPatientsByHospitalResponse> responseObserver = StreamRecorder.create();
        grpcPatientHospitalRelationshipService.listPatientsByHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ListPatientsByHospitalResponse> results = responseObserver.getValues();
        assertEquals(1, results.size());

        // assert right patients were listed in the response
        ListPatientsByHospitalResponse response = results.get(0);
        assertEquals(patients.size(), response.getPatientsCount());
        assertTrue(new HashSet<>(response.getPatientsList()).containsAll(patients));
    }

    @Test
    public void testListHospitalsByPatient() throws Exception {
        // setup
        PatientEntity patientEntity = patientRepository.save(new PatientEntity("john", "adams", "cancer", "chemotherapy"));
        Set<HospitalEntity> hospitalEntities = new HashSet<>();
        for (String[] hospitalData : HOSPITALS_TEST_DATA) {
            HospitalEntity hospitalEntity = hospitalRepository.save(new HospitalEntity(hospitalData[0], hospitalData[1]));
            hospitalEntities.add(hospitalEntity);
        }
        for (HospitalEntity hospitalEntity : hospitalEntities) {
            patientEntity.getHospitals().add(hospitalEntity);
        }
        patientRepository.save(patientEntity);
        Set<Hospital> hospitals = new HashSet<>();
        for (HospitalEntity hospitalEntity : hospitalEntities) {
            hospitals.add(Hospital.newBuilder()
                    .setId(hospitalEntity.getId())
                    .setTitle(hospitalEntity.getTitle())
                    .setAddress(hospitalEntity.getAddress())
                    .build());
        }

        // test grpc service method
        ListHospitalsByPatientRequest request = ListHospitalsByPatientRequest.newBuilder()
                .setPatientId(patientEntity.getId())
                .build();
        StreamRecorder<ListHospitalsByPatientResponse> responseObserver = StreamRecorder.create();
        grpcPatientHospitalRelationshipService.listHospitalsByPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ListHospitalsByPatientResponse> results = responseObserver.getValues();
        assertEquals(1, results.size());

        // assert right hospitals were listed in the response
        ListHospitalsByPatientResponse response = results.get(0);
        assertEquals(hospitals.size(), response.getHospitalsCount());
        assertTrue(new HashSet<>(response.getHospitalsList()).containsAll(hospitals));
    }

    @Test
    public void testPatientIsNotDeletedIfHospitalIsDeleted() throws Exception {
        // setup
        PatientEntity patientEntity = patientRepository.save(new PatientEntity("john", "adams", "cancer", "chemotherapy"));
        HospitalEntity hospitalEntity = hospitalRepository.save(new HospitalEntity("h1", "example address 400"));
        patientEntity.getHospitals().add(hospitalEntity);
        patientRepository.save(patientEntity);

        // delete hospital
        DeleteHospitalRequest request = DeleteHospitalRequest.newBuilder()
                .setHospitalId(hospitalEntity.getId())
                .build();
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();
        grpcHospitalService.deleteHospital(request, responseObserver);

        // assert patient was not deleted
        assertEquals(1, patientRepository.findAll().size());
    }

    @Test
    public void testHospitalIsNotDeletedIfPatientIsDeleted() throws Exception {
        // setup
        PatientEntity patientEntity = patientRepository.save(new PatientEntity("john", "adams", "cancer", "chemotherapy"));
        HospitalEntity hospitalEntity = hospitalRepository.save(new HospitalEntity("h1", "example address 400"));
        patientEntity.getHospitals().add(hospitalEntity);
        patientRepository.save(patientEntity);

        // delete patient
        DeletePatientRequest request = DeletePatientRequest.newBuilder()
                .setPatientId(patientEntity.getId())
                .build();
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();
        grpcPatientService.deletePatient(request, responseObserver);

        // assert hospital was not deleted
        assertEquals(1, hospitalRepository.findAll().size());
    }
}
