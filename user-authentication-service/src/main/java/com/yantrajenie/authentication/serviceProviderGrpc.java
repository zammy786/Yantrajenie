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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: spDetails.proto")
public final class serviceProviderGrpc {

  private serviceProviderGrpc() {}

  public static final String SERVICE_NAME = "serviceProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spAddressData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spCreateAddress",
      requestType = com.yantrajenie.authentication.SpDetails.spAddressData.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spAddressData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateAddressMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spAddressData, com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateAddressMethod;
    if ((getSpCreateAddressMethod = serviceProviderGrpc.getSpCreateAddressMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpCreateAddressMethod = serviceProviderGrpc.getSpCreateAddressMethod) == null) {
          serviceProviderGrpc.getSpCreateAddressMethod = getSpCreateAddressMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.spAddressData, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spCreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.spAddressData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spCreateAddress"))
                  .build();
          }
        }
     }
     return getSpCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateAddressData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spUpdateAddress",
      requestType = com.yantrajenie.authentication.SpDetails.spUpdateAddressData.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateAddressData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpUpdateAddressMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateAddressData, com.yantrajenie.authentication.SpDetails.APIResponce> getSpUpdateAddressMethod;
    if ((getSpUpdateAddressMethod = serviceProviderGrpc.getSpUpdateAddressMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpUpdateAddressMethod = serviceProviderGrpc.getSpUpdateAddressMethod) == null) {
          serviceProviderGrpc.getSpUpdateAddressMethod = getSpUpdateAddressMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.spUpdateAddressData, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spUpdateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.spUpdateAddressData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spUpdateAddress"))
                  .build();
          }
        }
     }
     return getSpUpdateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.APIResponce> getDeleteAddressUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAddressUsingId",
      requestType = com.yantrajenie.authentication.SpDetails.commid.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.APIResponce> getDeleteAddressUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.APIResponce> getDeleteAddressUsingIdMethod;
    if ((getDeleteAddressUsingIdMethod = serviceProviderGrpc.getDeleteAddressUsingIdMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getDeleteAddressUsingIdMethod = serviceProviderGrpc.getDeleteAddressUsingIdMethod) == null) {
          serviceProviderGrpc.getDeleteAddressUsingIdMethod = getDeleteAddressUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "deleteAddressUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.commid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("deleteAddressUsingId"))
                  .build();
          }
        }
     }
     return getDeleteAddressUsingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spProfileData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spCreateProfile",
      requestType = com.yantrajenie.authentication.SpDetails.spProfileData.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spProfileData,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateProfileMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spProfileData, com.yantrajenie.authentication.SpDetails.APIResponce> getSpCreateProfileMethod;
    if ((getSpCreateProfileMethod = serviceProviderGrpc.getSpCreateProfileMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpCreateProfileMethod = serviceProviderGrpc.getSpCreateProfileMethod) == null) {
          serviceProviderGrpc.getSpCreateProfileMethod = getSpCreateProfileMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.spProfileData, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spCreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.spProfileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spCreateProfile"))
                  .build();
          }
        }
     }
     return getSpCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateProfile,
      com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpUpdateProfileUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spUpdateProfileUsingId",
      requestType = com.yantrajenie.authentication.SpDetails.spUpdateProfile.class,
      responseType = com.yantrajenie.authentication.SpDetails.ProfileDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateProfile,
      com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpUpdateProfileUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.spUpdateProfile, com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpUpdateProfileUsingIdMethod;
    if ((getSpUpdateProfileUsingIdMethod = serviceProviderGrpc.getSpUpdateProfileUsingIdMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpUpdateProfileUsingIdMethod = serviceProviderGrpc.getSpUpdateProfileUsingIdMethod) == null) {
          serviceProviderGrpc.getSpUpdateProfileUsingIdMethod = getSpUpdateProfileUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.spUpdateProfile, com.yantrajenie.authentication.SpDetails.ProfileDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spUpdateProfileUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.spUpdateProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.ProfileDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spUpdateProfileUsingId"))
                  .build();
          }
        }
     }
     return getSpUpdateProfileUsingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spGetProfileDetailsUsingId",
      requestType = com.yantrajenie.authentication.SpDetails.commid.class,
      responseType = com.yantrajenie.authentication.SpDetails.ProfileDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.ProfileDetails> getSpGetProfileDetailsUsingIdMethod;
    if ((getSpGetProfileDetailsUsingIdMethod = serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpGetProfileDetailsUsingIdMethod = serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod) == null) {
          serviceProviderGrpc.getSpGetProfileDetailsUsingIdMethod = getSpGetProfileDetailsUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.ProfileDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spGetProfileDetailsUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.commid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.ProfileDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spGetProfileDetailsUsingId"))
                  .build();
          }
        }
     }
     return getSpGetProfileDetailsUsingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpDeleteProfileUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spDeleteProfileUsingId",
      requestType = com.yantrajenie.authentication.SpDetails.commid.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid,
      com.yantrajenie.authentication.SpDetails.APIResponce> getSpDeleteProfileUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.APIResponce> getSpDeleteProfileUsingIdMethod;
    if ((getSpDeleteProfileUsingIdMethod = serviceProviderGrpc.getSpDeleteProfileUsingIdMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getSpDeleteProfileUsingIdMethod = serviceProviderGrpc.getSpDeleteProfileUsingIdMethod) == null) {
          serviceProviderGrpc.getSpDeleteProfileUsingIdMethod = getSpDeleteProfileUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.commid, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "spDeleteProfileUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.commid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("spDeleteProfileUsingId"))
                  .build();
          }
        }
     }
     return getSpDeleteProfileUsingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.ServiceProvider,
      com.yantrajenie.authentication.SpDetails.APIResponce> getServiceProviderStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServiceProviderStatus",
      requestType = com.yantrajenie.authentication.SpDetails.ServiceProvider.class,
      responseType = com.yantrajenie.authentication.SpDetails.APIResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.ServiceProvider,
      com.yantrajenie.authentication.SpDetails.APIResponce> getServiceProviderStatusMethod() {
    io.grpc.MethodDescriptor<com.yantrajenie.authentication.SpDetails.ServiceProvider, com.yantrajenie.authentication.SpDetails.APIResponce> getServiceProviderStatusMethod;
    if ((getServiceProviderStatusMethod = serviceProviderGrpc.getServiceProviderStatusMethod) == null) {
      synchronized (serviceProviderGrpc.class) {
        if ((getServiceProviderStatusMethod = serviceProviderGrpc.getServiceProviderStatusMethod) == null) {
          serviceProviderGrpc.getServiceProviderStatusMethod = getServiceProviderStatusMethod = 
              io.grpc.MethodDescriptor.<com.yantrajenie.authentication.SpDetails.ServiceProvider, com.yantrajenie.authentication.SpDetails.APIResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "serviceProvider", "ServiceProviderStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.ServiceProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantrajenie.authentication.SpDetails.APIResponce.getDefaultInstance()))
                  .setSchemaDescriptor(new serviceProviderMethodDescriptorSupplier("ServiceProviderStatus"))
                  .build();
          }
        }
     }
     return getServiceProviderStatusMethod;
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
    public void spCreateAddress(com.yantrajenie.authentication.SpDetails.spAddressData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getSpCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void spUpdateAddress(com.yantrajenie.authentication.SpDetails.spUpdateAddressData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getSpUpdateAddressMethod(), responseObserver);
    }

    /**
     */
    public void deleteAddressUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAddressUsingIdMethod(), responseObserver);
    }

    /**
     */
    public void spCreateProfile(com.yantrajenie.authentication.SpDetails.spProfileData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getSpCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void spUpdateProfileUsingId(com.yantrajenie.authentication.SpDetails.spUpdateProfile request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getSpUpdateProfileUsingIdMethod(), responseObserver);
    }

    /**
     */
    public void spGetProfileDetailsUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getSpGetProfileDetailsUsingIdMethod(), responseObserver);
    }

    /**
     */
    public void spDeleteProfileUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getSpDeleteProfileUsingIdMethod(), responseObserver);
    }

    /**
     */
    public void serviceProviderStatus(com.yantrajenie.authentication.SpDetails.ServiceProvider request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnimplementedUnaryCall(getServiceProviderStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpCreateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.spAddressData,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_SP_CREATE_ADDRESS)))
          .addMethod(
            getSpUpdateAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.spUpdateAddressData,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_SP_UPDATE_ADDRESS)))
          .addMethod(
            getDeleteAddressUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.commid,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_DELETE_ADDRESS_USING_ID)))
          .addMethod(
            getSpCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.spProfileData,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_SP_CREATE_PROFILE)))
          .addMethod(
            getSpUpdateProfileUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.spUpdateProfile,
                com.yantrajenie.authentication.SpDetails.ProfileDetails>(
                  this, METHODID_SP_UPDATE_PROFILE_USING_ID)))
          .addMethod(
            getSpGetProfileDetailsUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.commid,
                com.yantrajenie.authentication.SpDetails.ProfileDetails>(
                  this, METHODID_SP_GET_PROFILE_DETAILS_USING_ID)))
          .addMethod(
            getSpDeleteProfileUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.commid,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_SP_DELETE_PROFILE_USING_ID)))
          .addMethod(
            getServiceProviderStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantrajenie.authentication.SpDetails.ServiceProvider,
                com.yantrajenie.authentication.SpDetails.APIResponce>(
                  this, METHODID_SERVICE_PROVIDER_STATUS)))
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
    public void spCreateAddress(com.yantrajenie.authentication.SpDetails.spAddressData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spUpdateAddress(com.yantrajenie.authentication.SpDetails.spUpdateAddressData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAddressUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAddressUsingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spCreateProfile(com.yantrajenie.authentication.SpDetails.spProfileData request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spUpdateProfileUsingId(com.yantrajenie.authentication.SpDetails.spUpdateProfile request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpUpdateProfileUsingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spGetProfileDetailsUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpGetProfileDetailsUsingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spDeleteProfileUsingId(com.yantrajenie.authentication.SpDetails.commid request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpDeleteProfileUsingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serviceProviderStatus(com.yantrajenie.authentication.SpDetails.ServiceProvider request,
        io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServiceProviderStatusMethod(), getCallOptions()), request, responseObserver);
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
    public com.yantrajenie.authentication.SpDetails.APIResponce spCreateAddress(com.yantrajenie.authentication.SpDetails.spAddressData request) {
      return blockingUnaryCall(
          getChannel(), getSpCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.APIResponce spUpdateAddress(com.yantrajenie.authentication.SpDetails.spUpdateAddressData request) {
      return blockingUnaryCall(
          getChannel(), getSpUpdateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.APIResponce deleteAddressUsingId(com.yantrajenie.authentication.SpDetails.commid request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAddressUsingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.APIResponce spCreateProfile(com.yantrajenie.authentication.SpDetails.spProfileData request) {
      return blockingUnaryCall(
          getChannel(), getSpCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.ProfileDetails spUpdateProfileUsingId(com.yantrajenie.authentication.SpDetails.spUpdateProfile request) {
      return blockingUnaryCall(
          getChannel(), getSpUpdateProfileUsingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.ProfileDetails spGetProfileDetailsUsingId(com.yantrajenie.authentication.SpDetails.commid request) {
      return blockingUnaryCall(
          getChannel(), getSpGetProfileDetailsUsingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.APIResponce spDeleteProfileUsingId(com.yantrajenie.authentication.SpDetails.commid request) {
      return blockingUnaryCall(
          getChannel(), getSpDeleteProfileUsingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantrajenie.authentication.SpDetails.APIResponce serviceProviderStatus(com.yantrajenie.authentication.SpDetails.ServiceProvider request) {
      return blockingUnaryCall(
          getChannel(), getServiceProviderStatusMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> spCreateAddress(
        com.yantrajenie.authentication.SpDetails.spAddressData request) {
      return futureUnaryCall(
          getChannel().newCall(getSpCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> spUpdateAddress(
        com.yantrajenie.authentication.SpDetails.spUpdateAddressData request) {
      return futureUnaryCall(
          getChannel().newCall(getSpUpdateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> deleteAddressUsingId(
        com.yantrajenie.authentication.SpDetails.commid request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAddressUsingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> spCreateProfile(
        com.yantrajenie.authentication.SpDetails.spProfileData request) {
      return futureUnaryCall(
          getChannel().newCall(getSpCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.ProfileDetails> spUpdateProfileUsingId(
        com.yantrajenie.authentication.SpDetails.spUpdateProfile request) {
      return futureUnaryCall(
          getChannel().newCall(getSpUpdateProfileUsingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.ProfileDetails> spGetProfileDetailsUsingId(
        com.yantrajenie.authentication.SpDetails.commid request) {
      return futureUnaryCall(
          getChannel().newCall(getSpGetProfileDetailsUsingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> spDeleteProfileUsingId(
        com.yantrajenie.authentication.SpDetails.commid request) {
      return futureUnaryCall(
          getChannel().newCall(getSpDeleteProfileUsingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantrajenie.authentication.SpDetails.APIResponce> serviceProviderStatus(
        com.yantrajenie.authentication.SpDetails.ServiceProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getServiceProviderStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SP_CREATE_ADDRESS = 0;
  private static final int METHODID_SP_UPDATE_ADDRESS = 1;
  private static final int METHODID_DELETE_ADDRESS_USING_ID = 2;
  private static final int METHODID_SP_CREATE_PROFILE = 3;
  private static final int METHODID_SP_UPDATE_PROFILE_USING_ID = 4;
  private static final int METHODID_SP_GET_PROFILE_DETAILS_USING_ID = 5;
  private static final int METHODID_SP_DELETE_PROFILE_USING_ID = 6;
  private static final int METHODID_SERVICE_PROVIDER_STATUS = 7;

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
        case METHODID_SP_CREATE_ADDRESS:
          serviceImpl.spCreateAddress((com.yantrajenie.authentication.SpDetails.spAddressData) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
          break;
        case METHODID_SP_UPDATE_ADDRESS:
          serviceImpl.spUpdateAddress((com.yantrajenie.authentication.SpDetails.spUpdateAddressData) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
          break;
        case METHODID_DELETE_ADDRESS_USING_ID:
          serviceImpl.deleteAddressUsingId((com.yantrajenie.authentication.SpDetails.commid) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
          break;
        case METHODID_SP_CREATE_PROFILE:
          serviceImpl.spCreateProfile((com.yantrajenie.authentication.SpDetails.spProfileData) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
          break;
        case METHODID_SP_UPDATE_PROFILE_USING_ID:
          serviceImpl.spUpdateProfileUsingId((com.yantrajenie.authentication.SpDetails.spUpdateProfile) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails>) responseObserver);
          break;
        case METHODID_SP_GET_PROFILE_DETAILS_USING_ID:
          serviceImpl.spGetProfileDetailsUsingId((com.yantrajenie.authentication.SpDetails.commid) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.ProfileDetails>) responseObserver);
          break;
        case METHODID_SP_DELETE_PROFILE_USING_ID:
          serviceImpl.spDeleteProfileUsingId((com.yantrajenie.authentication.SpDetails.commid) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
          break;
        case METHODID_SERVICE_PROVIDER_STATUS:
          serviceImpl.serviceProviderStatus((com.yantrajenie.authentication.SpDetails.ServiceProvider) request,
              (io.grpc.stub.StreamObserver<com.yantrajenie.authentication.SpDetails.APIResponce>) responseObserver);
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
      return com.yantrajenie.authentication.SpDetails.getDescriptor();
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
              .addMethod(getSpCreateAddressMethod())
              .addMethod(getSpUpdateAddressMethod())
              .addMethod(getDeleteAddressUsingIdMethod())
              .addMethod(getSpCreateProfileMethod())
              .addMethod(getSpUpdateProfileUsingIdMethod())
              .addMethod(getSpGetProfileDetailsUsingIdMethod())
              .addMethod(getSpDeleteProfileUsingIdMethod())
              .addMethod(getServiceProviderStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
