package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.patient.PatientEntity;
import com.almeidavc.grpcbackend.patient.PatientRepository;
import com.almeidavc.grpcbackend.lib.Patient;
import com.almeidavc.grpcbackend.lib.PatientServiceGrpc;
import com.almeidavc.grpcbackend.lib.CreatePatientRequest;
import com.almeidavc.grpcbackend.lib.UpdatePatientRequest;
import com.almeidavc.grpcbackend.lib.DeletePatientRequest;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GrpcPatientService extends PatientServiceGrpc.PatientServiceImplBase {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void createPatient(CreatePatientRequest request, StreamObserver<Patient> responseObserver) {
        PatientEntity patientEntity = patientRepository
                .save(new PatientEntity(
                        request.getPatientFirstName(),
                        request.getPatientLastName(),
                        request.getPatientMedicalCondition()
                ));

        Patient reply = Patient.newBuilder()
                .setId(patientEntity.getId())
                .setFirstName(patientEntity.getFirstName())
                .setLastName(patientEntity.getLastName())
                .setMedicalCondition(patientEntity.getMedicalCondition())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void updatePatient(UpdatePatientRequest request, StreamObserver<Patient> responseObserver) {
        Patient patient = request.getPatient();

        PatientEntity patientEntity = patientRepository.findById(patient.getId()).get();

        if (request.hasUpdateMask()) {
            for (String fieldPath : request.getUpdateMask().getPathsList()) {
                switch (fieldPath) {
                    case "first_name":
                        patientEntity.setFirstName(patient.getFirstName());
                        break;
                    case "last_name":
                        patientEntity.setLastName(patient.getLastName());
                        break;
                    case "medical_condition":
                        patientEntity.setMedicalCondition(patient.getMedicalCondition());
                        break;
                }
            }
        } else {
            patientEntity.setFirstName(patient.getFirstName());
            patientEntity.setLastName(patient.getLastName());
            patientEntity.setMedicalCondition(patient.getMedicalCondition());
        }

        patientRepository.save(patientEntity);

        Patient reply = Patient.newBuilder()
                .setId(patientEntity.getId())
                .setFirstName(patientEntity.getFirstName())
                .setLastName(patientEntity.getLastName())
                .setMedicalCondition(patientEntity.getMedicalCondition())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deletePatient(DeletePatientRequest request, StreamObserver<Empty> responseObserver) {
        patientRepository.deleteById(request.getPatientId());
        responseObserver.onCompleted();
    }
}