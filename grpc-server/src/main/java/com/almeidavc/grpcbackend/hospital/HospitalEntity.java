package com.almeidavc.grpcbackend.hospital;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import com.almeidavc.grpcbackend.lib.Hospital;
import com.almeidavc.grpcbackend.patient.PatientEntity;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "hospitals")
    private Set<PatientEntity> patients = new HashSet<>();

    protected HospitalEntity() {}

    public HospitalEntity(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public Hospital mapToGrpcInterface() {
        return Hospital.newBuilder()
                .setId(id)
                .setTitle(title)
                .setAddress(address)
                .build();
    }

    public String toString() {
        return "Hospital{id=" + id + ", title=" + title + ", address=" + address + "}";
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<PatientEntity> getPatients() {
        return patients;
    }

    public void setPatients(Set<PatientEntity> patients) {
        this.patients = patients;
    }
}
