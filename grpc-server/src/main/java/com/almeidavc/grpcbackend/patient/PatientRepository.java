package com.almeidavc.grpcbackend.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
    void deleteById(long id);
}