package generated;

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
    comments = "Source: status.proto")
public final class bookingStatusGrpc {

  private bookingStatusGrpc() {}

  public static final String SERVICE_NAME = "bookingStatus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Status.Request,
      generated.Status.Response> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowStatus",
      requestType = generated.Status.Request.class,
      responseType = generated.Status.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Status.Request,
      generated.Status.Response> getShowStatusMethod() {
    io.grpc.MethodDescriptor<generated.Status.Request, generated.Status.Response> getShowStatusMethod;
    if ((getShowStatusMethod = bookingStatusGrpc.getShowStatusMethod) == null) {
      synchronized (bookingStatusGrpc.class) {
        if ((getShowStatusMethod = bookingStatusGrpc.getShowStatusMethod) == null) {
          bookingStatusGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<generated.Status.Request, generated.Status.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingStatus", "ShowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingStatusMethodDescriptorSupplier("ShowStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Status.UpdateRequest,
      generated.Status.Response> getUpdateTicketStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTicketStatus",
      requestType = generated.Status.UpdateRequest.class,
      responseType = generated.Status.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Status.UpdateRequest,
      generated.Status.Response> getUpdateTicketStatusMethod() {
    io.grpc.MethodDescriptor<generated.Status.UpdateRequest, generated.Status.Response> getUpdateTicketStatusMethod;
    if ((getUpdateTicketStatusMethod = bookingStatusGrpc.getUpdateTicketStatusMethod) == null) {
      synchronized (bookingStatusGrpc.class) {
        if ((getUpdateTicketStatusMethod = bookingStatusGrpc.getUpdateTicketStatusMethod) == null) {
          bookingStatusGrpc.getUpdateTicketStatusMethod = getUpdateTicketStatusMethod = 
              io.grpc.MethodDescriptor.<generated.Status.UpdateRequest, generated.Status.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingStatus", "UpdateTicketStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingStatusMethodDescriptorSupplier("UpdateTicketStatus"))
                  .build();
          }
        }
     }
     return getUpdateTicketStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Status.UpdateRequest,
      generated.Status.Response> getUpdateBookingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBookingStatus",
      requestType = generated.Status.UpdateRequest.class,
      responseType = generated.Status.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Status.UpdateRequest,
      generated.Status.Response> getUpdateBookingStatusMethod() {
    io.grpc.MethodDescriptor<generated.Status.UpdateRequest, generated.Status.Response> getUpdateBookingStatusMethod;
    if ((getUpdateBookingStatusMethod = bookingStatusGrpc.getUpdateBookingStatusMethod) == null) {
      synchronized (bookingStatusGrpc.class) {
        if ((getUpdateBookingStatusMethod = bookingStatusGrpc.getUpdateBookingStatusMethod) == null) {
          bookingStatusGrpc.getUpdateBookingStatusMethod = getUpdateBookingStatusMethod = 
              io.grpc.MethodDescriptor.<generated.Status.UpdateRequest, generated.Status.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingStatus", "UpdateBookingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingStatusMethodDescriptorSupplier("UpdateBookingStatus"))
                  .build();
          }
        }
     }
     return getUpdateBookingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Status.Request,
      generated.Status.Response> getInsertNewBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertNewBooking",
      requestType = generated.Status.Request.class,
      responseType = generated.Status.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Status.Request,
      generated.Status.Response> getInsertNewBookingMethod() {
    io.grpc.MethodDescriptor<generated.Status.Request, generated.Status.Response> getInsertNewBookingMethod;
    if ((getInsertNewBookingMethod = bookingStatusGrpc.getInsertNewBookingMethod) == null) {
      synchronized (bookingStatusGrpc.class) {
        if ((getInsertNewBookingMethod = bookingStatusGrpc.getInsertNewBookingMethod) == null) {
          bookingStatusGrpc.getInsertNewBookingMethod = getInsertNewBookingMethod = 
              io.grpc.MethodDescriptor.<generated.Status.Request, generated.Status.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookingStatus", "InsertNewBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Status.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingStatusMethodDescriptorSupplier("InsertNewBooking"))
                  .build();
          }
        }
     }
     return getInsertNewBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookingStatusStub newStub(io.grpc.Channel channel) {
    return new bookingStatusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookingStatusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookingStatusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookingStatusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookingStatusFutureStub(channel);
  }

  /**
   */
  public static abstract class bookingStatusImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(generated.Status.Request request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateTicketStatus(generated.Status.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateBookingStatus(generated.Status.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBookingStatusMethod(), responseObserver);
    }

    /**
     */
    public void insertNewBooking(generated.Status.Request request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertNewBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Status.Request,
                generated.Status.Response>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getUpdateTicketStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Status.UpdateRequest,
                generated.Status.Response>(
                  this, METHODID_UPDATE_TICKET_STATUS)))
          .addMethod(
            getUpdateBookingStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Status.UpdateRequest,
                generated.Status.Response>(
                  this, METHODID_UPDATE_BOOKING_STATUS)))
          .addMethod(
            getInsertNewBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Status.Request,
                generated.Status.Response>(
                  this, METHODID_INSERT_NEW_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class bookingStatusStub extends io.grpc.stub.AbstractStub<bookingStatusStub> {
    private bookingStatusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStatusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStatusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStatusStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(generated.Status.Request request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicketStatus(generated.Status.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBookingStatus(generated.Status.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBookingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertNewBooking(generated.Status.Request request,
        io.grpc.stub.StreamObserver<generated.Status.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertNewBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bookingStatusBlockingStub extends io.grpc.stub.AbstractStub<bookingStatusBlockingStub> {
    private bookingStatusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStatusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStatusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStatusBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Status.Response showStatus(generated.Status.Request request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Status.Response updateTicketStatus(generated.Status.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Status.Response updateBookingStatus(generated.Status.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBookingStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Status.Response insertNewBooking(generated.Status.Request request) {
      return blockingUnaryCall(
          getChannel(), getInsertNewBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bookingStatusFutureStub extends io.grpc.stub.AbstractStub<bookingStatusFutureStub> {
    private bookingStatusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStatusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStatusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStatusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Status.Response> showStatus(
        generated.Status.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Status.Response> updateTicketStatus(
        generated.Status.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Status.Response> updateBookingStatus(
        generated.Status.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBookingStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Status.Response> insertNewBooking(
        generated.Status.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertNewBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_UPDATE_TICKET_STATUS = 1;
  private static final int METHODID_UPDATE_BOOKING_STATUS = 2;
  private static final int METHODID_INSERT_NEW_BOOKING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookingStatusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookingStatusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((generated.Status.Request) request,
              (io.grpc.stub.StreamObserver<generated.Status.Response>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET_STATUS:
          serviceImpl.updateTicketStatus((generated.Status.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<generated.Status.Response>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING_STATUS:
          serviceImpl.updateBookingStatus((generated.Status.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<generated.Status.Response>) responseObserver);
          break;
        case METHODID_INSERT_NEW_BOOKING:
          serviceImpl.insertNewBooking((generated.Status.Request) request,
              (io.grpc.stub.StreamObserver<generated.Status.Response>) responseObserver);
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

  private static abstract class bookingStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookingStatusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.Status.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bookingStatus");
    }
  }

  private static final class bookingStatusFileDescriptorSupplier
      extends bookingStatusBaseDescriptorSupplier {
    bookingStatusFileDescriptorSupplier() {}
  }

  private static final class bookingStatusMethodDescriptorSupplier
      extends bookingStatusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookingStatusMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookingStatusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookingStatusFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getUpdateTicketStatusMethod())
              .addMethod(getUpdateBookingStatusMethod())
              .addMethod(getInsertNewBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
