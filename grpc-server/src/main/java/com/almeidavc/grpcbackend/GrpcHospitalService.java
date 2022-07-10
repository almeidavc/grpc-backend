package com.almeidavc.grpcbackend;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;
import com.almeidavc.grpcbackend.hospital.HospitalRepository;
import com.almeidavc.grpcbackend.hospital.HospitalService;
import com.almeidavc.grpcbackend.lib.Hospital;
import com.almeidavc.grpcbackend.lib.HospitalServiceGrpc;
import com.almeidavc.grpcbackend.lib.CreateHospitalRequest;
import com.almeidavc.grpcbackend.lib.UpdateHospitalRequest;
import com.almeidavc.grpcbackend.lib.DeleteHospitalRequest;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GrpcHospitalService extends HospitalServiceGrpc.HospitalServiceImplBase {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private HospitalService hospitalService;

    @Override
    public void createHospital(CreateHospitalRequest request, StreamObserver<Hospital> responseObserver) {
        HospitalEntity hospitalEntity = hospitalRepository
                .save(new HospitalEntity(request.getHospitalTitle(), request.getHospitalAddress()));

        Hospital reply = hospitalEntity.mapToGrpcInterface();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void updateHospital(UpdateHospitalRequest request, StreamObserver<Hospital> responseObserver) {
        Hospital hospital = request.getHospital();

        HospitalEntity hospitalEntity = hospitalRepository.findById(hospital.getId()).get();

        if (request.hasUpdateMask()) {
            for (String fieldPath : request.getUpdateMask().getPathsList()) {
                switch (fieldPath) {
                    case "title":
                        hospitalEntity.setTitle(hospital.getTitle());
                        break;
                    case "address":
                        hospitalEntity.setAddress(hospital.getAddress());
                        break;
                }
            }
        } else {
            hospitalEntity.setTitle(hospital.getTitle());
            hospitalEntity.setAddress(hospital.getAddress());
        }

        hospitalRepository.save(hospitalEntity);

        Hospital reply = hospitalEntity.mapToGrpcInterface();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteHospital(DeleteHospitalRequest request, StreamObserver<Empty> responseObserver) {
        hospitalService.deleteHospitalById(request.getHospitalId());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}