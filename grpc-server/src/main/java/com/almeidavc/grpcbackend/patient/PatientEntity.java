package com.almeidavc.grpcbackend.patient;

import com.almeidavc.grpcbackend.hospital.HospitalEntity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.almeidavc.grpcbackend.lib.Hospital;
import com.almeidavc.grpcbackend.lib.Patient;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class PatientEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String medicalCondition;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "patients_hospitals",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "hospital_id"))
    private Set<HospitalEntity> hospitals = new HashSet<>();

    protected PatientEntity() {}

    public PatientEntity(String firstName, String lastName, String medicalCondition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalCondition = medicalCondition;
    }

    public Patient mapToGrpcInterface() {
        return Patient.newBuilder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMedicalCondition(medicalCondition)
                .build();
    }

    public void deleteAssociatedHospitals() {
        hospitals.clear();
    }

    public String toString() {
        return "Patient{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", medicalCondition=" + medicalCondition + "}";
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public Set<HospitalEntity> getHospitals() {
        return hospitals;
    }

    public void setHospitals(Set<HospitalEntity> hospitals) {
        this.hospitals = hospitals;
    }
}
