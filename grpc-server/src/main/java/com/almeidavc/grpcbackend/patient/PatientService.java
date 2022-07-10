package com.almeidavc.grpcbackend.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public void deletePatient(PatientEntity patientEntity) {
        patientEntity.deleteAssociatedHospitals();
        patientRepository.save(patientEntity);
        patientRepository.delete(patientEntity);
    }

    public void deletePatientById(long id) {
        deletePatient(patientRepository.findById(id).get());
    }
}
