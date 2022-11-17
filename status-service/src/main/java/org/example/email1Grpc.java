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
    comments = "Source: Email.proto")
public final class email1Grpc {

  private email1Grpc() {}

  public static final String SERVICE_NAME = "email1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Email.requestEmailId,
      org.example.Email.emailResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmail",
      requestType = org.example.Email.requestEmailId.class,
      responseType = org.example.Email.emailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Email.requestEmailId,
      org.example.Email.emailResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<org.example.Email.requestEmailId, org.example.Email.emailResponse> getSendEmailMethod;
    if ((getSendEmailMethod = email1Grpc.getSendEmailMethod) == null) {
      synchronized (email1Grpc.class) {
        if ((getSendEmailMethod = email1Grpc.getSendEmailMethod) == null) {
          email1Grpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<org.example.Email.requestEmailId, org.example.Email.emailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "email1", "sendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Email.requestEmailId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Email.emailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new email1MethodDescriptorSupplier("sendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Email.sendOTP,
      org.example.Email.emailResponse> getSendingOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendingOTP",
      requestType = org.example.Email.sendOTP.class,
      responseType = org.example.Email.emailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Email.sendOTP,
      org.example.Email.emailResponse> getSendingOTPMethod() {
    io.grpc.MethodDescriptor<org.example.Email.sendOTP, org.example.Email.emailResponse> getSendingOTPMethod;
    if ((getSendingOTPMethod = email1Grpc.getSendingOTPMethod) == null) {
      synchronized (email1Grpc.class) {
        if ((getSendingOTPMethod = email1Grpc.getSendingOTPMethod) == null) {
          email1Grpc.getSendingOTPMethod = getSendingOTPMethod = 
              io.grpc.MethodDescriptor.<org.example.Email.sendOTP, org.example.Email.emailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "email1", "sendingOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Email.sendOTP.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Email.emailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new email1MethodDescriptorSupplier("sendingOTP"))
                  .build();
          }
        }
     }
     return getSendingOTPMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static email1Stub newStub(io.grpc.Channel channel) {
    return new email1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static email1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new email1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static email1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new email1FutureStub(channel);
  }

  /**
   */
  public static abstract class email1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  it works the data of the booking
     * </pre>
     */
    public void sendEmail(org.example.Email.requestEmailId request,
        io.grpc.stub.StreamObserver<org.example.Email.emailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     */
    public void sendingOTP(org.example.Email.sendOTP request,
        io.grpc.stub.StreamObserver<org.example.Email.emailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendingOTPMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Email.requestEmailId,
                org.example.Email.emailResponse>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getSendingOTPMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Email.sendOTP,
                org.example.Email.emailResponse>(
                  this, METHODID_SENDING_OTP)))
          .build();
    }
  }

  /**
   */
  public static final class email1Stub extends io.grpc.stub.AbstractStub<email1Stub> {
    private email1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private email1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected email1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new email1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  it works the data of the booking
     * </pre>
     */
    public void sendEmail(org.example.Email.requestEmailId request,
        io.grpc.stub.StreamObserver<org.example.Email.emailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendingOTP(org.example.Email.sendOTP request,
        io.grpc.stub.StreamObserver<org.example.Email.emailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendingOTPMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class email1BlockingStub extends io.grpc.stub.AbstractStub<email1BlockingStub> {
    private email1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private email1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected email1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new email1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  it works the data of the booking
     * </pre>
     */
    public org.example.Email.emailResponse sendEmail(org.example.Email.requestEmailId request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Email.emailResponse sendingOTP(org.example.Email.sendOTP request) {
      return blockingUnaryCall(
          getChannel(), getSendingOTPMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class email1FutureStub extends io.grpc.stub.AbstractStub<email1FutureStub> {
    private email1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private email1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected email1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new email1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  it works the data of the booking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Email.emailResponse> sendEmail(
        org.example.Email.requestEmailId request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Email.emailResponse> sendingOTP(
        org.example.Email.sendOTP request) {
      return futureUnaryCall(
          getChannel().newCall(getSendingOTPMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;
  private static final int METHODID_SENDING_OTP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final email1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(email1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((org.example.Email.requestEmailId) request,
              (io.grpc.stub.StreamObserver<org.example.Email.emailResponse>) responseObserver);
          break;
        case METHODID_SENDING_OTP:
          serviceImpl.sendingOTP((org.example.Email.sendOTP) request,
              (io.grpc.stub.StreamObserver<org.example.Email.emailResponse>) responseObserver);
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

  private static abstract class email1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    email1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Email.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("email1");
    }
  }

  private static final class email1FileDescriptorSupplier
      extends email1BaseDescriptorSupplier {
    email1FileDescriptorSupplier() {}
  }

  private static final class email1MethodDescriptorSupplier
      extends email1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    email1MethodDescriptorSupplier(String methodName) {
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
      synchronized (email1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new email1FileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .addMethod(getSendingOTPMethod())
              .build();
        }
      }
    }
    return result;
  }
}
