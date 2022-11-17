package com.yantragenie.spdetail;

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
    comments = "Source: spDetails.proto")
public final class serviceProviderGrpc {

  private serviceProviderGrpc() {}

  public static final String SERVICE_NAME = "serviceProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yantragenie.spdetail.SpDetails.commid,
      com.yantragenie.spdetail.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spGetProfileDetailsUsingId",
      requestType = com.yantragenie.spdetail.SpDetails.commid.class,
      responseType = com.yantragenie.spdetail.SpDetails.ProfileDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.spdetail.SpDetails.commid,
      com.yantragenie.spdetail.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.spdetail.SpDetails.commid, com.yantragenie.spdetail.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod;
    if ((getSpGetProfileDetailsUsingIdMethod = serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpGetProfileDetailsUsingIdMethod = serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod) == null) {
          serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod = getSpGetProfileDetailsUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.spdetail.SpDetails.commid, com.yantragenie.spdetail.SpDetails.ProfileDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spGetProfileDetailsUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.spdetail.SpDetails.commid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.spdetail.SpDetails.ProfileDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spGetProfileDetailsUsingId"))
                  .build();
          }
        }
     }
     return getSpGetProfileDetailsUsingIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serviceProviderStub newStub(io.grpc.Channel channel) {
    return new serviceProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serviceProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new serviceProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serviceProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new serviceProviderFutureStub(channel);
  }

  /**
   */
  public static abstract class serviceProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void spGetProfileDetailsUsingId(com.yantragenie.spdetail.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantragenie.spdetail.SpDetails.ProfileDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getSpGetProfileDetailsUsingIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpGetProfileDetailsUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.spdetail.SpDetails.commid,
                com.yantragenie.spdetail.SpDetails.ProfileDetails>(
                  this, METHODID_SP_GET_PROFILE_DETAILS_USING_ID)))
          .build();
    }
  }

  /**
   */
  public static final class serviceProviderStub extends io.grpc.stub.AbstractStub<serviceProviderStub> {
    private serviceProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceProviderStub(channel, callOptions);
    }

    /**
     */
    public void spGetProfileDetailsUsingId(com.yantragenie.spdetail.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantragenie.spdetail.SpDetails.ProfileDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpGetProfileDetailsUsingIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class serviceProviderBlockingStub extends io.grpc.stub.AbstractStub<serviceProviderBlockingStub> {
    private serviceProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yantragenie.spdetail.SpDetails.ProfileDetails spGetProfileDetailsUsingId(com.yantragenie.spdetail.SpDetails.commid request) {
      return blockingUnaryCall(
          getChannel(), getSpGetProfileDetailsUsingIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class serviceProviderFutureStub extends io.grpc.stub.AbstractStub<serviceProviderFutureStub> {
    private serviceProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.spdetail.SpDetails.ProfileDetails> spGetProfileDetailsUsingId(
        com.yantragenie.spdetail.SpDetails.commid request) {
      return futureUnaryCall(
          getChannel().newCall(getSpGetProfileDetailsUsingIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SP_GET_PROFILE_DETAILS_USING_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final serviceProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(serviceProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SP_GET_PROFILE_DETAILS_USING_ID:
          serviceImpl.spGetProfileDetailsUsingId((com.yantragenie.spdetail.SpDetails.commid) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.spdetail.SpDetails.ProfileDetails>) responseObserver);
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

  private static abstract class serviceProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    serviceProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yantragenie.spdetail.SpDetails.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("serviceProvider");
    }
  }

  private static final class serviceProviderFileDescriptorSupplier
      extends serviceProviderBaseDescriptorSupplier {
    serviceProviderFileDescriptorSupplier() {}
  }

  private static final class serviceProviderMethodDescriptorSupplier
      extends serviceProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    serviceProviderMethodDescriptorSupplier(String methodName) {
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
      synchronized (serviceProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serviceProviderFileDescriptorSupplier())
              .addMethod(getSpGetProfileDetailsUsingIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
