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
    comments = "Source: checkUser.proto")
public final class checkUserGrpc {

  private checkUserGrpc() {}

  public static final String SERVICE_NAME = "checkUser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.CheckUser.checkuid,
      org.example.CheckUser.checkResp> getValidateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateUser",
      requestType = org.example.CheckUser.checkuid.class,
      responseType = org.example.CheckUser.checkResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CheckUser.checkuid,
      org.example.CheckUser.checkResp> getValidateUserMethod() {
    io.grpc.MethodDescriptor<org.example.CheckUser.checkuid, org.example.CheckUser.checkResp> getValidateUserMethod;
    if ((getValidateUserMethod = checkUserGrpc.getValidateUserMethod) == null) {
      synchronized (checkUserGrpc.class) {
        if ((getValidateUserMethod = checkUserGrpc.getValidateUserMethod) == null) {
          checkUserGrpc.getValidateUserMethod = getValidateUserMethod = 
              io.grpc.MethodDescriptor.<org.example.CheckUser.checkuid, org.example.CheckUser.checkResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "checkUser", "validateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CheckUser.checkuid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CheckUser.checkResp.getDefaultInstance()))
                  .setSchemaDescriptor(new checkUserMethodDescriptorSupplier("validateUser"))
                  .build();
          }
        }
     }
     return getValidateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static checkUserStub newStub(io.grpc.Channel channel) {
    return new checkUserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static checkUserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new checkUserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static checkUserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new checkUserFutureStub(channel);
  }

  /**
   */
  public static abstract class checkUserImplBase implements io.grpc.BindableService {

    /**
     */
    public void validateUser(org.example.CheckUser.checkuid request,
        io.grpc.stub.StreamObserver<org.example.CheckUser.checkResp> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.CheckUser.checkuid,
                org.example.CheckUser.checkResp>(
                  this, METHODID_VALIDATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class checkUserStub extends io.grpc.stub.AbstractStub<checkUserStub> {
    private checkUserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkUserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkUserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkUserStub(channel, callOptions);
    }

    /**
     */
    public void validateUser(org.example.CheckUser.checkuid request,
        io.grpc.stub.StreamObserver<org.example.CheckUser.checkResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class checkUserBlockingStub extends io.grpc.stub.AbstractStub<checkUserBlockingStub> {
    private checkUserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkUserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkUserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkUserBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.CheckUser.checkResp validateUser(org.example.CheckUser.checkuid request) {
      return blockingUnaryCall(
          getChannel(), getValidateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class checkUserFutureStub extends io.grpc.stub.AbstractStub<checkUserFutureStub> {
    private checkUserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private checkUserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected checkUserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new checkUserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.CheckUser.checkResp> validateUser(
        org.example.CheckUser.checkuid request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final checkUserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(checkUserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_USER:
          serviceImpl.validateUser((org.example.CheckUser.checkuid) request,
              (io.grpc.stub.StreamObserver<org.example.CheckUser.checkResp>) responseObserver);
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

  private static abstract class checkUserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    checkUserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.CheckUser.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("checkUser");
    }
  }

  private static final class checkUserFileDescriptorSupplier
      extends checkUserBaseDescriptorSupplier {
    checkUserFileDescriptorSupplier() {}
  }

  private static final class checkUserMethodDescriptorSupplier
      extends checkUserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    checkUserMethodDescriptorSupplier(String methodName) {
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
      synchronized (checkUserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new checkUserFileDescriptorSupplier())
              .addMethod(getValidateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
