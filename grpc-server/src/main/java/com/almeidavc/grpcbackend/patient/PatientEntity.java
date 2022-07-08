package com.almeidavc.grpcbackend.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

    protected PatientEntity() {}

    public PatientEntity(String firstName, String lastName, String medicalCondition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalCondition = medicalCondition;
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
}
