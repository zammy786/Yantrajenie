package com.yantragenie.ticket;

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
    comments = "Source: ticket.proto")
public final class ticketGrpc {

  private ticketGrpc() {}

  public static final String SERVICE_NAME = "ticket";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload,
      com.yantragenie.ticket.Ticket.id> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = com.yantragenie.ticket.Ticket.ticketcreatepayload.class,
      responseType = com.yantragenie.ticket.Ticket.id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload,
      com.yantragenie.ticket.Ticket.id> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload, com.yantragenie.ticket.Ticket.id> getCreateTicketMethod;
    if ((getCreateTicketMethod = ticketGrpc.getCreateTicketMethod) == null) {
      synchronized (ticketGrpc.class) {
        if ((getCreateTicketMethod = ticketGrpc.getCreateTicketMethod) == null) {
          ticketGrpc.getCreateTicketMethod = getCreateTicketMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.ticket.Ticket.ticketcreatepayload, com.yantragenie.ticket.Ticket.id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket", "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.ticketcreatepayload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.id.getDefaultInstance()))
                  .setSchemaDescriptor(new ticketMethodDescriptorSupplier("createTicket"))
                  .build();
          }
        }
     }
     return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.uniqueId,
      com.yantragenie.ticket.Ticket.ticketdetails> getGetTicketFromBookingIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketFromBookingId",
      requestType = com.yantragenie.ticket.Ticket.uniqueId.class,
      responseType = com.yantragenie.ticket.Ticket.ticketdetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.uniqueId,
      com.yantragenie.ticket.Ticket.ticketdetails> getGetTicketFromBookingIdMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.uniqueId, com.yantragenie.ticket.Ticket.ticketdetails> getGetTicketFromBookingIdMethod;
    if ((getGetTicketFromBookingIdMethod = ticketGrpc.getGetTicketFromBookingIdMethod) == null) {
      synchronized (ticketGrpc.class) {
        if ((getGetTicketFromBookingIdMethod = ticketGrpc.getGetTicketFromBookingIdMethod) == null) {
          ticketGrpc.getGetTicketFromBookingIdMethod = getGetTicketFromBookingIdMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.ticket.Ticket.uniqueId, com.yantragenie.ticket.Ticket.ticketdetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket", "getTicketFromBookingId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.uniqueId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.ticketdetails.getDefaultInstance()))
                  .setSchemaDescriptor(new ticketMethodDescriptorSupplier("getTicketFromBookingId"))
                  .build();
          }
        }
     }
     return getGetTicketFromBookingIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload,
      com.yantragenie.ticket.Ticket.id> getUpdateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTicket",
      requestType = com.yantragenie.ticket.Ticket.ticketcreatepayload.class,
      responseType = com.yantragenie.ticket.Ticket.id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload,
      com.yantragenie.ticket.Ticket.id> getUpdateTicketMethod() {
    io.grpc.MethodDescriptor<com.yantragenie.ticket.Ticket.ticketcreatepayload, com.yantragenie.ticket.Ticket.id> getUpdateTicketMethod;
    if ((getUpdateTicketMethod = ticketGrpc.getUpdateTicketMethod) == null) {
      synchronized (ticketGrpc.class) {
        if ((getUpdateTicketMethod = ticketGrpc.getUpdateTicketMethod) == null) {
          ticketGrpc.getUpdateTicketMethod = getUpdateTicketMethod = 
              io.grpc.MethodDescriptor.<com.yantragenie.ticket.Ticket.ticketcreatepayload, com.yantragenie.ticket.Ticket.id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ticket", "updateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.ticketcreatepayload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yantragenie.ticket.Ticket.id.getDefaultInstance()))
                  .setSchemaDescriptor(new ticketMethodDescriptorSupplier("updateTicket"))
                  .build();
          }
        }
     }
     return getUpdateTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ticketStub newStub(io.grpc.Channel channel) {
    return new ticketStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ticketBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ticketBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ticketFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ticketFutureStub(channel);
  }

  /**
   */
  public static abstract class ticketImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void getTicketFromBookingId(com.yantragenie.ticket.Ticket.uniqueId request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.ticketdetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketFromBookingIdMethod(), responseObserver);
    }

    /**
     */
    public void updateTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.ticket.Ticket.ticketcreatepayload,
                com.yantragenie.ticket.Ticket.id>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getGetTicketFromBookingIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.ticket.Ticket.uniqueId,
                com.yantragenie.ticket.Ticket.ticketdetails>(
                  this, METHODID_GET_TICKET_FROM_BOOKING_ID)))
          .addMethod(
            getUpdateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yantragenie.ticket.Ticket.ticketcreatepayload,
                com.yantragenie.ticket.Ticket.id>(
                  this, METHODID_UPDATE_TICKET)))
          .build();
    }
  }

  /**
   */
  public static final class ticketStub extends io.grpc.stub.AbstractStub<ticketStub> {
    private ticketStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketStub(channel, callOptions);
    }

    /**
     */
    public void createTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketFromBookingId(com.yantragenie.ticket.Ticket.uniqueId request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.ticketdetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketFromBookingIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request,
        io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ticketBlockingStub extends io.grpc.stub.AbstractStub<ticketBlockingStub> {
    private ticketBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yantragenie.ticket.Ticket.id createTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.ticket.Ticket.ticketdetails getTicketFromBookingId(com.yantragenie.ticket.Ticket.uniqueId request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketFromBookingIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.yantragenie.ticket.Ticket.id updateTicket(com.yantragenie.ticket.Ticket.ticketcreatepayload request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ticketFutureStub extends io.grpc.stub.AbstractStub<ticketFutureStub> {
    private ticketFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.ticket.Ticket.id> createTicket(
        com.yantragenie.ticket.Ticket.ticketcreatepayload request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.ticket.Ticket.ticketdetails> getTicketFromBookingId(
        com.yantragenie.ticket.Ticket.uniqueId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketFromBookingIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yantragenie.ticket.Ticket.id> updateTicket(
        com.yantragenie.ticket.Ticket.ticketcreatepayload request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_GET_TICKET_FROM_BOOKING_ID = 1;
  private static final int METHODID_UPDATE_TICKET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ticketImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ticketImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.yantragenie.ticket.Ticket.ticketcreatepayload) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id>) responseObserver);
          break;
        case METHODID_GET_TICKET_FROM_BOOKING_ID:
          serviceImpl.getTicketFromBookingId((com.yantragenie.ticket.Ticket.uniqueId) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.ticketdetails>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET:
          serviceImpl.updateTicket((com.yantragenie.ticket.Ticket.ticketcreatepayload) request,
              (io.grpc.stub.StreamObserver<com.yantragenie.ticket.Ticket.id>) responseObserver);
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

  private static abstract class ticketBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ticketBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yantragenie.ticket.Ticket.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ticket");
    }
  }

  private static final class ticketFileDescriptorSupplier
      extends ticketBaseDescriptorSupplier {
    ticketFileDescriptorSupplier() {}
  }

  private static final class ticketMethodDescriptorSupplier
      extends ticketBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ticketMethodDescriptorSupplier(String methodName) {
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
      synchronized (ticketGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ticketFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetTicketFromBookingIdMethod())
              .addMethod(getUpdateTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
