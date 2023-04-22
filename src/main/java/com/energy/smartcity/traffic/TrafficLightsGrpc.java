package com.energy.smartcity.traffic;

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
    comments = "Source: traffic.proto")
public final class TrafficLightsGrpc {

  private TrafficLightsGrpc() {}

  public static final String SERVICE_NAME = "SmartCityServices.TrafficLights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.traffic.autoOnRequest,
      com.energy.smartcity.traffic.autoOnReply> getAutoTrafficLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "autoTrafficL",
      requestType = com.energy.smartcity.traffic.autoOnRequest.class,
      responseType = com.energy.smartcity.traffic.autoOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.traffic.autoOnRequest,
      com.energy.smartcity.traffic.autoOnReply> getAutoTrafficLMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.traffic.autoOnRequest, com.energy.smartcity.traffic.autoOnReply> getAutoTrafficLMethod;
    if ((getAutoTrafficLMethod = TrafficLightsGrpc.getAutoTrafficLMethod) == null) {
      synchronized (TrafficLightsGrpc.class) {
        if ((getAutoTrafficLMethod = TrafficLightsGrpc.getAutoTrafficLMethod) == null) {
          TrafficLightsGrpc.getAutoTrafficLMethod = getAutoTrafficLMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.traffic.autoOnRequest, com.energy.smartcity.traffic.autoOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.TrafficLights", "autoTrafficL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.autoOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.autoOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficLightsMethodDescriptorSupplier("autoTrafficL"))
                  .build();
          }
        }
     }
     return getAutoTrafficLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.traffic.emerTrafficOnRequest,
      com.energy.smartcity.traffic.emerTrafficOnReply> getEmergencyTrafficMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emergencyTraffic",
      requestType = com.energy.smartcity.traffic.emerTrafficOnRequest.class,
      responseType = com.energy.smartcity.traffic.emerTrafficOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.traffic.emerTrafficOnRequest,
      com.energy.smartcity.traffic.emerTrafficOnReply> getEmergencyTrafficMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.traffic.emerTrafficOnRequest, com.energy.smartcity.traffic.emerTrafficOnReply> getEmergencyTrafficMethod;
    if ((getEmergencyTrafficMethod = TrafficLightsGrpc.getEmergencyTrafficMethod) == null) {
      synchronized (TrafficLightsGrpc.class) {
        if ((getEmergencyTrafficMethod = TrafficLightsGrpc.getEmergencyTrafficMethod) == null) {
          TrafficLightsGrpc.getEmergencyTrafficMethod = getEmergencyTrafficMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.traffic.emerTrafficOnRequest, com.energy.smartcity.traffic.emerTrafficOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.TrafficLights", "emergencyTraffic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.emerTrafficOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.emerTrafficOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficLightsMethodDescriptorSupplier("emergencyTraffic"))
                  .build();
          }
        }
     }
     return getEmergencyTrafficMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.traffic.signalsRequest,
      com.energy.smartcity.traffic.signalsReply> getAutoSignalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "autoSignals",
      requestType = com.energy.smartcity.traffic.signalsRequest.class,
      responseType = com.energy.smartcity.traffic.signalsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.traffic.signalsRequest,
      com.energy.smartcity.traffic.signalsReply> getAutoSignalsMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.traffic.signalsRequest, com.energy.smartcity.traffic.signalsReply> getAutoSignalsMethod;
    if ((getAutoSignalsMethod = TrafficLightsGrpc.getAutoSignalsMethod) == null) {
      synchronized (TrafficLightsGrpc.class) {
        if ((getAutoSignalsMethod = TrafficLightsGrpc.getAutoSignalsMethod) == null) {
          TrafficLightsGrpc.getAutoSignalsMethod = getAutoSignalsMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.traffic.signalsRequest, com.energy.smartcity.traffic.signalsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.TrafficLights", "autoSignals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.signalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.traffic.signalsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficLightsMethodDescriptorSupplier("autoSignals"))
                  .build();
          }
        }
     }
     return getAutoSignalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficLightsStub newStub(io.grpc.Channel channel) {
    return new TrafficLightsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficLightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrafficLightsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficLightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrafficLightsFutureStub(channel);
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static abstract class TrafficLightsImplBase implements io.grpc.BindableService {

    /**
     */
    public void autoTrafficL(com.energy.smartcity.traffic.autoOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.autoOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoTrafficLMethod(), responseObserver);
    }

    /**
     */
    public void emergencyTraffic(com.energy.smartcity.traffic.emerTrafficOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.emerTrafficOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyTrafficMethod(), responseObserver);
    }

    /**
     */
    public void autoSignals(com.energy.smartcity.traffic.signalsRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.signalsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoSignalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAutoTrafficLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.traffic.autoOnRequest,
                com.energy.smartcity.traffic.autoOnReply>(
                  this, METHODID_AUTO_TRAFFIC_L)))
          .addMethod(
            getEmergencyTrafficMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.traffic.emerTrafficOnRequest,
                com.energy.smartcity.traffic.emerTrafficOnReply>(
                  this, METHODID_EMERGENCY_TRAFFIC)))
          .addMethod(
            getAutoSignalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.traffic.signalsRequest,
                com.energy.smartcity.traffic.signalsReply>(
                  this, METHODID_AUTO_SIGNALS)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class TrafficLightsStub extends io.grpc.stub.AbstractStub<TrafficLightsStub> {
    private TrafficLightsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficLightsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficLightsStub(channel, callOptions);
    }

    /**
     */
    public void autoTrafficL(com.energy.smartcity.traffic.autoOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.autoOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoTrafficLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyTraffic(com.energy.smartcity.traffic.emerTrafficOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.emerTrafficOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyTrafficMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void autoSignals(com.energy.smartcity.traffic.signalsRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.signalsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoSignalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class TrafficLightsBlockingStub extends io.grpc.stub.AbstractStub<TrafficLightsBlockingStub> {
    private TrafficLightsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficLightsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficLightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.energy.smartcity.traffic.autoOnReply autoTrafficL(com.energy.smartcity.traffic.autoOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutoTrafficLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.traffic.emerTrafficOnReply emergencyTraffic(com.energy.smartcity.traffic.emerTrafficOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyTrafficMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.traffic.signalsReply autoSignals(com.energy.smartcity.traffic.signalsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutoSignalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class TrafficLightsFutureStub extends io.grpc.stub.AbstractStub<TrafficLightsFutureStub> {
    private TrafficLightsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficLightsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficLightsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficLightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.traffic.autoOnReply> autoTrafficL(
        com.energy.smartcity.traffic.autoOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoTrafficLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.traffic.emerTrafficOnReply> emergencyTraffic(
        com.energy.smartcity.traffic.emerTrafficOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyTrafficMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.traffic.signalsReply> autoSignals(
        com.energy.smartcity.traffic.signalsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoSignalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTO_TRAFFIC_L = 0;
  private static final int METHODID_EMERGENCY_TRAFFIC = 1;
  private static final int METHODID_AUTO_SIGNALS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrafficLightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrafficLightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTO_TRAFFIC_L:
          serviceImpl.autoTrafficL((com.energy.smartcity.traffic.autoOnRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.autoOnReply>) responseObserver);
          break;
        case METHODID_EMERGENCY_TRAFFIC:
          serviceImpl.emergencyTraffic((com.energy.smartcity.traffic.emerTrafficOnRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.emerTrafficOnReply>) responseObserver);
          break;
        case METHODID_AUTO_SIGNALS:
          serviceImpl.autoSignals((com.energy.smartcity.traffic.signalsRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.traffic.signalsReply>) responseObserver);
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

  private static abstract class TrafficLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficLightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.energy.smartcity.traffic.TrafficServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficLights");
    }
  }

  private static final class TrafficLightsFileDescriptorSupplier
      extends TrafficLightsBaseDescriptorSupplier {
    TrafficLightsFileDescriptorSupplier() {}
  }

  private static final class TrafficLightsMethodDescriptorSupplier
      extends TrafficLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrafficLightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrafficLightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficLightsFileDescriptorSupplier())
              .addMethod(getAutoTrafficLMethod())
              .addMethod(getEmergencyTrafficMethod())
              .addMethod(getAutoSignalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
