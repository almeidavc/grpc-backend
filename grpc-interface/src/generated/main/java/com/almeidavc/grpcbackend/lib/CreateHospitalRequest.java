// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hospital.proto

package com.almeidavc.grpcbackend.lib;

/**
 * Protobuf type {@code com.almeidavc.grpcbackend.CreateHospitalRequest}
 */
public final class CreateHospitalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.almeidavc.grpcbackend.CreateHospitalRequest)
    CreateHospitalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateHospitalRequest.newBuilder() to construct.
  private CreateHospitalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateHospitalRequest() {
    hospitalTitle_ = "";
    hospitalAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateHospitalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateHospitalRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            hospitalTitle_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            hospitalAddress_ = s;
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
    return com.almeidavc.grpcbackend.lib.HospitalOuterClass.internal_static_com_almeidavc_grpcbackend_CreateHospitalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.almeidavc.grpcbackend.lib.HospitalOuterClass.internal_static_com_almeidavc_grpcbackend_CreateHospitalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.almeidavc.grpcbackend.lib.CreateHospitalRequest.class, com.almeidavc.grpcbackend.lib.CreateHospitalRequest.Builder.class);
  }

  public static final int HOSPITAL_TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object hospitalTitle_;
  /**
   * <code>string hospital_title = 1;</code>
   * @return The hospitalTitle.
   */
  @java.lang.Override
  public java.lang.String getHospitalTitle() {
    java.lang.Object ref = hospitalTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hospitalTitle_ = s;
      return s;
    }
  }
  /**
   * <code>string hospital_title = 1;</code>
   * @return The bytes for hospitalTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHospitalTitleBytes() {
    java.lang.Object ref = hospitalTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hospitalTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSPITAL_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object hospitalAddress_;
  /**
   * <code>string hospital_address = 2;</code>
   * @return The hospitalAddress.
   */
  @java.lang.Override
  public java.lang.String getHospitalAddress() {
    java.lang.Object ref = hospitalAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hospitalAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string hospital_address = 2;</code>
   * @return The bytes for hospitalAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHospitalAddressBytes() {
    java.lang.Object ref = hospitalAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hospitalAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hospitalTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hospitalTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hospitalAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hospitalAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hospitalTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hospitalTitle_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hospitalAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, hospitalAddress_);
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
    if (!(obj instanceof com.almeidavc.grpcbackend.lib.CreateHospitalRequest)) {
      return super.equals(obj);
    }
    com.almeidavc.grpcbackend.lib.CreateHospitalRequest other = (com.almeidavc.grpcbackend.lib.CreateHospitalRequest) obj;

    if (!getHospitalTitle()
        .equals(other.getHospitalTitle())) return false;
    if (!getHospitalAddress()
        .equals(other.getHospitalAddress())) return false;
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
    hash = (37 * hash) + HOSPITAL_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getHospitalTitle().hashCode();
    hash = (37 * hash) + HOSPITAL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getHospitalAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest parseFrom(
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
  public static Builder newBuilder(com.almeidavc.grpcbackend.lib.CreateHospitalRequest prototype) {
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
   * Protobuf type {@code com.almeidavc.grpcbackend.CreateHospitalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.almeidavc.grpcbackend.CreateHospitalRequest)
      com.almeidavc.grpcbackend.lib.CreateHospitalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.almeidavc.grpcbackend.lib.HospitalOuterClass.internal_static_com_almeidavc_grpcbackend_CreateHospitalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.almeidavc.grpcbackend.lib.HospitalOuterClass.internal_static_com_almeidavc_grpcbackend_CreateHospitalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.almeidavc.grpcbackend.lib.CreateHospitalRequest.class, com.almeidavc.grpcbackend.lib.CreateHospitalRequest.Builder.class);
    }

    // Construct using com.almeidavc.grpcbackend.lib.CreateHospitalRequest.newBuilder()
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
      hospitalTitle_ = "";

      hospitalAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.almeidavc.grpcbackend.lib.HospitalOuterClass.internal_static_com_almeidavc_grpcbackend_CreateHospitalRequest_descriptor;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.CreateHospitalRequest getDefaultInstanceForType() {
      return com.almeidavc.grpcbackend.lib.CreateHospitalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.CreateHospitalRequest build() {
      com.almeidavc.grpcbackend.lib.CreateHospitalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.almeidavc.grpcbackend.lib.CreateHospitalRequest buildPartial() {
      com.almeidavc.grpcbackend.lib.CreateHospitalRequest result = new com.almeidavc.grpcbackend.lib.CreateHospitalRequest(this);
      result.hospitalTitle_ = hospitalTitle_;
      result.hospitalAddress_ = hospitalAddress_;
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
      if (other instanceof com.almeidavc.grpcbackend.lib.CreateHospitalRequest) {
        return mergeFrom((com.almeidavc.grpcbackend.lib.CreateHospitalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.almeidavc.grpcbackend.lib.CreateHospitalRequest other) {
      if (other == com.almeidavc.grpcbackend.lib.CreateHospitalRequest.getDefaultInstance()) return this;
      if (!other.getHospitalTitle().isEmpty()) {
        hospitalTitle_ = other.hospitalTitle_;
        onChanged();
      }
      if (!other.getHospitalAddress().isEmpty()) {
        hospitalAddress_ = other.hospitalAddress_;
        onChanged();
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
      com.almeidavc.grpcbackend.lib.CreateHospitalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.almeidavc.grpcbackend.lib.CreateHospitalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hospitalTitle_ = "";
    /**
     * <code>string hospital_title = 1;</code>
     * @return The hospitalTitle.
     */
    public java.lang.String getHospitalTitle() {
      java.lang.Object ref = hospitalTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hospitalTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hospital_title = 1;</code>
     * @return The bytes for hospitalTitle.
     */
    public com.google.protobuf.ByteString
        getHospitalTitleBytes() {
      java.lang.Object ref = hospitalTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hospitalTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hospital_title = 1;</code>
     * @param value The hospitalTitle to set.
     * @return This builder for chaining.
     */
    public Builder setHospitalTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hospitalTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hospital_title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHospitalTitle() {
      
      hospitalTitle_ = getDefaultInstance().getHospitalTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string hospital_title = 1;</code>
     * @param value The bytes for hospitalTitle to set.
     * @return This builder for chaining.
     */
    public Builder setHospitalTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hospitalTitle_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hospitalAddress_ = "";
    /**
     * <code>string hospital_address = 2;</code>
     * @return The hospitalAddress.
     */
    public java.lang.String getHospitalAddress() {
      java.lang.Object ref = hospitalAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hospitalAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hospital_address = 2;</code>
     * @return The bytes for hospitalAddress.
     */
    public com.google.protobuf.ByteString
        getHospitalAddressBytes() {
      java.lang.Object ref = hospitalAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hospitalAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hospital_address = 2;</code>
     * @param value The hospitalAddress to set.
     * @return This builder for chaining.
     */
    public Builder setHospitalAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hospitalAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hospital_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHospitalAddress() {
      
      hospitalAddress_ = getDefaultInstance().getHospitalAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string hospital_address = 2;</code>
     * @param value The bytes for hospitalAddress to set.
     * @return This builder for chaining.
     */
    public Builder setHospitalAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hospitalAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.almeidavc.grpcbackend.CreateHospitalRequest)
  }

  // @@protoc_insertion_point(class_scope:com.almeidavc.grpcbackend.CreateHospitalRequest)
  private static final com.almeidavc.grpcbackend.lib.CreateHospitalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.almeidavc.grpcbackend.lib.CreateHospitalRequest();
  }

  public static com.almeidavc.grpcbackend.lib.CreateHospitalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateHospitalRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateHospitalRequest>() {
    @java.lang.Override
    public CreateHospitalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateHospitalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateHospitalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateHospitalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.almeidavc.grpcbackend.lib.CreateHospitalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

