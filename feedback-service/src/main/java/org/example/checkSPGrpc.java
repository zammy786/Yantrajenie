package org.example;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: checkSP.proto")
public final class checkSPGrpc {

  private checkSPGrpc() {}

  public static final String SERVICE_NAME = "checkSP";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.CheckSP.checkSPID,
      org.example.CheckSP.checkResp> getValidateSPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateSP",
      requestType = org.example.CheckSP.checkSPID.class,
      responseType = org.example.CheckSP.checkResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CheckSP.checkSPID,
      org.example.CheckSP.checkResp> getValidateSPMethod() {
    io.grpc.MethodDescriptor<org.example.CheckSP.checkSPID, org.example.CheckSP.checkResp> getValidateSPMethod;
    if ((getValidateSPMethod = checkSPGrpc.getValidateSPMethod) == null) {
      synchronized (checkSPGrpc.class) {
        if ((getValidateSPMethod = checkSPGrpc.getValidateSPMethod) == null) {
          checkSPGrpc.getValidateSPMethod = getValidateSPMethod = 
              io.grpc.MethodDescriptor.<org.example.CheckSP.checkSPID, org.example.CheckSP.checkResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "checkSP", "validateSP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CheckSP.checkSPID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CheckSP.checkResp.getDefaultInstance()))
                  .setSchemaDescriptor(new checkSPMethodDescriptorSupplier("validateSP"))
                  .build();
          }
        }
     }
     return getValidateSPMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static checkSPStub newStub(io.grpc.Channel channel) {
    return new checkSPStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static checkSPBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new checkSPBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static checkSPFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new checkSPFutureStub(channel);
  }

  /**
   */
  public static abstract class checkSPImplBase implements io.grpc.BindableService {

    /**
     */
    public void validateSP(org.example.CheckSP.checkSPID request,
        io.grpc.stub.StreamObserver<org.example.CheckSP.checkResp> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateSPMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateSPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.CheckSP.checkSPID,
                org.example.CheckSP.checkResp>(
                  this, METHODID_VALIDATE_SP)))
          .build();
    }
  }

  /**
   */
  public static final class checkSPStub extends io.grpc.stub.AbstractStub<checkSPStub> {
    private checkSPStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkSPStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkSPStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkSPStub(channel, callOptions);
    }

    /**
     */
    public void validateSP(org.example.CheckSP.checkSPID request,
        io.grpc.stub.StreamObserver<org.example.CheckSP.checkResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateSPMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class checkSPBlockingStub extends io.grpc.stub.AbstractStub<checkSPBlockingStub> {
    private checkSPBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkSPBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkSPBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkSPBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.CheckSP.checkResp validateSP(org.example.CheckSP.checkSPID request) {
      return blockingUnaryCall(
          getChannel(), getValidateSPMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class checkSPFutureStub extends io.grpc.stub.AbstractStub<checkSPFutureStub> {
    private checkSPFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkSPFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkSPFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkSPFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.CheckSP.checkResp> validateSP(
        org.example.CheckSP.checkSPID request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateSPMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_SP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final checkSPImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(checkSPImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_SP:
          serviceImpl.validateSP((org.example.CheckSP.checkSPID) request,
              (io.grpc.stub.StreamObserver<org.example.CheckSP.checkResp>) responseObserver);
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

  private static abstract class checkSPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    checkSPBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.CheckSP.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("checkSP");
    }
  }

  private static final class checkSPFileDescriptorSupplier
      extends checkSPBaseDescriptorSupplier {
    checkSPFileDescriptorSupplier() {}
  }

  private static final class checkSPMethodDescriptorSupplier
      extends checkSPBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    checkSPMethodDescriptorSupplier(String methodName) {
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
      synchronized (checkSPGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new checkSPFileDescriptorSupplier())
              .addMethod(getValidateSPMethod())
              .build();
        }
      }
    }
    return result;
  }
}
