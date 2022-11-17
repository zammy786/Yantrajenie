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
    comments = "Source: userFeedback.proto")
public final class FeedBackGrpc {

  private FeedBackGrpc() {}

  public static final String SERVICE_NAME = "FeedBack";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.UserFeedback.feedbackMessage,
      org.example.UserFeedback.feedbackResponse> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Feedback",
      requestType = org.example.UserFeedback.feedbackMessage.class,
      responseType = org.example.UserFeedback.feedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserFeedback.feedbackMessage,
      org.example.UserFeedback.feedbackResponse> getFeedbackMethod() {
    io.grpc.MethodDescriptor<org.example.UserFeedback.feedbackMessage, org.example.UserFeedback.feedbackResponse> getFeedbackMethod;
    if ((getFeedbackMethod = FeedBackGrpc.getFeedbackMethod) == null) {
      synchronized (FeedBackGrpc.class) {
        if ((getFeedbackMethod = FeedBackGrpc.getFeedbackMethod) == null) {
          FeedBackGrpc.getFeedbackMethod = getFeedbackMethod = 
              io.grpc.MethodDescriptor.<org.example.UserFeedback.feedbackMessage, org.example.UserFeedback.feedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedBack", "Feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.feedbackMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.feedbackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedBackMethodDescriptorSupplier("Feedback"))
                  .build();
          }
        }
     }
     return getFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserFeedback.rmvFeedback,
      org.example.UserFeedback.feedbackResponse> getDeleteFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFeedback",
      requestType = org.example.UserFeedback.rmvFeedback.class,
      responseType = org.example.UserFeedback.feedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserFeedback.rmvFeedback,
      org.example.UserFeedback.feedbackResponse> getDeleteFeedbackMethod() {
    io.grpc.MethodDescriptor<org.example.UserFeedback.rmvFeedback, org.example.UserFeedback.feedbackResponse> getDeleteFeedbackMethod;
    if ((getDeleteFeedbackMethod = FeedBackGrpc.getDeleteFeedbackMethod) == null) {
      synchronized (FeedBackGrpc.class) {
        if ((getDeleteFeedbackMethod = FeedBackGrpc.getDeleteFeedbackMethod) == null) {
          FeedBackGrpc.getDeleteFeedbackMethod = getDeleteFeedbackMethod = 
              io.grpc.MethodDescriptor.<org.example.UserFeedback.rmvFeedback, org.example.UserFeedback.feedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedBack", "deleteFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.rmvFeedback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.feedbackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedBackMethodDescriptorSupplier("deleteFeedback"))
                  .build();
          }
        }
     }
     return getDeleteFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserFeedback.editF,
      org.example.UserFeedback.feedbackResponse> getEditFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editFeedback",
      requestType = org.example.UserFeedback.editF.class,
      responseType = org.example.UserFeedback.feedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserFeedback.editF,
      org.example.UserFeedback.feedbackResponse> getEditFeedbackMethod() {
    io.grpc.MethodDescriptor<org.example.UserFeedback.editF, org.example.UserFeedback.feedbackResponse> getEditFeedbackMethod;
    if ((getEditFeedbackMethod = FeedBackGrpc.getEditFeedbackMethod) == null) {
      synchronized (FeedBackGrpc.class) {
        if ((getEditFeedbackMethod = FeedBackGrpc.getEditFeedbackMethod) == null) {
          FeedBackGrpc.getEditFeedbackMethod = getEditFeedbackMethod = 
              io.grpc.MethodDescriptor.<org.example.UserFeedback.editF, org.example.UserFeedback.feedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedBack", "editFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.editF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.feedbackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedBackMethodDescriptorSupplier("editFeedback"))
                  .build();
          }
        }
     }
     return getEditFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserFeedback.commonID,
      org.example.UserFeedback.GetByUidResp> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetById",
      requestType = org.example.UserFeedback.commonID.class,
      responseType = org.example.UserFeedback.GetByUidResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.UserFeedback.commonID,
      org.example.UserFeedback.GetByUidResp> getGetByIdMethod() {
    io.grpc.MethodDescriptor<org.example.UserFeedback.commonID, org.example.UserFeedback.GetByUidResp> getGetByIdMethod;
    if ((getGetByIdMethod = FeedBackGrpc.getGetByIdMethod) == null) {
      synchronized (FeedBackGrpc.class) {
        if ((getGetByIdMethod = FeedBackGrpc.getGetByIdMethod) == null) {
          FeedBackGrpc.getGetByIdMethod = getGetByIdMethod = 
              io.grpc.MethodDescriptor.<org.example.UserFeedback.commonID, org.example.UserFeedback.GetByUidResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FeedBack", "GetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.commonID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.GetByUidResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedBackMethodDescriptorSupplier("GetById"))
                  .build();
          }
        }
     }
     return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserFeedback.commonSPID,
      org.example.UserFeedback.GetBySpidResp> getGetBySpidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBySpid",
      requestType = org.example.UserFeedback.commonSPID.class,
      responseType = org.example.UserFeedback.GetBySpidResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.UserFeedback.commonSPID,
      org.example.UserFeedback.GetBySpidResp> getGetBySpidMethod() {
    io.grpc.MethodDescriptor<org.example.UserFeedback.commonSPID, org.example.UserFeedback.GetBySpidResp> getGetBySpidMethod;
    if ((getGetBySpidMethod = FeedBackGrpc.getGetBySpidMethod) == null) {
      synchronized (FeedBackGrpc.class) {
        if ((getGetBySpidMethod = FeedBackGrpc.getGetBySpidMethod) == null) {
          FeedBackGrpc.getGetBySpidMethod = getGetBySpidMethod = 
              io.grpc.MethodDescriptor.<org.example.UserFeedback.commonSPID, org.example.UserFeedback.GetBySpidResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "FeedBack", "GetBySpid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.commonSPID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserFeedback.GetBySpidResp.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedBackMethodDescriptorSupplier("GetBySpid"))
                  .build();
          }
        }
     }
     return getGetBySpidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedBackStub newStub(io.grpc.Channel channel) {
    return new FeedBackStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedBackBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedBackBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedBackFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedBackFutureStub(channel);
  }

  /**
   */
  public static abstract class FeedBackImplBase implements io.grpc.BindableService {

    /**
     */
    public void feedback(org.example.UserFeedback.feedbackMessage request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void deleteFeedback(org.example.UserFeedback.rmvFeedback request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void editFeedback(org.example.UserFeedback.editF request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void getById(org.example.UserFeedback.commonID request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.GetByUidResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBySpid(org.example.UserFeedback.commonSPID request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.GetBySpidResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBySpidMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserFeedback.feedbackMessage,
                org.example.UserFeedback.feedbackResponse>(
                  this, METHODID_FEEDBACK)))
          .addMethod(
            getDeleteFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserFeedback.rmvFeedback,
                org.example.UserFeedback.feedbackResponse>(
                  this, METHODID_DELETE_FEEDBACK)))
          .addMethod(
            getEditFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserFeedback.editF,
                org.example.UserFeedback.feedbackResponse>(
                  this, METHODID_EDIT_FEEDBACK)))
          .addMethod(
            getGetByIdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.UserFeedback.commonID,
                org.example.UserFeedback.GetByUidResp>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetBySpidMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.UserFeedback.commonSPID,
                org.example.UserFeedback.GetBySpidResp>(
                  this, METHODID_GET_BY_SPID)))
          .build();
    }
  }

  /**
   */
  public static final class FeedBackStub extends io.grpc.stub.AbstractStub<FeedBackStub> {
    private FeedBackStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedBackStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedBackStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedBackStub(channel, callOptions);
    }

    /**
     */
    public void feedback(org.example.UserFeedback.feedbackMessage request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFeedback(org.example.UserFeedback.rmvFeedback request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editFeedback(org.example.UserFeedback.editF request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(org.example.UserFeedback.commonID request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.GetByUidResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBySpid(org.example.UserFeedback.commonSPID request,
        io.grpc.stub.StreamObserver<org.example.UserFeedback.GetBySpidResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetBySpidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FeedBackBlockingStub extends io.grpc.stub.AbstractStub<FeedBackBlockingStub> {
    private FeedBackBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedBackBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedBackBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedBackBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.UserFeedback.feedbackResponse feedback(org.example.UserFeedback.feedbackMessage request) {
      return blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserFeedback.feedbackResponse deleteFeedback(org.example.UserFeedback.rmvFeedback request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserFeedback.feedbackResponse editFeedback(org.example.UserFeedback.editF request) {
      return blockingUnaryCall(
          getChannel(), getEditFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.UserFeedback.GetByUidResp> getById(
        org.example.UserFeedback.commonID request) {
      return blockingServerStreamingCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.UserFeedback.GetBySpidResp> getBySpid(
        org.example.UserFeedback.commonSPID request) {
      return blockingServerStreamingCall(
          getChannel(), getGetBySpidMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FeedBackFutureStub extends io.grpc.stub.AbstractStub<FeedBackFutureStub> {
    private FeedBackFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedBackFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedBackFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedBackFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserFeedback.feedbackResponse> feedback(
        org.example.UserFeedback.feedbackMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserFeedback.feedbackResponse> deleteFeedback(
        org.example.UserFeedback.rmvFeedback request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserFeedback.feedbackResponse> editFeedback(
        org.example.UserFeedback.editF request) {
      return futureUnaryCall(
          getChannel().newCall(getEditFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEEDBACK = 0;
  private static final int METHODID_DELETE_FEEDBACK = 1;
  private static final int METHODID_EDIT_FEEDBACK = 2;
  private static final int METHODID_GET_BY_ID = 3;
  private static final int METHODID_GET_BY_SPID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedBackImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedBackImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FEEDBACK:
          serviceImpl.feedback((org.example.UserFeedback.feedbackMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse>) responseObserver);
          break;
        case METHODID_DELETE_FEEDBACK:
          serviceImpl.deleteFeedback((org.example.UserFeedback.rmvFeedback) request,
              (io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse>) responseObserver);
          break;
        case METHODID_EDIT_FEEDBACK:
          serviceImpl.editFeedback((org.example.UserFeedback.editF) request,
              (io.grpc.stub.StreamObserver<org.example.UserFeedback.feedbackResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((org.example.UserFeedback.commonID) request,
              (io.grpc.stub.StreamObserver<org.example.UserFeedback.GetByUidResp>) responseObserver);
          break;
        case METHODID_GET_BY_SPID:
          serviceImpl.getBySpid((org.example.UserFeedback.commonSPID) request,
              (io.grpc.stub.StreamObserver<org.example.UserFeedback.GetBySpidResp>) responseObserver);
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

  private static abstract class FeedBackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedBackBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.UserFeedback.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedBack");
    }
  }

  private static final class FeedBackFileDescriptorSupplier
      extends FeedBackBaseDescriptorSupplier {
    FeedBackFileDescriptorSupplier() {}
  }

  private static final class FeedBackMethodDescriptorSupplier
      extends FeedBackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedBackMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedBackGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedBackFileDescriptorSupplier())
              .addMethod(getFeedbackMethod())
              .addMethod(getDeleteFeedbackMethod())
              .addMethod(getEditFeedbackMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetBySpidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
