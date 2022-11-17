package com.yantragenie.bookings;

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
    comments = "Source: booking.proto")
public final class bookingGrpc {

  private bookingGrpc() {}

  public static final String SERVICE_NAME = "booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailUsingUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBookingDetailUsingUserId",
      requestType = com.yantragenie.bookings.Booking.commonid.class,
      responseType = com.yantragenie.bookings.Booking.userBookings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailUsingUserIdMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailUsingUserIdMethod;
    if ((getGetBookingDetailUsingUserIdMethod = bookingGrpc.getGetBookingDetailUsingUserIdMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getGetBookingDetailUsingUserIdMethod = bookingGrpc.getGetBookingDetailUsingUserIdMethod) == null) {
          bookingGrpc.getGetBookingDetailUsingUserIdMethod = getGetBookingDetailUsingUserIdMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.userBookings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "booking", "getBookingDetailUsingUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.commonid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.userBookings.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("getBookingDetailUsingUserId"))
                  .build();
          }
        }
     }
     return getGetBookingDetailUsingUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailsUsingServiceProviderIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBookingDetailsUsingServiceProviderId",
      requestType = com.yantragenie.bookings.Booking.commonid.class,
      responseType = com.yantragenie.bookings.Booking.userBookings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailsUsingServiceProviderIdMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.userBookings> getGetBookingDetailsUsingServiceProviderIdMethod;
    if ((getGetBookingDetailsUsingServiceProviderIdMethod = bookingGrpc.getGetBookingDetailsUsingServiceProviderIdMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getGetBookingDetailsUsingServiceProviderIdMethod = bookingGrpc.getGetBookingDetailsUsingServiceProviderIdMethod) == null) {
          bookingGrpc.getGetBookingDetailsUsingServiceProviderIdMethod = getGetBookingDetailsUsingServiceProviderIdMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.userBookings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "booking", "getBookingDetailsUsingServiceProviderId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.commonid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.userBookings.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("getBookingDetailsUsingServiceProviderId"))
                  .build();
          }
        }
     }
     return getGetBookingDetailsUsingServiceProviderIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.bookingDetails> getGetBookingDetailsUsingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBookingDetailsUsingId",
      requestType = com.yantragenie.bookings.Booking.commonid.class,
      responseType = com.yantragenie.bookings.Booking.bookingDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.bookingDetails> getGetBookingDetailsUsingIdMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.bookingDetails> getGetBookingDetailsUsingIdMethod;
    if ((getGetBookingDetailsUsingIdMethod = bookingGrpc.getGetBookingDetailsUsingIdMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getGetBookingDetailsUsingIdMethod = bookingGrpc.getGetBookingDetailsUsingIdMethod) == null) {
          bookingGrpc.getGetBookingDetailsUsingIdMethod = getGetBookingDetailsUsingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.bookingDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "getBookingDetailsUsingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.commonid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.bookingDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("getBookingDetailsUsingId"))
                  .build();
          }
        }
     }
     return getGetBookingDetailsUsingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingCreate,
      com.yantragenie.bookings.Booking.BookingApiResponse> getCreateBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createBooking",
      requestType = com.yantragenie.bookings.Booking.bookingCreate.class,
      responseType = com.yantragenie.bookings.Booking.BookingApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingCreate,
      com.yantragenie.bookings.Booking.BookingApiResponse> getCreateBookingMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingCreate, com.yantragenie.bookings.Booking.BookingApiResponse> getCreateBookingMethod;
    if ((getCreateBookingMethod = bookingGrpc.getCreateBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getCreateBookingMethod = bookingGrpc.getCreateBookingMethod) == null) {
          bookingGrpc.getCreateBookingMethod = getCreateBookingMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.bookingCreate, com.yantragenie.bookings.Booking.BookingApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "createBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.bookingCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.BookingApiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("createBooking"))
                  .build();
          }
        }
     }
     return getCreateBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingupdatepayload,
      com.yantragenie.bookings.Booking.BookingApiResponse> getUpdateBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBooking",
      requestType = com.yantragenie.bookings.Booking.bookingupdatepayload.class,
      responseType = com.yantragenie.bookings.Booking.BookingApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingupdatepayload,
      com.yantragenie.bookings.Booking.BookingApiResponse> getUpdateBookingMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.bookingupdatepayload, com.yantragenie.bookings.Booking.BookingApiResponse> getUpdateBookingMethod;
    if ((getUpdateBookingMethod = bookingGrpc.getUpdateBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getUpdateBookingMethod = bookingGrpc.getUpdateBookingMethod) == null) {
          bookingGrpc.getUpdateBookingMethod = getUpdateBookingMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.bookingupdatepayload, com.yantragenie.bookings.Booking.BookingApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "updateBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.bookingupdatepayload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.BookingApiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("updateBooking"))
                  .build();
          }
        }
     }
     return getUpdateBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.commonResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelBooking",
      requestType = com.yantragenie.bookings.Booking.commonid.class,
      responseType = com.yantragenie.bookings.Booking.commonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid,
      com.yantragenie.bookings.Booking.commonResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.commonResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = bookingGrpc.getCancelBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getCancelBookingMethod = bookingGrpc.getCancelBookingMethod) == null) {
          bookingGrpc.getCancelBookingMethod = getCancelBookingMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.bookings.Booking.commonid, com.yantragenie.bookings.Booking.commonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "cancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.commonid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.bookings.Booking.commonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("cancelBooking"))
                  .build();
          }
        }
     }
     return getCancelBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookingStub newStub(io.grpc.Channel channel) {
    return new bookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookingFutureStub(channel);
  }

  /**
   */
  public static abstract class bookingImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBookingDetailUsingUserId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingDetailUsingUserIdMethod(), responseObserver);
    }

    /**
     */
    public void getBookingDetailsUsingServiceProviderId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingDetailsUsingServiceProviderIdMethod(), responseObserver);
    }

    /**
     */
    public void getBookingDetailsUsingId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.bookingDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBookingDetailsUsingIdMethod(), responseObserver);
    }

    /**
     */
    public void createBooking(com.yantragenie.bookings.Booking.bookingCreate request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBookingMethod(), responseObserver);
    }

    /**
     */
    public void updateBooking(com.yantragenie.bookings.Booking.bookingupdatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBookingMethod(), responseObserver);
    }

    /**
     */
    public void cancelBooking(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.commonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBookingDetailUsingUserIdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.commonid,
                com.yantragenie.bookings.Booking.userBookings>(
                  this, METHODID_GET_BOOKING_DETAIL_USING_USER_ID)))
          .addMethod(
            getGetBookingDetailsUsingServiceProviderIdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.commonid,
                com.yantragenie.bookings.Booking.userBookings>(
                  this, METHODID_GET_BOOKING_DETAILS_USING_SERVICE_PROVIDER_ID)))
          .addMethod(
            getGetBookingDetailsUsingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.commonid,
                com.yantragenie.bookings.Booking.bookingDetails>(
                  this, METHODID_GET_BOOKING_DETAILS_USING_ID)))
          .addMethod(
            getCreateBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.bookingCreate,
                com.yantragenie.bookings.Booking.BookingApiResponse>(
                  this, METHODID_CREATE_BOOKING)))
          .addMethod(
            getUpdateBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.bookingupdatepayload,
                com.yantragenie.bookings.Booking.BookingApiResponse>(
                  this, METHODID_UPDATE_BOOKING)))
          .addMethod(
            getCancelBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.bookings.Booking.commonid,
                com.yantragenie.bookings.Booking.commonResponse>(
                  this, METHODID_CANCEL_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class bookingStub extends io.grpc.stub.AbstractStub<bookingStub> {
    private bookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStub(channel, callOptions);
    }

    /**
     */
    public void getBookingDetailUsingUserId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBookingDetailUsingUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookingDetailsUsingServiceProviderId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBookingDetailsUsingServiceProviderIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookingDetailsUsingId(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.bookingDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBookingDetailsUsingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBooking(com.yantragenie.bookings.Booking.bookingCreate request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBooking(com.yantragenie.bookings.Booking.bookingupdatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBooking(com.yantragenie.bookings.Booking.commonid request,
        io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.commonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bookingBlockingStub extends io.grpc.stub.AbstractStub<bookingBlockingStub> {
    private bookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.yantragenie.bookings.Booking.userBookings> getBookingDetailUsingUserId(
        com.yantragenie.bookings.Booking.commonid request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBookingDetailUsingUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.yantragenie.bookings.Booking.userBookings> getBookingDetailsUsingServiceProviderId(
        com.yantragenie.bookings.Booking.commonid request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBookingDetailsUsingServiceProviderIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.bookings.Booking.bookingDetails getBookingDetailsUsingId(com.yantragenie.bookings.Booking.commonid request) {
      return blockingUnaryCall(
          getChannel(), getGetBookingDetailsUsingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.bookings.Booking.BookingApiResponse createBooking(com.yantragenie.bookings.Booking.bookingCreate request) {
      return blockingUnaryCall(
          getChannel(), getCreateBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.bookings.Booking.BookingApiResponse updateBooking(com.yantragenie.bookings.Booking.bookingupdatepayload request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.bookings.Booking.commonResponse cancelBooking(com.yantragenie.bookings.Booking.commonid request) {
      return blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bookingFutureStub extends io.grpc.stub.AbstractStub<bookingFutureStub> {
    private bookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.bookings.Booking.bookingDetails> getBookingDetailsUsingId(
        com.yantragenie.bookings.Booking.commonid request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBookingDetailsUsingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.bookings.Booking.BookingApiResponse> createBooking(
        com.yantragenie.bookings.Booking.bookingCreate request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.bookings.Booking.BookingApiResponse> updateBooking(
        com.yantragenie.bookings.Booking.bookingupdatepayload request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.bookings.Booking.commonResponse> cancelBooking(
        com.yantragenie.bookings.Booking.commonid request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOKING_DETAIL_USING_USER_ID = 0;
  private static final int METHODID_GET_BOOKING_DETAILS_USING_SERVICE_PROVIDER_ID = 1;
  private static final int METHODID_GET_BOOKING_DETAILS_USING_ID = 2;
  private static final int METHODID_CREATE_BOOKING = 3;
  private static final int METHODID_UPDATE_BOOKING = 4;
  private static final int METHODID_CANCEL_BOOKING = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOKING_DETAIL_USING_USER_ID:
          serviceImpl.getBookingDetailUsingUserId((com.yantragenie.bookings.Booking.commonid) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings>) responseObserver);
          break;
        case METHODID_GET_BOOKING_DETAILS_USING_SERVICE_PROVIDER_ID:
          serviceImpl.getBookingDetailsUsingServiceProviderId((com.yantragenie.bookings.Booking.commonid) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.userBookings>) responseObserver);
          break;
        case METHODID_GET_BOOKING_DETAILS_USING_ID:
          serviceImpl.getBookingDetailsUsingId((com.yantragenie.bookings.Booking.commonid) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.bookingDetails>) responseObserver);
          break;
        case METHODID_CREATE_BOOKING:
          serviceImpl.createBooking((com.yantragenie.bookings.Booking.bookingCreate) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING:
          serviceImpl.updateBooking((com.yantragenie.bookings.Booking.bookingupdatepayload) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.BookingApiResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((com.yantragenie.bookings.Booking.commonid) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.bookings.Booking.commonResponse>) responseObserver);
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

  private static abstract class bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yantragenie.bookings.Booking.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("booking");
    }
  }

  private static final class bookingFileDescriptorSupplier
      extends bookingBaseDescriptorSupplier {
    bookingFileDescriptorSupplier() {}
  }

  private static final class bookingMethodDescriptorSupplier
      extends bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookingFileDescriptorSupplier())
              .addMethod(getGetBookingDetailUsingUserIdMethod())
              .addMethod(getGetBookingDetailsUsingServiceProviderIdMethod())
              .addMethod(getGetBookingDetailsUsingIdMethod())
              .addMethod(getCreateBookingMethod())
              .addMethod(getUpdateBookingMethod())
              .addMethod(getCancelBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
