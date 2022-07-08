package com.almeidavc.grpcbackend.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private String address;

    protected HospitalEntity() {}

    public HospitalEntity(String title, String address) {
        this.title = title;
        this.address = address;
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
}
