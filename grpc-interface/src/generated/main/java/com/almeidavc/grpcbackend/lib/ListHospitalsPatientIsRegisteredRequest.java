// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patient.proto

package com.almeidavc.grpcbackend.lib;

/**
 * Protobuf type {@code com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest}
 */
public final class ListHospitalsPatientIsRegisteredRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest)
    ListHospitalsPatientIsRegisteredRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHospitalsPatientIsRegisteredRequest.newBuilder() to construct.
  private ListHospitalsPatientIsRegisteredRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHospitalsPatientIsRegisteredRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHospitalsPatientIsRegisteredRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListHospitalsPatientIsRegisteredRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            patientId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.almeidavc.grpcbackend.lib.PatientOuterClass.internal_static_com_almeidavc_grpcbackend_ListHospitalsPatientIsRegisteredRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.almeidavc.grpcbackend.lib.PatientOuterClass.internal_static_com_almeidavc_grpcbackend_ListHospitalsPatientIsRegisteredRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.class, com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.Builder.class);
  }

  public static final int PATIENT_ID_FIELD_NUMBER = 1;
  private long patientId_;
  /**
   * <code>int64 patient_id = 1;</code>
   * @return The patientId.
   */
  @java.lang.Override
  public long getPatientId() {
    return patientId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (patientId_ != 0L) {
      output.writeInt64(1, patientId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (patientId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, patientId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest)) {
      return super.equals(obj);
    }
    com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest other = (com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest) obj;

    if (getPatientId()
        != other.getPatientId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPatientId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest)
      com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.almeidavc.grpcbackend.lib.PatientOuterClass.internal_static_com_almeidavc_grpcbackend_ListHospitalsPatientIsRegisteredRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.almeidavc.grpcbackend.lib.PatientOuterClass.internal_static_com_almeidavc_grpcbackend_ListHospitalsPatientIsRegisteredRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.class, com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.Builder.class);
    }

    // Construct using com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      patientId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.almeidavc.grpcbackend.lib.PatientOuterClass.internal_static_com_almeidavc_grpcbackend_ListHospitalsPatientIsRegisteredRequest_descriptor;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest getDefaultInstanceForType() {
      return com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest build() {
      com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest buildPartial() {
      com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest result = new com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest(this);
      result.patientId_ = patientId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest) {
        return mergeFrom((com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest other) {
      if (other == com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest.getDefaultInstance()) return this;
      if (other.getPatientId() != 0L) {
        setPatientId(other.getPatientId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long patientId_ ;
    /**
     * <code>int64 patient_id = 1;</code>
     * @return The patientId.
     */
    @java.lang.Override
    public long getPatientId() {
      return patientId_;
    }
    /**
     * <code>int64 patient_id = 1;</code>
     * @param value The patientId to set.
     * @return This builder for chaining.
     */
    public Builder setPatientId(long value) {
      
      patientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 patient_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPatientId() {
      
      patientId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest)
  }

  // @@protoc_insertion_point(class_scope:com.almeidavc.grpcbackend.ListHospitalsPatientIsRegisteredRequest)
  private static final com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest();
  }

  public static com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHospitalsPatientIsRegisteredRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListHospitalsPatientIsRegisteredRequest>() {
    @java.lang.Override
    public ListHospitalsPatientIsRegisteredRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListHospitalsPatientIsRegisteredRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListHospitalsPatientIsRegisteredRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHospitalsPatientIsRegisteredRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.almeidavc.grpcbackend.lib.ListHospitalsPatientIsRegisteredRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
