package com.almeidavc.grpcbackend.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: patient_hospital_rel.proto")
public final class PatientHospitalRelationshipServiceGrpc {

  private PatientHospitalRelationshipServiceGrpc() {}

  public static final String SERVICE_NAME = "com.almeidavc.grpcbackend.PatientHospitalRelationshipService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest,
      com.google.protobuf.Empty> getRegisterPatientInHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPatientInHospital",
      requestType = com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest,
      com.google.protobuf.Empty> getRegisterPatientInHospitalMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest, com.google.protobuf.Empty> getRegisterPatientInHospitalMethod;
    if ((getRegisterPatientInHospitalMethod = PatientHospitalRelationshipServiceGrpc.getRegisterPatientInHospitalMethod) == null) {
      synchronized (PatientHospitalRelationshipServiceGrpc.class) {
        if ((getRegisterPatientInHospitalMethod = PatientHospitalRelationshipServiceGrpc.getRegisterPatientInHospitalMethod) == null) {
          PatientHospitalRelationshipServiceGrpc.getRegisterPatientInHospitalMethod = getRegisterPatientInHospitalMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPatientInHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PatientHospitalRelationshipServiceMethodDescriptorSupplier("RegisterPatientInHospital"))
              .build();
        }
      }
    }
    return getRegisterPatientInHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest,
      com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> getListPatientsByHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPatientsByHospital",
      requestType = com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest,
      com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> getListPatientsByHospitalMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest, com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> getListPatientsByHospitalMethod;
    if ((getListPatientsByHospitalMethod = PatientHospitalRelationshipServiceGrpc.getListPatientsByHospitalMethod) == null) {
      synchronized (PatientHospitalRelationshipServiceGrpc.class) {
        if ((getListPatientsByHospitalMethod = PatientHospitalRelationshipServiceGrpc.getListPatientsByHospitalMethod) == null) {
          PatientHospitalRelationshipServiceGrpc.getListPatientsByHospitalMethod = getListPatientsByHospitalMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest, com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPatientsByHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientHospitalRelationshipServiceMethodDescriptorSupplier("ListPatientsByHospital"))
              .build();
        }
      }
    }
    return getListPatientsByHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest,
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> getListHospitalsByPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHospitalsByPatient",
      requestType = com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest,
      com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> getListHospitalsByPatientMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest, com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> getListHospitalsByPatientMethod;
    if ((getListHospitalsByPatientMethod = PatientHospitalRelationshipServiceGrpc.getListHospitalsByPatientMethod) == null) {
      synchronized (PatientHospitalRelationshipServiceGrpc.class) {
        if ((getListHospitalsByPatientMethod = PatientHospitalRelationshipServiceGrpc.getListHospitalsByPatientMethod) == null) {
          PatientHospitalRelationshipServiceGrpc.getListHospitalsByPatientMethod = getListHospitalsByPatientMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest, com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHospitalsByPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientHospitalRelationshipServiceMethodDescriptorSupplier("ListHospitalsByPatient"))
              .build();
        }
      }
    }
    return getListHospitalsByPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientHospitalRelationshipServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceStub>() {
        @java.lang.Override
        public PatientHospitalRelationshipServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientHospitalRelationshipServiceStub(channel, callOptions);
        }
      };
    return PatientHospitalRelationshipServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientHospitalRelationshipServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceBlockingStub>() {
        @java.lang.Override
        public PatientHospitalRelationshipServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientHospitalRelationshipServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientHospitalRelationshipServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientHospitalRelationshipServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientHospitalRelationshipServiceFutureStub>() {
        @java.lang.Override
        public PatientHospitalRelationshipServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientHospitalRelationshipServiceFutureStub(channel, callOptions);
        }
      };
    return PatientHospitalRelationshipServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientHospitalRelationshipServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerPatientInHospital(com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPatientInHospitalMethod(), responseObserver);
    }

    /**
     */
    public void listPatientsByHospital(com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPatientsByHospitalMethod(), responseObserver);
    }

    /**
     */
    public void listHospitalsByPatient(com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListHospitalsByPatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterPatientInHospitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_PATIENT_IN_HOSPITAL)))
          .addMethod(
            getListPatientsByHospitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest,
                com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse>(
                  this, METHODID_LIST_PATIENTS_BY_HOSPITAL)))
          .addMethod(
            getListHospitalsByPatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest,
                com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse>(
                  this, METHODID_LIST_HOSPITALS_BY_PATIENT)))
          .build();
    }
  }

  /**
   */
  public static final class PatientHospitalRelationshipServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientHospitalRelationshipServiceStub> {
    private PatientHospitalRelationshipServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientHospitalRelationshipServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientHospitalRelationshipServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerPatientInHospital(com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPatientInHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPatientsByHospital(com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPatientsByHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHospitalsByPatient(com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHospitalsByPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientHospitalRelationshipServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientHospitalRelationshipServiceBlockingStub> {
    private PatientHospitalRelationshipServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientHospitalRelationshipServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientHospitalRelationshipServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty registerPatientInHospital(com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPatientInHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse listPatientsByHospital(com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPatientsByHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse listHospitalsByPatient(com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest request) {
      return blockingUnaryCall(
          getChannel(), getListHospitalsByPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientHospitalRelationshipServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientHospitalRelationshipServiceFutureStub> {
    private PatientHospitalRelationshipServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientHospitalRelationshipServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientHospitalRelationshipServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerPatientInHospital(
        com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPatientInHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse> listPatientsByHospital(
        com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPatientsByHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse> listHospitalsByPatient(
        com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListHospitalsByPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PATIENT_IN_HOSPITAL = 0;
  private static final int METHODID_LIST_PATIENTS_BY_HOSPITAL = 1;
  private static final int METHODID_LIST_HOSPITALS_BY_PATIENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientHospitalRelationshipServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientHospitalRelationshipServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PATIENT_IN_HOSPITAL:
          serviceImpl.registerPatientInHospital((com.almeidavc.grpcbackend.lib.RegisterPatientInHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_PATIENTS_BY_HOSPITAL:
          serviceImpl.listPatientsByHospital((com.almeidavc.grpcbackend.lib.ListPatientsByHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListPatientsByHospitalResponse>) responseObserver);
          break;
        case METHODID_LIST_HOSPITALS_BY_PATIENT:
          serviceImpl.listHospitalsByPatient((com.almeidavc.grpcbackend.lib.ListHospitalsByPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.ListHospitalsByPatientResponse>) responseObserver);
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

  private static abstract class PatientHospitalRelationshipServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientHospitalRelationshipServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.almeidavc.grpcbackend.lib.PatientHospitalRel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientHospitalRelationshipService");
    }
  }

  private static final class PatientHospitalRelationshipServiceFileDescriptorSupplier
      extends PatientHospitalRelationshipServiceBaseDescriptorSupplier {
    PatientHospitalRelationshipServiceFileDescriptorSupplier() {}
  }

  private static final class PatientHospitalRelationshipServiceMethodDescriptorSupplier
      extends PatientHospitalRelationshipServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientHospitalRelationshipServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientHospitalRelationshipServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientHospitalRelationshipServiceFileDescriptorSupplier())
              .addMethod(getRegisterPatientInHospitalMethod())
              .addMethod(getListPatientsByHospitalMethod())
              .addMethod(getListHospitalsByPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
