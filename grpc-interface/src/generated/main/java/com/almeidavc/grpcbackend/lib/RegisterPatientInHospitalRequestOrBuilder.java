// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patient_hospital_rel.proto

package com.almeidavc.grpcbackend.lib;

public interface RegisterPatientInHospitalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.almeidavc.grpcbackend.RegisterPatientInHospitalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 patient_id = 1;</code>
   * @return The patientId.
   */
  long getPatientId();

  /**
   * <code>int64 hospital_id = 2;</code>
   * @return The hospitalId.
   */
  long getHospitalId();
}
