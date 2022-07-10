package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.hospital.HospitalRepository;
import com.almeidavc.grpcbackend.patient.PatientEntity;
import com.almeidavc.grpcbackend.patient.PatientRepository;
import com.almeidavc.grpcbackend.lib.Patient;
import com.almeidavc.grpcbackend.lib.Hospital;
import com.almeidavc.grpcbackend.lib.PatientHospitalRelationshipServiceGrpc;
import com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest;
import com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest;
import com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse;
import com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest;
import com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class GrpcPatientHospitalRelationshipService extends PatientHospitalRelationshipServiceGrpc.PatientHospitalRelationshipServiceImplBase {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public void registerPatientInHospital(RegisterPatientInHospitalRequest request, StreamObserver<Empty> responseObserver) {
        PatientEntity patientEntity = patientRepository.findById(request.getPatientId()).get();
        HospitalEntity hospitalEntity = hospitalRepository.findById(request.getHospitalId()).get();
        patientEntity.getHospitals().add(hospitalEntity);
        patientRepository.save(patientEntity);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void listPatientsByHospital(ListPatientsByHospitalRequest request, StreamObserver<ListPatientsByHospitalResponse> responseObserver) {
        HospitalEntity hospitalEntity = hospitalRepository.findById(request.getHospitalId()).get();
        List<Patient> patients = new ArrayList<>();
        hospitalEntity.getPatients().forEach(patientEntity -> patients.add(patientEntity.mapToGrpcInterface()));

        // send response
        ListPatientsByHospitalResponse reply = ListPatientsByHospitalResponse.newBuilder()
                .addAllPatients(patients)
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void listHospitalsByPatient(ListHospitalsByPatientRequest request, StreamObserver<ListHospitalsByPatientResponse> responseObserver) {
        PatientEntity patientEntity = patientRepository.findById(request.getPatientId()).get();
        List<Hospital> hospitals = new ArrayList<>();
        patientEntity.getHospitals().forEach(hospitalEntity -> hospitals.add(hospitalEntity.mapToGrpcInterface()));

        // send response
        ListHospitalsByPatientResponse reply = ListHospitalsByPatientResponse.newBuilder()
                .addAllHospitals(hospitals)
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
