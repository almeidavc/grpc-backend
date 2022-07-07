package com.almeidavc.grpcbackend.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: patient.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "com.almeidavc.grpcbackend.PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreatePatientRequest,
      com.almeidavc.grpcbackend.lib.Patient> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.almeidavc.grpcbackend.lib.CreatePatientRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.Patient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreatePatientRequest,
      com.almeidavc.grpcbackend.lib.Patient> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreatePatientRequest, com.almeidavc.grpcbackend.lib.Patient> getCreatePatientMethod;
    if ((getCreatePatientMethod = PatientServiceGrpc.getCreatePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getCreatePatientMethod = PatientServiceGrpc.getCreatePatientMethod) == null) {
          PatientServiceGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.CreatePatientRequest, com.almeidavc.grpcbackend.lib.Patient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.CreatePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.Patient.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdatePatientRequest,
      com.almeidavc.grpcbackend.lib.Patient> getUpdatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePatient",
      requestType = com.almeidavc.grpcbackend.lib.UpdatePatientRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.Patient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdatePatientRequest,
      com.almeidavc.grpcbackend.lib.Patient> getUpdatePatientMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdatePatientRequest, com.almeidavc.grpcbackend.lib.Patient> getUpdatePatientMethod;
    if ((getUpdatePatientMethod = PatientServiceGrpc.getUpdatePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getUpdatePatientMethod = PatientServiceGrpc.getUpdatePatientMethod) == null) {
          PatientServiceGrpc.getUpdatePatientMethod = getUpdatePatientMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.UpdatePatientRequest, com.almeidavc.grpcbackend.lib.Patient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.UpdatePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.Patient.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("UpdatePatient"))
              .build();
        }
      }
    }
    return getUpdatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeletePatientRequest,
      com.google.protobuf.Empty> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePatient",
      requestType = com.almeidavc.grpcbackend.lib.DeletePatientRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeletePatientRequest,
      com.google.protobuf.Empty> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeletePatientRequest, com.google.protobuf.Empty> getDeletePatientMethod;
    if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
          PatientServiceGrpc.getDeletePatientMethod = getDeletePatientMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.DeletePatientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.DeletePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("DeletePatient"))
              .build();
        }
      }
    }
    return getDeletePatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub>() {
        @java.lang.Override
        public PatientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceStub(channel, callOptions);
        }
      };
    return PatientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub>() {
        @java.lang.Override
        public PatientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub>() {
        @java.lang.Override
        public PatientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceFutureStub(channel, callOptions);
        }
      };
    return PatientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPatient(com.almeidavc.grpcbackend.lib.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     */
    public void updatePatient(com.almeidavc.grpcbackend.lib.UpdatePatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePatientMethod(), responseObserver);
    }

    /**
     */
    public void deletePatient(com.almeidavc.grpcbackend.lib.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.CreatePatientRequest,
                com.almeidavc.grpcbackend.lib.Patient>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            getUpdatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.UpdatePatientRequest,
                com.almeidavc.grpcbackend.lib.Patient>(
                  this, METHODID_UPDATE_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.DeletePatientRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PATIENT)))
          .build();
    }
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientServiceStub> {
    private PatientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPatient(com.almeidavc.grpcbackend.lib.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePatient(com.almeidavc.grpcbackend.lib.UpdatePatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePatient(com.almeidavc.grpcbackend.lib.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.Patient createPatient(com.almeidavc.grpcbackend.lib.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.Patient updatePatient(com.almeidavc.grpcbackend.lib.UpdatePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePatient(com.almeidavc.grpcbackend.lib.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.Patient> createPatient(
        com.almeidavc.grpcbackend.lib.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.Patient> updatePatient(
        com.almeidavc.grpcbackend.lib.UpdatePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePatient(
        com.almeidavc.grpcbackend.lib.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PATIENT = 0;
  private static final int METHODID_UPDATE_PATIENT = 1;
  private static final int METHODID_DELETE_PATIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.almeidavc.grpcbackend.lib.CreatePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient>) responseObserver);
          break;
        case METHODID_UPDATE_PATIENT:
          serviceImpl.updatePatient((com.almeidavc.grpcbackend.lib.UpdatePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Patient>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((com.almeidavc.grpcbackend.lib.DeletePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.almeidavc.grpcbackend.lib.PatientOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getCreatePatientMethod())
              .addMethod(getUpdatePatientMethod())
              .addMethod(getDeletePatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
