package com.almeidavc.grpcbackend.hospital;

import com.almeidavc.grpcbackend.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;

    public void deleteHospital(HospitalEntity hospitalEntity) {
        hospitalEntity.getPatients().forEach(patientEntity -> {
            patientEntity.getHospitals().remove(hospitalEntity);
            patientRepository.save(patientEntity);
        });
        hospitalRepository.delete(hospitalEntity);
    }

    public void deleteHospitalById(long id) {
        deleteHospital(hospitalRepository.findById(id).get());
    }
}
