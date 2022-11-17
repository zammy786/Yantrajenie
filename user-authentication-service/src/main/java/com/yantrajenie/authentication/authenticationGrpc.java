package com.yantrajenie.authentication;

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
 *registration, login authentication, Otp generation(forget password), Reset password
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: authentication.proto")
public final class authenticationGrpc {

  private authenticationGrpc() {}

  public static final String SERVICE_NAME = "authentication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.regRequest,
      com.yantrajenie.authentication.Authentication.regResponse> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registration",
      requestType = com.yantrajenie.authentication.Authentication.regRequest.class,
      responseType = com.yantrajenie.authentication.Authentication.regResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.regRequest,
      com.yantrajenie.authentication.Authentication.regResponse> getRegistrationMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.regRequest, com.yantrajenie.authentication.Authentication.regResponse> getRegistrationMethod;
    if ((getRegistrationMethod = authenticationGrpc.getRegistrationMethod) == null) {
      synchronized (authenticationGrpc.class) {
        if ((getRegistrationMethod = authenticationGrpc.getRegistrationMethod) == null) {
          authenticationGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.Authentication.regRequest, com.yantrajenie.authentication.Authentication.regResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authentication", "registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.regRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.regResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new authenticationMethodDescriptorSupplier("registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.loginRequest,
      com.yantrajenie.authentication.Authentication.loginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.yantrajenie.authentication.Authentication.loginRequest.class,
      responseType = com.yantrajenie.authentication.Authentication.loginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.loginRequest,
      com.yantrajenie.authentication.Authentication.loginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.loginRequest, com.yantrajenie.authentication.Authentication.loginResponse> getLoginMethod;
    if ((getLoginMethod = authenticationGrpc.getLoginMethod) == null) {
      synchronized (authenticationGrpc.class) {
        if ((getLoginMethod = authenticationGrpc.getLoginMethod) == null) {
          authenticationGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.Authentication.loginRequest, com.yantrajenie.authentication.Authentication.loginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authentication", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.loginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.loginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new authenticationMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.forgetPassRequest,
      com.yantrajenie.authentication.Authentication.forgetPassResponse> getForgetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgetPassword",
      requestType = com.yantrajenie.authentication.Authentication.forgetPassRequest.class,
      responseType = com.yantrajenie.authentication.Authentication.forgetPassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.forgetPassRequest,
      com.yantrajenie.authentication.Authentication.forgetPassResponse> getForgetPasswordMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.forgetPassRequest, com.yantrajenie.authentication.Authentication.forgetPassResponse> getForgetPasswordMethod;
    if ((getForgetPasswordMethod = authenticationGrpc.getForgetPasswordMethod) == null) {
      synchronized (authenticationGrpc.class) {
        if ((getForgetPasswordMethod = authenticationGrpc.getForgetPasswordMethod) == null) {
          authenticationGrpc.getForgetPasswordMethod = getForgetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.Authentication.forgetPassRequest, com.yantrajenie.authentication.Authentication.forgetPassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authentication", "forgetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.forgetPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.forgetPassResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new authenticationMethodDescriptorSupplier("forgetPassword"))
                  .build();
          }
        }
     }
     return getForgetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.resetPassRequest,
      com.yantrajenie.authentication.Authentication.resetPassResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.yantrajenie.authentication.Authentication.resetPassRequest.class,
      responseType = com.yantrajenie.authentication.Authentication.resetPassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.resetPassRequest,
      com.yantrajenie.authentication.Authentication.resetPassResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.Authentication.resetPassRequest, com.yantrajenie.authentication.Authentication.resetPassResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = authenticationGrpc.getResetPasswordMethod) == null) {
      synchronized (authenticationGrpc.class) {
        if ((getResetPasswordMethod = authenticationGrpc.getResetPasswordMethod) == null) {
          authenticationGrpc.getResetPasswordMethod = getResetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.Authentication.resetPassRequest, com.yantrajenie.authentication.Authentication.resetPassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "authentication", "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.resetPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.Authentication.resetPassResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new authenticationMethodDescriptorSupplier("resetPassword"))
                  .build();
          }
        }
     }
     return getResetPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static authenticationStub newStub(io.grpc.Channel channel) {
    return new authenticationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static authenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new authenticationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static authenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new authenticationFutureStub(channel);
  }

  /**
   * <pre>
   *registration, login authentication, Otp generation(forget password), Reset password
   * </pre>
   */
  public static abstract class authenticationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *registration method with registration table for both user and service provider
     * </pre>
     */
    public void registration(com.yantrajenie.authentication.Authentication.regRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.regResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     *for authentication of the user when they login to the system (user and service provider)
     * </pre>
     */
    public void login(com.yantrajenie.authentication.Authentication.loginRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.loginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *forget password(generate an otp)
     * </pre>
     */
    public void forgetPassword(com.yantrajenie.authentication.Authentication.forgetPassRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.forgetPassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getForgetPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     *reset password
     * </pre>
     */
    public void resetPassword(com.yantrajenie.authentication.Authentication.resetPassRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.resetPassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.Authentication.regRequest,
                com.yantrajenie.authentication.Authentication.regResponse>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.Authentication.loginRequest,
                com.yantrajenie.authentication.Authentication.loginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getForgetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.Authentication.forgetPassRequest,
                com.yantrajenie.authentication.Authentication.forgetPassResponse>(
                  this, METHODID_FORGET_PASSWORD)))
          .addMethod(
            getResetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.Authentication.resetPassRequest,
                com.yantrajenie.authentication.Authentication.resetPassResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .build();
    }
  }

  /**
   * <pre>
   *registration, login authentication, Otp generation(forget password), Reset password
   * </pre>
   */
  public static final class authenticationStub extends io.grpc.stub.AbstractStub<authenticationStub> {
    private authenticationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private authenticationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authenticationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new authenticationStub(channel, callOptions);
    }

    /**
     * <pre>
     *registration method with registration table for both user and service provider
     * </pre>
     */
    public void registration(com.yantrajenie.authentication.Authentication.regRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.regResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *for authentication of the user when they login to the system (user and service provider)
     * </pre>
     */
    public void login(com.yantrajenie.authentication.Authentication.loginRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.loginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *forget password(generate an otp)
     * </pre>
     */
    public void forgetPassword(com.yantrajenie.authentication.Authentication.forgetPassRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.forgetPassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *reset password
     * </pre>
     */
    public void resetPassword(com.yantrajenie.authentication.Authentication.resetPassRequest request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.resetPassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *registration, login authentication, Otp generation(forget password), Reset password
   * </pre>
   */
  public static final class authenticationBlockingStub extends io.grpc.stub.AbstractStub<authenticationBlockingStub> {
    private authenticationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private authenticationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authenticationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new authenticationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *registration method with registration table for both user and service provider
     * </pre>
     */
    public com.yantrajenie.authentication.Authentication.regResponse registration(com.yantrajenie.authentication.Authentication.regRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *for authentication of the user when they login to the system (user and service provider)
     * </pre>
     */
    public com.yantrajenie.authentication.Authentication.loginResponse login(com.yantrajenie.authentication.Authentication.loginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *forget password(generate an otp)
     * </pre>
     */
    public com.yantrajenie.authentication.Authentication.forgetPassResponse forgetPassword(com.yantrajenie.authentication.Authentication.forgetPassRequest request) {
      return blockingUnaryCall(
          getChannel(), getForgetPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *reset password
     * </pre>
     */
    public com.yantrajenie.authentication.Authentication.resetPassResponse resetPassword(com.yantrajenie.authentication.Authentication.resetPassRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *registration, login authentication, Otp generation(forget password), Reset password
   * </pre>
   */
  public static final class authenticationFutureStub extends io.grpc.stub.AbstractStub<authenticationFutureStub> {
    private authenticationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private authenticationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected authenticationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new authenticationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *registration method with registration table for both user and service provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.Authentication.regResponse> registration(
        com.yantrajenie.authentication.Authentication.regRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *for authentication of the user when they login to the system (user and service provider)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.Authentication.loginResponse> login(
        com.yantrajenie.authentication.Authentication.loginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *forget password(generate an otp)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.Authentication.forgetPassResponse> forgetPassword(
        com.yantrajenie.authentication.Authentication.forgetPassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *reset password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.Authentication.resetPassResponse> resetPassword(
        com.yantrajenie.authentication.Authentication.resetPassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_FORGET_PASSWORD = 2;
  private static final int METHODID_RESET_PASSWORD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final authenticationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(authenticationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((com.yantrajenie.authentication.Authentication.regRequest) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.regResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.yantrajenie.authentication.Authentication.loginRequest) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.loginResponse>) responseObserver);
          break;
        case METHODID_FORGET_PASSWORD:
          serviceImpl.forgetPassword((com.yantrajenie.authentication.Authentication.forgetPassRequest) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.forgetPassResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.yantrajenie.authentication.Authentication.resetPassRequest) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.Authentication.resetPassResponse>) responseObserver);
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

  private static abstract class authenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    authenticationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yantrajenie.authentication.Authentication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("authentication");
    }
  }

  private static final class authenticationFileDescriptorSupplier
      extends authenticationBaseDescriptorSupplier {
    authenticationFileDescriptorSupplier() {}
  }

  private static final class authenticationMethodDescriptorSupplier
      extends authenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    authenticationMethodDescriptorSupplier(String methodName) {
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
      synchronized (authenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new authenticationFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getForgetPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
