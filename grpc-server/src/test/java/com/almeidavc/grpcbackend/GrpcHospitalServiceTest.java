package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.hospital.HospitalRepository;
import com.almeidavc.grpcbackend.lib.Hospital;
import com.almeidavc.grpcbackend.lib.CreateHospitalRequest;
import com.almeidavc.grpcbackend.lib.UpdateHospitalRequest;
import com.almeidavc.grpcbackend.lib.DeleteHospitalRequest;

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
public class GrpcHospitalServiceTest {
    @Autowired
    private GrpcHospitalService grpcHospitalService;
    @Autowired
    private HospitalRepository hospitalRepository;

    @BeforeEach
    public void deleteAllEntriesFromRepository() {
        hospitalRepository.deleteAll();
    }

    @Test
    public void testCreateHospital() throws Exception {
        CreateHospitalRequest request = CreateHospitalRequest.newBuilder()
                .setHospitalTitle("h1")
                .setHospitalAddress("test address 404")
                .build();
        StreamRecorder<Hospital> responseObserver = StreamRecorder.create();
        grpcHospitalService.createHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Hospital> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Hospital response = results.get(0);
        assertEquals("h1", response.getTitle());
        assertEquals("test address 404", response.getAddress());
    }

    @Test
    public void testUpdateHospitalNoMask() throws Exception {
        // add entry to hospital table that will be updated
        HospitalEntity hospitalEntity = hospitalRepository
                .save(new HospitalEntity("h1", "test address 404"));
        assertEquals("h1", hospitalEntity.getTitle());
        assertEquals("test address 404", hospitalEntity.getAddress());

        // update entry
        Hospital hospital = Hospital.newBuilder()
                .setId(hospitalEntity.getId())
                .setTitle("newTitle")
                .setAddress("newAddress")
                .build();
        UpdateHospitalRequest request = UpdateHospitalRequest.newBuilder()
                .setHospital(hospital)
                .build();
        StreamRecorder<Hospital> responseObserver = StreamRecorder.create();
        grpcHospitalService.updateHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Hospital> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Hospital response = results.get(0);
        assertEquals("newTitle", response.getTitle());
        assertEquals("newAddress", response.getAddress());
    }

    @Test
    public void testUpdateHospitalWithMask() throws Exception {
        // add entry to hospital table that will be updated
        HospitalEntity hospitalEntity = hospitalRepository
                .save(new HospitalEntity("h1", "test address 404"));
        assertEquals("h1", hospitalEntity.getTitle());
        assertEquals("test address 404", hospitalEntity.getAddress());

        // update entry
        Hospital hospital = Hospital.newBuilder()
                .setId(hospitalEntity.getId())
                .setTitle("newTitle")
                .setAddress("newAddress")
                .build();
        FieldMask updateMask = FieldMask.newBuilder()
                .addPaths("title")
                .build();
        UpdateHospitalRequest request = UpdateHospitalRequest.newBuilder()
                .setHospital(hospital)
                .setUpdateMask(updateMask)
                .build();
        StreamRecorder<Hospital> responseObserver = StreamRecorder.create();
        grpcHospitalService.updateHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Hospital> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Hospital response = results.get(0);
        assertEquals("newTitle", response.getTitle());
        assertEquals("test address 404", response.getAddress());
    }

    @Test
    public void testDeleteHospital() throws Exception {
        // no entries in the hospital table at first
        assertEquals(0, hospitalRepository.findAll().size());

        // add entry to hospital table
        HospitalEntity hospitalEntity = hospitalRepository
                .save(new HospitalEntity("h1", "test address 404"));

        // delete newly added hospital entry
        DeleteHospitalRequest request = DeleteHospitalRequest.newBuilder()
                .setHospitalId(hospitalEntity.getId())
                .build();
        StreamRecorder<Empty> responseObserver = StreamRecorder.create();
        grpcHospitalService.deleteHospital(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Empty> results = responseObserver.getValues();
        assertEquals(0, results.size());
    }
}
