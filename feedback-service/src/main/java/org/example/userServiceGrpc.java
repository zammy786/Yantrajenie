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
    comments = "Source: userService.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.UserService.adduser,
      org.example.UserService.Response1> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = org.example.UserService.adduser.class,
      responseType = org.example.UserService.Response1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.adduser,
      org.example.UserService.Response1> getAddUserMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.adduser, org.example.UserService.Response1> getAddUserMethod;
    if ((getAddUserMethod = userServiceGrpc.getAddUserMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getAddUserMethod = userServiceGrpc.getAddUserMethod) == null) {
          userServiceGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.adduser, org.example.UserService.Response1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.adduser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response1.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.userdetails,
      org.example.UserService.Response2> getUsdetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usdetails",
      requestType = org.example.UserService.userdetails.class,
      responseType = org.example.UserService.Response2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.userdetails,
      org.example.UserService.Response2> getUsdetailsMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.userdetails, org.example.UserService.Response2> getUsdetailsMethod;
    if ((getUsdetailsMethod = userServiceGrpc.getUsdetailsMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUsdetailsMethod = userServiceGrpc.getUsdetailsMethod) == null) {
          userServiceGrpc.getUsdetailsMethod = getUsdetailsMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.userdetails, org.example.UserService.Response2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "usdetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.userdetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response2.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("usdetails"))
                  .build();
          }
        }
     }
     return getUsdetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.address,
      org.example.UserService.Response3> getUsaddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usaddress",
      requestType = org.example.UserService.address.class,
      responseType = org.example.UserService.Response3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.address,
      org.example.UserService.Response3> getUsaddressMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.address, org.example.UserService.Response3> getUsaddressMethod;
    if ((getUsaddressMethod = userServiceGrpc.getUsaddressMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUsaddressMethod = userServiceGrpc.getUsaddressMethod) == null) {
          userServiceGrpc.getUsaddressMethod = getUsaddressMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.address, org.example.UserService.Response3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "usaddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response3.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("usaddress"))
                  .build();
          }
        }
     }
     return getUsaddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.update,
      org.example.UserService.Response4> getUsupdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usupdate",
      requestType = org.example.UserService.update.class,
      responseType = org.example.UserService.Response4.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.update,
      org.example.UserService.Response4> getUsupdateMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.update, org.example.UserService.Response4> getUsupdateMethod;
    if ((getUsupdateMethod = userServiceGrpc.getUsupdateMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUsupdateMethod = userServiceGrpc.getUsupdateMethod) == null) {
          userServiceGrpc.getUsupdateMethod = getUsupdateMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.update, org.example.UserService.Response4>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "usupdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.update.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response4.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("usupdate"))
                  .build();
          }
        }
     }
     return getUsupdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.deluser,
      org.example.UserService.Response5> getUsdeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usdelete",
      requestType = org.example.UserService.deluser.class,
      responseType = org.example.UserService.Response5.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.deluser,
      org.example.UserService.Response5> getUsdeleteMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.deluser, org.example.UserService.Response5> getUsdeleteMethod;
    if ((getUsdeleteMethod = userServiceGrpc.getUsdeleteMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUsdeleteMethod = userServiceGrpc.getUsdeleteMethod) == null) {
          userServiceGrpc.getUsdeleteMethod = getUsdeleteMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.deluser, org.example.UserService.Response5>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "usdelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.deluser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response5.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("usdelete"))
                  .build();
          }
        }
     }
     return getUsdeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.validate,
      org.example.UserService.Response6> getUsvalidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usvalidate",
      requestType = org.example.UserService.validate.class,
      responseType = org.example.UserService.Response6.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.validate,
      org.example.UserService.Response6> getUsvalidateMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.validate, org.example.UserService.Response6> getUsvalidateMethod;
    if ((getUsvalidateMethod = userServiceGrpc.getUsvalidateMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUsvalidateMethod = userServiceGrpc.getUsvalidateMethod) == null) {
          userServiceGrpc.getUsvalidateMethod = getUsvalidateMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.validate, org.example.UserService.Response6>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "usvalidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.validate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.Response6.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("usvalidate"))
                  .build();
          }
        }
     }
     return getUsvalidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userServiceStub newStub(io.grpc.Channel channel) {
    return new userServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *i will get this data from registration table via channel
     * </pre>
     */
    public void addUser(org.example.UserService.adduser request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response1> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void usdetails(org.example.UserService.userdetails request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response2> responseObserver) {
      asyncUnimplementedUnaryCall(getUsdetailsMethod(), responseObserver);
    }

    /**
     */
    public void usaddress(org.example.UserService.address request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response3> responseObserver) {
      asyncUnimplementedUnaryCall(getUsaddressMethod(), responseObserver);
    }

    /**
     */
    public void usupdate(org.example.UserService.update request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response4> responseObserver) {
      asyncUnimplementedUnaryCall(getUsupdateMethod(), responseObserver);
    }

    /**
     */
    public void usdelete(org.example.UserService.deluser request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response5> responseObserver) {
      asyncUnimplementedUnaryCall(getUsdeleteMethod(), responseObserver);
    }

    /**
     */
    public void usvalidate(org.example.UserService.validate request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response6> responseObserver) {
      asyncUnimplementedUnaryCall(getUsvalidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.adduser,
                org.example.UserService.Response1>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getUsdetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.userdetails,
                org.example.UserService.Response2>(
                  this, METHODID_USDETAILS)))
          .addMethod(
            getUsaddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.address,
                org.example.UserService.Response3>(
                  this, METHODID_USADDRESS)))
          .addMethod(
            getUsupdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.update,
                org.example.UserService.Response4>(
                  this, METHODID_USUPDATE)))
          .addMethod(
            getUsdeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.deluser,
                org.example.UserService.Response5>(
                  this, METHODID_USDELETE)))
          .addMethod(
            getUsvalidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.validate,
                org.example.UserService.Response6>(
                  this, METHODID_USVALIDATE)))
          .build();
    }
  }

  /**
   */
  public static final class userServiceStub extends io.grpc.stub.AbstractStub<userServiceStub> {
    private userServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *i will get this data from registration table via channel
     * </pre>
     */
    public void addUser(org.example.UserService.adduser request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usdetails(org.example.UserService.userdetails request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsdetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usaddress(org.example.UserService.address request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsaddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usupdate(org.example.UserService.update request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response4> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsupdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usdelete(org.example.UserService.deluser request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response5> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsdeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usvalidate(org.example.UserService.validate request,
        io.grpc.stub.StreamObserver<org.example.UserService.Response6> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsvalidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userServiceBlockingStub extends io.grpc.stub.AbstractStub<userServiceBlockingStub> {
    private userServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *i will get this data from registration table via channel
     * </pre>
     */
    public org.example.UserService.Response1 addUser(org.example.UserService.adduser request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.Response2 usdetails(org.example.UserService.userdetails request) {
      return blockingUnaryCall(
          getChannel(), getUsdetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.Response3 usaddress(org.example.UserService.address request) {
      return blockingUnaryCall(
          getChannel(), getUsaddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.Response4 usupdate(org.example.UserService.update request) {
      return blockingUnaryCall(
          getChannel(), getUsupdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.Response5 usdelete(org.example.UserService.deluser request) {
      return blockingUnaryCall(
          getChannel(), getUsdeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.Response6 usvalidate(org.example.UserService.validate request) {
      return blockingUnaryCall(
          getChannel(), getUsvalidateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userServiceFutureStub extends io.grpc.stub.AbstractStub<userServiceFutureStub> {
    private userServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *i will get this data from registration table via channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response1> addUser(
        org.example.UserService.adduser request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response2> usdetails(
        org.example.UserService.userdetails request) {
      return futureUnaryCall(
          getChannel().newCall(getUsdetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response3> usaddress(
        org.example.UserService.address request) {
      return futureUnaryCall(
          getChannel().newCall(getUsaddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response4> usupdate(
        org.example.UserService.update request) {
      return futureUnaryCall(
          getChannel().newCall(getUsupdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response5> usdelete(
        org.example.UserService.deluser request) {
      return futureUnaryCall(
          getChannel().newCall(getUsdeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.Response6> usvalidate(
        org.example.UserService.validate request) {
      return futureUnaryCall(
          getChannel().newCall(getUsvalidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_USDETAILS = 1;
  private static final int METHODID_USADDRESS = 2;
  private static final int METHODID_USUPDATE = 3;
  private static final int METHODID_USDELETE = 4;
  private static final int METHODID_USVALIDATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((org.example.UserService.adduser) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response1>) responseObserver);
          break;
        case METHODID_USDETAILS:
          serviceImpl.usdetails((org.example.UserService.userdetails) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response2>) responseObserver);
          break;
        case METHODID_USADDRESS:
          serviceImpl.usaddress((org.example.UserService.address) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response3>) responseObserver);
          break;
        case METHODID_USUPDATE:
          serviceImpl.usupdate((org.example.UserService.update) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response4>) responseObserver);
          break;
        case METHODID_USDELETE:
          serviceImpl.usdelete((org.example.UserService.deluser) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response5>) responseObserver);
          break;
        case METHODID_USVALIDATE:
          serviceImpl.usvalidate((org.example.UserService.validate) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.Response6>) responseObserver);
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

  private static abstract class userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userService");
    }
  }

  private static final class userServiceFileDescriptorSupplier
      extends userServiceBaseDescriptorSupplier {
    userServiceFileDescriptorSupplier() {}
  }

  private static final class userServiceMethodDescriptorSupplier
      extends userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (userServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getUsdetailsMethod())
              .addMethod(getUsaddressMethod())
              .addMethod(getUsupdateMethod())
              .addMethod(getUsdeleteMethod())
              .addMethod(getUsvalidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
