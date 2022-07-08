package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.hospital.HospitalRepository;
import com.almeidavc.grpcbackend.patient.PatientEntity;
import com.almeidavc.grpcbackend.patient.PatientRepository;
import com.almeidavc.grpcbackend.lib.Patient;
import com.almeidavc.grpcbackend.lib.CreatePatientRequest;
import com.almeidavc.grpcbackend.lib.UpdatePatientRequest;
import com.almeidavc.grpcbackend.lib.DeletePatientRequest;

import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.util.concurrent.TimeUnit;
import java.util.List;
import io.grpc.testing.StreamRecorder;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GrpcPatientServiceTest {
    @Autowired
    private GrpcPatientService grpcPatientService;
    @Autowired
    private PatientRepository patientRepository;

    @BeforeEach
    public void deleteAllEntriesFromRepository() {
        patientRepository.deleteAll();
    }

    @Test
    public void testCreatePatient() throws Exception {
        CreatePatientRequest request = CreatePatientRequest.newBuilder()
                .setPatientFirstName("John")
                .setPatientLastName("Adams")
                .setPatientMedicalCondition("cancer")
                .build();
        StreamRecorder<Patient> responseObserver = StreamRecorder.create();
        grpcPatientService.createPatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Patient> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Patient response = results.get(0);
        assertEquals("John", response.getFirstName());
        assertEquals("Adams", response.getLastName());
        assertEquals("cancer", response.getMedicalCondition());
    }

    @Test
    public void testUpdatePatientNoMask() throws Exception {
        // add entry to patient table that will be updated
        PatientEntity patientEntity = patientRepository
                .save(new PatientEntity("John", "Adams", "cancer"));
        assertEquals("John", patientEntity.getFirstName());
        assertEquals("Adams", patientEntity.getLastName());
        assertEquals("cancer", patientEntity.getMedicalCondition());

        // update entry
        Patient patient = Patient.newBuilder()
                .setId(patientEntity.getId())
                .setFirstName("newFirstName")
                .setLastName("newLastName")
                .setMedicalCondition("newCancer")
                .build();
        UpdatePatientRequest request = UpdatePatientRequest.newBuilder()
                .setPatient(patient)
                .build();
        StreamRecorder<Patient> responseObserver = StreamRecorder.create();
        grpcPatientService.updatePatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Patient> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Patient response = results.get(0);
        assertEquals("newFirstName", response.getFirstName());
        assertEquals("newLastName", response.getLastName());
        assertEquals("newCancer", response.getMedicalCondition());
    }

    @Test
    public void testUpdatePatientWithMask() throws Exception {
        // add entry to patient table that will be updated
        PatientEntity patientEntity = patientRepository
                .save(new PatientEntity("John", "Adams", "cancer"));
        assertEquals("John", patientEntity.getFirstName());
        assertEquals("Adams", patientEntity.getLastName());
        assertEquals("cancer", patientEntity.getMedicalCondition());

        // update entry
        Patient patient = Patient.newBuilder()
                .setId(patientEntity.getId())
                .setFirstName("newFirstName")
                .setLastName("newLastName")
                .setMedicalCondition("newCancer")
                .build();
        FieldMask updateMask = FieldMask.newBuilder()
                .addPaths("medical_condition")
                .build();
        UpdatePatientRequest request = UpdatePatientRequest.newBuilder()
                .setPatient(patient)
                .setUpdateMask(updateMask)
                .build();
        StreamRecorder<Patient> responseObserver = StreamRecorder.create();
        grpcPatientService.updatePatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Patient> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Patient response = results.get(0);
        assertEquals("John", response.getFirstName());
        assertEquals("Adams", response.getLastName());
        assertEquals("newCancer", response.getMedicalCondition());
    }

    @Test
    public void testDeletePatient() throws Exception {
        // no entries in the patient table at first
        assertEquals(0, patientRepository.findAll().size());

        // add entry to patient table
        PatientEntity patientEntity = patientRepository
                .save(new PatientEntity("John", "Adams", "cancer"));

        // delete newly added patient entry
        DeletePatientRequest request = DeletePatientRequest.newBuilder()
                .setPatientId(patientEntity.getId())
                .build();
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();
        grpcPatientService.deletePatient(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Empty> results = responseObserver.getValues();
        assertEquals(0, results.size());
    }
}
