package com.energy.smartcity.seafront;

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
 * <pre>
 *service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: seafront.proto")
public final class SeafrontLightsGrpc {

  private SeafrontLightsGrpc() {}

  public static final String SERVICE_NAME = "SmartCityServices.SeafrontLights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.seafront.frontRequest,
      com.energy.smartcity.seafront.frontOnReply> getSeaLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "seaLights",
      requestType = com.energy.smartcity.seafront.frontRequest.class,
      responseType = com.energy.smartcity.seafront.frontOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.seafront.frontRequest,
      com.energy.smartcity.seafront.frontOnReply> getSeaLightsMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.seafront.frontRequest, com.energy.smartcity.seafront.frontOnReply> getSeaLightsMethod;
    if ((getSeaLightsMethod = SeafrontLightsGrpc.getSeaLightsMethod) == null) {
      synchronized (SeafrontLightsGrpc.class) {
        if ((getSeaLightsMethod = SeafrontLightsGrpc.getSeaLightsMethod) == null) {
          SeafrontLightsGrpc.getSeaLightsMethod = getSeaLightsMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.seafront.frontRequest, com.energy.smartcity.seafront.frontOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.SeafrontLights", "seaLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.frontRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.frontOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SeafrontLightsMethodDescriptorSupplier("seaLights"))
                  .build();
          }
        }
     }
     return getSeaLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.seafront.stationsRequest,
      com.energy.smartcity.seafront.stationsReply> getLifeguardStationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lifeguardStations",
      requestType = com.energy.smartcity.seafront.stationsRequest.class,
      responseType = com.energy.smartcity.seafront.stationsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.seafront.stationsRequest,
      com.energy.smartcity.seafront.stationsReply> getLifeguardStationsMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.seafront.stationsRequest, com.energy.smartcity.seafront.stationsReply> getLifeguardStationsMethod;
    if ((getLifeguardStationsMethod = SeafrontLightsGrpc.getLifeguardStationsMethod) == null) {
      synchronized (SeafrontLightsGrpc.class) {
        if ((getLifeguardStationsMethod = SeafrontLightsGrpc.getLifeguardStationsMethod) == null) {
          SeafrontLightsGrpc.getLifeguardStationsMethod = getLifeguardStationsMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.seafront.stationsRequest, com.energy.smartcity.seafront.stationsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.SeafrontLights", "lifeguardStations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.stationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.stationsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SeafrontLightsMethodDescriptorSupplier("lifeguardStations"))
                  .build();
          }
        }
     }
     return getLifeguardStationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.seafront.rescuersRequest,
      com.energy.smartcity.seafront.rescuersReply> getMedicalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "medical",
      requestType = com.energy.smartcity.seafront.rescuersRequest.class,
      responseType = com.energy.smartcity.seafront.rescuersReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.seafront.rescuersRequest,
      com.energy.smartcity.seafront.rescuersReply> getMedicalMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.seafront.rescuersRequest, com.energy.smartcity.seafront.rescuersReply> getMedicalMethod;
    if ((getMedicalMethod = SeafrontLightsGrpc.getMedicalMethod) == null) {
      synchronized (SeafrontLightsGrpc.class) {
        if ((getMedicalMethod = SeafrontLightsGrpc.getMedicalMethod) == null) {
          SeafrontLightsGrpc.getMedicalMethod = getMedicalMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.seafront.rescuersRequest, com.energy.smartcity.seafront.rescuersReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.SeafrontLights", "medical"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.rescuersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.seafront.rescuersReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SeafrontLightsMethodDescriptorSupplier("medical"))
                  .build();
          }
        }
     }
     return getMedicalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeafrontLightsStub newStub(io.grpc.Channel channel) {
    return new SeafrontLightsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeafrontLightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SeafrontLightsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeafrontLightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SeafrontLightsFutureStub(channel);
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static abstract class SeafrontLightsImplBase implements io.grpc.BindableService {

    /**
     */
    public void seaLights(com.energy.smartcity.seafront.frontRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.frontOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSeaLightsMethod(), responseObserver);
    }

    /**
     */
    public void lifeguardStations(com.energy.smartcity.seafront.stationsRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.stationsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getLifeguardStationsMethod(), responseObserver);
    }

    /**
     */
    public void medical(com.energy.smartcity.seafront.rescuersRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.rescuersReply> responseObserver) {
      asyncUnimplementedUnaryCall(getMedicalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSeaLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.seafront.frontRequest,
                com.energy.smartcity.seafront.frontOnReply>(
                  this, METHODID_SEA_LIGHTS)))
          .addMethod(
            getLifeguardStationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.seafront.stationsRequest,
                com.energy.smartcity.seafront.stationsReply>(
                  this, METHODID_LIFEGUARD_STATIONS)))
          .addMethod(
            getMedicalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.seafront.rescuersRequest,
                com.energy.smartcity.seafront.rescuersReply>(
                  this, METHODID_MEDICAL)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class SeafrontLightsStub extends io.grpc.stub.AbstractStub<SeafrontLightsStub> {
    private SeafrontLightsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeafrontLightsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeafrontLightsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeafrontLightsStub(channel, callOptions);
    }

    /**
     */
    public void seaLights(com.energy.smartcity.seafront.frontRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.frontOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeaLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lifeguardStations(com.energy.smartcity.seafront.stationsRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.stationsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLifeguardStationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void medical(com.energy.smartcity.seafront.rescuersRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.rescuersReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMedicalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class SeafrontLightsBlockingStub extends io.grpc.stub.AbstractStub<SeafrontLightsBlockingStub> {
    private SeafrontLightsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeafrontLightsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeafrontLightsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeafrontLightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.energy.smartcity.seafront.frontOnReply seaLights(com.energy.smartcity.seafront.frontRequest request) {
      return blockingUnaryCall(
          getChannel(), getSeaLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.seafront.stationsReply lifeguardStations(com.energy.smartcity.seafront.stationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getLifeguardStationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.seafront.rescuersReply medical(com.energy.smartcity.seafront.rescuersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMedicalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class SeafrontLightsFutureStub extends io.grpc.stub.AbstractStub<SeafrontLightsFutureStub> {
    private SeafrontLightsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeafrontLightsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeafrontLightsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeafrontLightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.seafront.frontOnReply> seaLights(
        com.energy.smartcity.seafront.frontRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSeaLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.seafront.stationsReply> lifeguardStations(
        com.energy.smartcity.seafront.stationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLifeguardStationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.seafront.rescuersReply> medical(
        com.energy.smartcity.seafront.rescuersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMedicalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEA_LIGHTS = 0;
  private static final int METHODID_LIFEGUARD_STATIONS = 1;
  private static final int METHODID_MEDICAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeafrontLightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeafrontLightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEA_LIGHTS:
          serviceImpl.seaLights((com.energy.smartcity.seafront.frontRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.frontOnReply>) responseObserver);
          break;
        case METHODID_LIFEGUARD_STATIONS:
          serviceImpl.lifeguardStations((com.energy.smartcity.seafront.stationsRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.stationsReply>) responseObserver);
          break;
        case METHODID_MEDICAL:
          serviceImpl.medical((com.energy.smartcity.seafront.rescuersRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.seafront.rescuersReply>) responseObserver);
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

  private static abstract class SeafrontLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeafrontLightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.energy.smartcity.seafront.SeafrontServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeafrontLights");
    }
  }

  private static final class SeafrontLightsFileDescriptorSupplier
      extends SeafrontLightsBaseDescriptorSupplier {
    SeafrontLightsFileDescriptorSupplier() {}
  }

  private static final class SeafrontLightsMethodDescriptorSupplier
      extends SeafrontLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeafrontLightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SeafrontLightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeafrontLightsFileDescriptorSupplier())
              .addMethod(getSeaLightsMethod())
              .addMethod(getLifeguardStationsMethod())
              .addMethod(getMedicalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
