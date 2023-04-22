package com.energy.smartcity.park;

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
    comments = "Source: park.proto")
public final class ParkLightsGrpc {

  private ParkLightsGrpc() {}

  public static final String SERVICE_NAME = "SmartCityServices.ParkLights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.park.emergencyOnRequest,
      com.energy.smartcity.park.emergencyOnReply> getEmergencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Emergency",
      requestType = com.energy.smartcity.park.emergencyOnRequest.class,
      responseType = com.energy.smartcity.park.emergencyOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.park.emergencyOnRequest,
      com.energy.smartcity.park.emergencyOnReply> getEmergencyMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.park.emergencyOnRequest, com.energy.smartcity.park.emergencyOnReply> getEmergencyMethod;
    if ((getEmergencyMethod = ParkLightsGrpc.getEmergencyMethod) == null) {
      synchronized (ParkLightsGrpc.class) {
        if ((getEmergencyMethod = ParkLightsGrpc.getEmergencyMethod) == null) {
          ParkLightsGrpc.getEmergencyMethod = getEmergencyMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.park.emergencyOnRequest, com.energy.smartcity.park.emergencyOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.ParkLights", "Emergency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.emergencyOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.emergencyOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkLightsMethodDescriptorSupplier("Emergency"))
                  .build();
          }
        }
     }
     return getEmergencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOnRequest,
      com.energy.smartcity.park.polesOnReply> getPolesOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PolesOn",
      requestType = com.energy.smartcity.park.polesOnRequest.class,
      responseType = com.energy.smartcity.park.polesOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOnRequest,
      com.energy.smartcity.park.polesOnReply> getPolesOnMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOnRequest, com.energy.smartcity.park.polesOnReply> getPolesOnMethod;
    if ((getPolesOnMethod = ParkLightsGrpc.getPolesOnMethod) == null) {
      synchronized (ParkLightsGrpc.class) {
        if ((getPolesOnMethod = ParkLightsGrpc.getPolesOnMethod) == null) {
          ParkLightsGrpc.getPolesOnMethod = getPolesOnMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.park.polesOnRequest, com.energy.smartcity.park.polesOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.ParkLights", "PolesOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.polesOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.polesOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkLightsMethodDescriptorSupplier("PolesOn"))
                  .build();
          }
        }
     }
     return getPolesOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOffRequest,
      com.energy.smartcity.park.polesOffReply> getPolesOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PolesOff",
      requestType = com.energy.smartcity.park.polesOffRequest.class,
      responseType = com.energy.smartcity.park.polesOffReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOffRequest,
      com.energy.smartcity.park.polesOffReply> getPolesOffMethod() {
    io.grpc.MethodDescriptor<com.energy.smartcity.park.polesOffRequest, com.energy.smartcity.park.polesOffReply> getPolesOffMethod;
    if ((getPolesOffMethod = ParkLightsGrpc.getPolesOffMethod) == null) {
      synchronized (ParkLightsGrpc.class) {
        if ((getPolesOffMethod = ParkLightsGrpc.getPolesOffMethod) == null) {
          ParkLightsGrpc.getPolesOffMethod = getPolesOffMethod = 
              io.grpc.MethodDescriptor.<com.energy.smartcity.park.polesOffRequest, com.energy.smartcity.park.polesOffReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartCityServices.ParkLights", "PolesOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.polesOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.energy.smartcity.park.polesOffReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkLightsMethodDescriptorSupplier("PolesOff"))
                  .build();
          }
        }
     }
     return getPolesOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkLightsStub newStub(io.grpc.Channel channel) {
    return new ParkLightsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkLightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkLightsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkLightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkLightsFutureStub(channel);
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static abstract class ParkLightsImplBase implements io.grpc.BindableService {

    /**
     */
    public void emergency(com.energy.smartcity.park.emergencyOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.emergencyOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyMethod(), responseObserver);
    }

    /**
     */
    public void polesOn(com.energy.smartcity.park.polesOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPolesOnMethod(), responseObserver);
    }

    /**
     */
    public void polesOff(com.energy.smartcity.park.polesOffRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOffReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPolesOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.park.emergencyOnRequest,
                com.energy.smartcity.park.emergencyOnReply>(
                  this, METHODID_EMERGENCY)))
          .addMethod(
            getPolesOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.park.polesOnRequest,
                com.energy.smartcity.park.polesOnReply>(
                  this, METHODID_POLES_ON)))
          .addMethod(
            getPolesOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.energy.smartcity.park.polesOffRequest,
                com.energy.smartcity.park.polesOffReply>(
                  this, METHODID_POLES_OFF)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class ParkLightsStub extends io.grpc.stub.AbstractStub<ParkLightsStub> {
    private ParkLightsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkLightsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkLightsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkLightsStub(channel, callOptions);
    }

    /**
     */
    public void emergency(com.energy.smartcity.park.emergencyOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.emergencyOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void polesOn(com.energy.smartcity.park.polesOnRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPolesOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void polesOff(com.energy.smartcity.park.polesOffRequest request,
        io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOffReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPolesOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class ParkLightsBlockingStub extends io.grpc.stub.AbstractStub<ParkLightsBlockingStub> {
    private ParkLightsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkLightsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkLightsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkLightsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.energy.smartcity.park.emergencyOnReply emergency(com.energy.smartcity.park.emergencyOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.park.polesOnReply polesOn(com.energy.smartcity.park.polesOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getPolesOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.energy.smartcity.park.polesOffReply polesOff(com.energy.smartcity.park.polesOffRequest request) {
      return blockingUnaryCall(
          getChannel(), getPolesOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   * </pre>
   */
  public static final class ParkLightsFutureStub extends io.grpc.stub.AbstractStub<ParkLightsFutureStub> {
    private ParkLightsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkLightsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkLightsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkLightsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.park.emergencyOnReply> emergency(
        com.energy.smartcity.park.emergencyOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.park.polesOnReply> polesOn(
        com.energy.smartcity.park.polesOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPolesOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.energy.smartcity.park.polesOffReply> polesOff(
        com.energy.smartcity.park.polesOffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPolesOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMERGENCY = 0;
  private static final int METHODID_POLES_ON = 1;
  private static final int METHODID_POLES_OFF = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkLightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkLightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY:
          serviceImpl.emergency((com.energy.smartcity.park.emergencyOnRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.park.emergencyOnReply>) responseObserver);
          break;
        case METHODID_POLES_ON:
          serviceImpl.polesOn((com.energy.smartcity.park.polesOnRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOnReply>) responseObserver);
          break;
        case METHODID_POLES_OFF:
          serviceImpl.polesOff((com.energy.smartcity.park.polesOffRequest) request,
              (io.grpc.stub.StreamObserver<com.energy.smartcity.park.polesOffReply>) responseObserver);
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

  private static abstract class ParkLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkLightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.energy.smartcity.park.ParkServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkLights");
    }
  }

  private static final class ParkLightsFileDescriptorSupplier
      extends ParkLightsBaseDescriptorSupplier {
    ParkLightsFileDescriptorSupplier() {}
  }

  private static final class ParkLightsMethodDescriptorSupplier
      extends ParkLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkLightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkLightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkLightsFileDescriptorSupplier())
              .addMethod(getEmergencyMethod())
              .addMethod(getPolesOnMethod())
              .addMethod(getPolesOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
