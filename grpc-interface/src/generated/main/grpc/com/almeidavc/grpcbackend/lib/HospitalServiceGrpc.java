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
    comments = "Source: hospital.proto")
public final class HospitalServiceGrpc {

  private HospitalServiceGrpc() {}

  public static final String SERVICE_NAME = "com.almeidavc.grpcbackend.HospitalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreateHospitalRequest,
      com.almeidavc.grpcbackend.lib.Hospital> getCreateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHospital",
      requestType = com.almeidavc.grpcbackend.lib.CreateHospitalRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.Hospital.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreateHospitalRequest,
      com.almeidavc.grpcbackend.lib.Hospital> getCreateHospitalMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.CreateHospitalRequest, com.almeidavc.grpcbackend.lib.Hospital> getCreateHospitalMethod;
    if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
          HospitalServiceGrpc.getCreateHospitalMethod = getCreateHospitalMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.CreateHospitalRequest, com.almeidavc.grpcbackend.lib.Hospital>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.CreateHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.Hospital.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("CreateHospital"))
              .build();
        }
      }
    }
    return getCreateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdateHospitalRequest,
      com.almeidavc.grpcbackend.lib.Hospital> getUpdateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHospital",
      requestType = com.almeidavc.grpcbackend.lib.UpdateHospitalRequest.class,
      responseType = com.almeidavc.grpcbackend.lib.Hospital.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdateHospitalRequest,
      com.almeidavc.grpcbackend.lib.Hospital> getUpdateHospitalMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.UpdateHospitalRequest, com.almeidavc.grpcbackend.lib.Hospital> getUpdateHospitalMethod;
    if ((getUpdateHospitalMethod = HospitalServiceGrpc.getUpdateHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getUpdateHospitalMethod = HospitalServiceGrpc.getUpdateHospitalMethod) == null) {
          HospitalServiceGrpc.getUpdateHospitalMethod = getUpdateHospitalMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.UpdateHospitalRequest, com.almeidavc.grpcbackend.lib.Hospital>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.UpdateHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.Hospital.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("UpdateHospital"))
              .build();
        }
      }
    }
    return getUpdateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeleteHospitalRequest,
      com.google.protobuf.Empty> getDeleteHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHospital",
      requestType = com.almeidavc.grpcbackend.lib.DeleteHospitalRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeleteHospitalRequest,
      com.google.protobuf.Empty> getDeleteHospitalMethod() {
    io.grpc.MethodDescriptor<com.almeidavc.grpcbackend.lib.DeleteHospitalRequest, com.google.protobuf.Empty> getDeleteHospitalMethod;
    if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
          HospitalServiceGrpc.getDeleteHospitalMethod = getDeleteHospitalMethod =
              io.grpc.MethodDescriptor.<com.almeidavc.grpcbackend.lib.DeleteHospitalRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.almeidavc.grpcbackend.lib.DeleteHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("DeleteHospital"))
              .build();
        }
      }
    }
    return getDeleteHospitalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub>() {
        @java.lang.Override
        public HospitalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceStub(channel, callOptions);
        }
      };
    return HospitalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub>() {
        @java.lang.Override
        public HospitalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceBlockingStub(channel, callOptions);
        }
      };
    return HospitalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub>() {
        @java.lang.Override
        public HospitalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceFutureStub(channel, callOptions);
        }
      };
    return HospitalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HospitalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHospital(com.almeidavc.grpcbackend.lib.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void updateHospital(com.almeidavc.grpcbackend.lib.UpdateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void deleteHospital(com.almeidavc.grpcbackend.lib.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHospitalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHospitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.CreateHospitalRequest,
                com.almeidavc.grpcbackend.lib.Hospital>(
                  this, METHODID_CREATE_HOSPITAL)))
          .addMethod(
            getUpdateHospitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.UpdateHospitalRequest,
                com.almeidavc.grpcbackend.lib.Hospital>(
                  this, METHODID_UPDATE_HOSPITAL)))
          .addMethod(
            getDeleteHospitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.almeidavc.grpcbackend.lib.DeleteHospitalRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_HOSPITAL)))
          .build();
    }
  }

  /**
   */
  public static final class HospitalServiceStub extends io.grpc.stub.AbstractAsyncStub<HospitalServiceStub> {
    private HospitalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHospital(com.almeidavc.grpcbackend.lib.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHospital(com.almeidavc.grpcbackend.lib.UpdateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHospital(com.almeidavc.grpcbackend.lib.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HospitalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HospitalServiceBlockingStub> {
    private HospitalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.Hospital createHospital(com.almeidavc.grpcbackend.lib.CreateHospitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.almeidavc.grpcbackend.lib.Hospital updateHospital(com.almeidavc.grpcbackend.lib.UpdateHospitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteHospital(com.almeidavc.grpcbackend.lib.DeleteHospitalRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHospitalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HospitalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HospitalServiceFutureStub> {
    private HospitalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.Hospital> createHospital(
        com.almeidavc.grpcbackend.lib.CreateHospitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.almeidavc.grpcbackend.lib.Hospital> updateHospital(
        com.almeidavc.grpcbackend.lib.UpdateHospitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteHospital(
        com.almeidavc.grpcbackend.lib.DeleteHospitalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOSPITAL = 0;
  private static final int METHODID_UPDATE_HOSPITAL = 1;
  private static final int METHODID_DELETE_HOSPITAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HospitalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HospitalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOSPITAL:
          serviceImpl.createHospital((com.almeidavc.grpcbackend.lib.CreateHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital>) responseObserver);
          break;
        case METHODID_UPDATE_HOSPITAL:
          serviceImpl.updateHospital((com.almeidavc.grpcbackend.lib.UpdateHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.almeidavc.grpcbackend.lib.Hospital>) responseObserver);
          break;
        case METHODID_DELETE_HOSPITAL:
          serviceImpl.deleteHospital((com.almeidavc.grpcbackend.lib.DeleteHospitalRequest) request,
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

  private static abstract class HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.almeidavc.grpcbackend.lib.HospitalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalService");
    }
  }

  private static final class HospitalServiceFileDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier {
    HospitalServiceFileDescriptorSupplier() {}
  }

  private static final class HospitalServiceMethodDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HospitalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HospitalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalServiceFileDescriptorSupplier())
              .addMethod(getCreateHospitalMethod())
              .addMethod(getUpdateHospitalMethod())
              .addMethod(getDeleteHospitalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
