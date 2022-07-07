// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: patient_hospital_rel.proto

package com.almeidavc.grpcbackend.lib;

/**
 * Protobuf type {@code com.almeidavc.grpcbackend.ListHospitalsByPatientResponse}
 */
public final class ListHospitalsByPatientResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.almeidavc.grpcbackend.ListHospitalsByPatientResponse)
    ListHospitalsByPatientResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHospitalsByPatientResponse.newBuilder() to construct.
  private ListHospitalsByPatientResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHospitalsByPatientResponse() {
    hospitals_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHospitalsByPatientResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListHospitalsByPatientResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hospitals_ = new java.util.ArrayList<com.almeidavc.grpcbackend.lib.Hospital>();
              mutable_bitField0_ |= 0x00000001;
            }
            hospitals_.add(
                input.readMessage(com.almeidavc.grpcbackend.lib.Hospital.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        hospitals_ = java.util.Collections.unmodifiableList(hospitals_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.almeidavc.grpcbackend.lib.PatientHospitalRel.internal_static_com_almeidavc_grpcbackend_ListHospitalsByPatientResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.almeidavc.grpcbackend.lib.PatientHospitalRel.internal_static_com_almeidavc_grpcbackend_ListHospitalsByPatientResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.class, com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.Builder.class);
  }

  public static final int HOSPITALS_FIELD_NUMBER = 1;
  private java.util.List<com.almeidavc.grpcbackend.lib.Hospital> hospitals_;
  /**
   * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.almeidavc.grpcbackend.lib.Hospital> getHospitalsList() {
    return hospitals_;
  }
  /**
   * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.almeidavc.grpcbackend.lib.HospitalOrBuilder> 
      getHospitalsOrBuilderList() {
    return hospitals_;
  }
  /**
   * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
   */
  @java.lang.Override
  public int getHospitalsCount() {
    return hospitals_.size();
  }
  /**
   * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
   */
  @java.lang.Override
  public com.almeidavc.grpcbackend.lib.Hospital getHospitals(int index) {
    return hospitals_.get(index);
  }
  /**
   * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
   */
  @java.lang.Override
  public com.almeidavc.grpcbackend.lib.HospitalOrBuilder getHospitalsOrBuilder(
      int index) {
    return hospitals_.get(index);
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
    for (int i = 0; i < hospitals_.size(); i++) {
      output.writeMessage(1, hospitals_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hospitals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hospitals_.get(i));
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
    if (!(obj instanceof com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse)) {
      return super.equals(obj);
    }
    com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse other = (com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse) obj;

    if (!getHospitalsList()
        .equals(other.getHospitalsList())) return false;
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
    if (getHospitalsCount() > 0) {
      hash = (37 * hash) + HOSPITALS_FIELD_NUMBER;
      hash = (53 * hash) + getHospitalsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parseFrom(
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
  public static Builder newBuilder(com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse prototype) {
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
   * Protobuf type {@code com.almeidavc.grpcbackend.ListHospitalsByPatientResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.almeidavc.grpcbackend.ListHospitalsByPatientResponse)
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.almeidavc.grpcbackend.lib.PatientHospitalRel.internal_static_com_almeidavc_grpcbackend_ListHospitalsByPatientResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.almeidavc.grpcbackend.lib.PatientHospitalRel.internal_static_com_almeidavc_grpcbackend_ListHospitalsByPatientResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.class, com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.Builder.class);
    }

    // Construct using com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.newBuilder()
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
        getHospitalsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hospitalsBuilder_ == null) {
        hospitals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hospitalsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.almeidavc.grpcbackend.lib.PatientHospitalRel.internal_static_com_almeidavc_grpcbackend_ListHospitalsByPatientResponse_descriptor;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse getDefaultInstanceForType() {
      return com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse build() {
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse buildPartial() {
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse result = new com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse(this);
      int from_bitField0_ = bitField0_;
      if (hospitalsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hospitals_ = java.util.Collections.unmodifiableList(hospitals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hospitals_ = hospitals_;
      } else {
        result.hospitals_ = hospitalsBuilder_.build();
      }
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
      if (other instanceof com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse) {
        return mergeFrom((com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse other) {
      if (other == com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.getDefaultInstance()) return this;
      if (hospitalsBuilder_ == null) {
        if (!other.hospitals_.isEmpty()) {
          if (hospitals_.isEmpty()) {
            hospitals_ = other.hospitals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHospitalsIsMutable();
            hospitals_.addAll(other.hospitals_);
          }
          onChanged();
        }
      } else {
        if (!other.hospitals_.isEmpty()) {
          if (hospitalsBuilder_.isEmpty()) {
            hospitalsBuilder_.dispose();
            hospitalsBuilder_ = null;
            hospitals_ = other.hospitals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hospitalsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHospitalsFieldBuilder() : null;
          } else {
            hospitalsBuilder_.addAllMessages(other.hospitals_);
          }
        }
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
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.almeidavc.grpcbackend.lib.Hospital> hospitals_ =
      java.util.Collections.emptyList();
    private void ensureHospitalsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hospitals_ = new java.util.ArrayList<com.almeidavc.grpcbackend.lib.Hospital>(hospitals_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.almeidavc.grpcbackend.lib.Hospital, com.almeidavc.grpcbackend.lib.Hospital.Builder, com.almeidavc.grpcbackend.lib.HospitalOrBuilder> hospitalsBuilder_;

    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public java.util.List<com.almeidavc.grpcbackend.lib.Hospital> getHospitalsList() {
      if (hospitalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hospitals_);
      } else {
        return hospitalsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public int getHospitalsCount() {
      if (hospitalsBuilder_ == null) {
        return hospitals_.size();
      } else {
        return hospitalsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public com.almeidavc.grpcbackend.lib.Hospital getHospitals(int index) {
      if (hospitalsBuilder_ == null) {
        return hospitals_.get(index);
      } else {
        return hospitalsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder setHospitals(
        int index, com.almeidavc.grpcbackend.lib.Hospital value) {
      if (hospitalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHospitalsIsMutable();
        hospitals_.set(index, value);
        onChanged();
      } else {
        hospitalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder setHospitals(
        int index, com.almeidavc.grpcbackend.lib.Hospital.Builder builderForValue) {
      if (hospitalsBuilder_ == null) {
        ensureHospitalsIsMutable();
        hospitals_.set(index, builderForValue.build());
        onChanged();
      } else {
        hospitalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder addHospitals(com.almeidavc.grpcbackend.lib.Hospital value) {
      if (hospitalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHospitalsIsMutable();
        hospitals_.add(value);
        onChanged();
      } else {
        hospitalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder addHospitals(
        int index, com.almeidavc.grpcbackend.lib.Hospital value) {
      if (hospitalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHospitalsIsMutable();
        hospitals_.add(index, value);
        onChanged();
      } else {
        hospitalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder addHospitals(
        com.almeidavc.grpcbackend.lib.Hospital.Builder builderForValue) {
      if (hospitalsBuilder_ == null) {
        ensureHospitalsIsMutable();
        hospitals_.add(builderForValue.build());
        onChanged();
      } else {
        hospitalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder addHospitals(
        int index, com.almeidavc.grpcbackend.lib.Hospital.Builder builderForValue) {
      if (hospitalsBuilder_ == null) {
        ensureHospitalsIsMutable();
        hospitals_.add(index, builderForValue.build());
        onChanged();
      } else {
        hospitalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder addAllHospitals(
        java.lang.Iterable<? extends com.almeidavc.grpcbackend.lib.Hospital> values) {
      if (hospitalsBuilder_ == null) {
        ensureHospitalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hospitals_);
        onChanged();
      } else {
        hospitalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder clearHospitals() {
      if (hospitalsBuilder_ == null) {
        hospitals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hospitalsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public Builder removeHospitals(int index) {
      if (hospitalsBuilder_ == null) {
        ensureHospitalsIsMutable();
        hospitals_.remove(index);
        onChanged();
      } else {
        hospitalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public com.almeidavc.grpcbackend.lib.Hospital.Builder getHospitalsBuilder(
        int index) {
      return getHospitalsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public com.almeidavc.grpcbackend.lib.HospitalOrBuilder getHospitalsOrBuilder(
        int index) {
      if (hospitalsBuilder_ == null) {
        return hospitals_.get(index);  } else {
        return hospitalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public java.util.List<? extends com.almeidavc.grpcbackend.lib.HospitalOrBuilder> 
         getHospitalsOrBuilderList() {
      if (hospitalsBuilder_ != null) {
        return hospitalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hospitals_);
      }
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public com.almeidavc.grpcbackend.lib.Hospital.Builder addHospitalsBuilder() {
      return getHospitalsFieldBuilder().addBuilder(
          com.almeidavc.grpcbackend.lib.Hospital.getDefaultInstance());
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public com.almeidavc.grpcbackend.lib.Hospital.Builder addHospitalsBuilder(
        int index) {
      return getHospitalsFieldBuilder().addBuilder(
          index, com.almeidavc.grpcbackend.lib.Hospital.getDefaultInstance());
    }
    /**
     * <code>repeated .com.almeidavc.grpcbackend.Hospital hospitals = 1;</code>
     */
    public java.util.List<com.almeidavc.grpcbackend.lib.Hospital.Builder> 
         getHospitalsBuilderList() {
      return getHospitalsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.almeidavc.grpcbackend.lib.Hospital, com.almeidavc.grpcbackend.lib.Hospital.Builder, com.almeidavc.grpcbackend.lib.HospitalOrBuilder> 
        getHospitalsFieldBuilder() {
      if (hospitalsBuilder_ == null) {
        hospitalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.almeidavc.grpcbackend.lib.Hospital, com.almeidavc.grpcbackend.lib.Hospital.Builder, com.almeidavc.grpcbackend.lib.HospitalOrBuilder>(
                hospitals_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hospitals_ = null;
      }
      return hospitalsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.almeidavc.grpcbackend.ListHospitalsByPatientResponse)
  }

  // @@protoc_insertion_point(class_scope:com.almeidavc.grpcbackend.ListHospitalsByPatientResponse)
  private static final com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse();
  }

  public static com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHospitalsByPatientResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListHospitalsByPatientResponse>() {
    @java.lang.Override
    public ListHospitalsByPatientResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListHospitalsByPatientResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListHospitalsByPatientResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHospitalsByPatientResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

