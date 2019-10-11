package com.shigen.wang.account;

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
 ***************轨迹服务接口************************
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: account/account-user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "integration.account.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> METHOD_CREATE_USER = getCreateUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getCreateUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getCreateUserMethod() {
    return getCreateUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getCreateUserMethodHelper() {
    io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User, com.shigen.wang.base.Base.Result> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<com.shigen.wang.account.AccountUser.User, com.shigen.wang.base.Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "integration.account.UserService", "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.base.Base.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("createUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.base.Base.Result> METHOD_DELETE_USER_BY_ID = getDeleteUserByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.base.Base.Result> getDeleteUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.base.Base.Result> getDeleteUserByIdMethod() {
    return getDeleteUserByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.base.Base.Result> getDeleteUserByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq, com.shigen.wang.base.Base.Result> getDeleteUserByIdMethod;
    if ((getDeleteUserByIdMethod = UserServiceGrpc.getDeleteUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserByIdMethod = UserServiceGrpc.getDeleteUserByIdMethod) == null) {
          UserServiceGrpc.getDeleteUserByIdMethod = getDeleteUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.shigen.wang.account.AccountUser.UserIdReq, com.shigen.wang.base.Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "integration.account.UserService", "deleteUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.UserIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.base.Base.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("deleteUserById"))
                  .build();
          }
        }
     }
     return getDeleteUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> METHOD_UPDATE_USER = getUpdateUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getUpdateUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getUpdateUserMethod() {
    return getUpdateUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User,
      com.shigen.wang.base.Base.Result> getUpdateUserMethodHelper() {
    io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.User, com.shigen.wang.base.Base.Result> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.shigen.wang.account.AccountUser.User, com.shigen.wang.base.Base.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "integration.account.UserService", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.base.Base.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.account.AccountUser.FindUserByIdResp> METHOD_FIND_USER_BY_ID = getFindUserByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.account.AccountUser.FindUserByIdResp> getFindUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.account.AccountUser.FindUserByIdResp> getFindUserByIdMethod() {
    return getFindUserByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq,
      com.shigen.wang.account.AccountUser.FindUserByIdResp> getFindUserByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.UserIdReq, com.shigen.wang.account.AccountUser.FindUserByIdResp> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
          UserServiceGrpc.getFindUserByIdMethod = getFindUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.shigen.wang.account.AccountUser.UserIdReq, com.shigen.wang.account.AccountUser.FindUserByIdResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "integration.account.UserService", "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.UserIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.FindUserByIdResp.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserById"))
                  .build();
          }
        }
     }
     return getFindUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindUserAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.Null,
      com.shigen.wang.account.AccountUser.FindUserResp> METHOD_FIND_USER_ALL = getFindUserAllMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.Null,
      com.shigen.wang.account.AccountUser.FindUserResp> getFindUserAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.Null,
      com.shigen.wang.account.AccountUser.FindUserResp> getFindUserAllMethod() {
    return getFindUserAllMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.Null,
      com.shigen.wang.account.AccountUser.FindUserResp> getFindUserAllMethodHelper() {
    io.grpc.MethodDescriptor<com.shigen.wang.account.AccountUser.Null, com.shigen.wang.account.AccountUser.FindUserResp> getFindUserAllMethod;
    if ((getFindUserAllMethod = UserServiceGrpc.getFindUserAllMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserAllMethod = UserServiceGrpc.getFindUserAllMethod) == null) {
          UserServiceGrpc.getFindUserAllMethod = getFindUserAllMethod = 
              io.grpc.MethodDescriptor.<com.shigen.wang.account.AccountUser.Null, com.shigen.wang.account.AccountUser.FindUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "integration.account.UserService", "findUserAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.Null.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shigen.wang.account.AccountUser.FindUserResp.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserAll"))
                  .build();
          }
        }
     }
     return getFindUserAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   ***************轨迹服务接口************************
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.shigen.wang.account.AccountUser.User request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteUserById(com.shigen.wang.account.AccountUser.UserIdReq request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateUser(com.shigen.wang.account.AccountUser.User request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethodHelper(), responseObserver);
    }

    /**
     */
    public void findUserById(com.shigen.wang.account.AccountUser.UserIdReq request,
        io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserByIdResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findUserAll(com.shigen.wang.account.AccountUser.Null request,
        io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserAllMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shigen.wang.account.AccountUser.User,
                com.shigen.wang.base.Base.Result>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getDeleteUserByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shigen.wang.account.AccountUser.UserIdReq,
                com.shigen.wang.base.Base.Result>(
                  this, METHODID_DELETE_USER_BY_ID)))
          .addMethod(
            getUpdateUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shigen.wang.account.AccountUser.User,
                com.shigen.wang.base.Base.Result>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getFindUserByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shigen.wang.account.AccountUser.UserIdReq,
                com.shigen.wang.account.AccountUser.FindUserByIdResp>(
                  this, METHODID_FIND_USER_BY_ID)))
          .addMethod(
            getFindUserAllMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.shigen.wang.account.AccountUser.Null,
                com.shigen.wang.account.AccountUser.FindUserResp>(
                  this, METHODID_FIND_USER_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   ***************轨迹服务接口************************
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.shigen.wang.account.AccountUser.User request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserById(com.shigen.wang.account.AccountUser.UserIdReq request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.shigen.wang.account.AccountUser.User request,
        io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserById(com.shigen.wang.account.AccountUser.UserIdReq request,
        io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserByIdResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserAll(com.shigen.wang.account.AccountUser.Null request,
        io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserAllMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   ***************轨迹服务接口************************
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shigen.wang.base.Base.Result createUser(com.shigen.wang.account.AccountUser.User request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shigen.wang.base.Base.Result deleteUserById(com.shigen.wang.account.AccountUser.UserIdReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shigen.wang.base.Base.Result updateUser(com.shigen.wang.account.AccountUser.User request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shigen.wang.account.AccountUser.FindUserByIdResp findUserById(com.shigen.wang.account.AccountUser.UserIdReq request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.shigen.wang.account.AccountUser.FindUserResp findUserAll(com.shigen.wang.account.AccountUser.Null request) {
      return blockingUnaryCall(
          getChannel(), getFindUserAllMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   ***************轨迹服务接口************************
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shigen.wang.base.Base.Result> createUser(
        com.shigen.wang.account.AccountUser.User request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shigen.wang.base.Base.Result> deleteUserById(
        com.shigen.wang.account.AccountUser.UserIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shigen.wang.base.Base.Result> updateUser(
        com.shigen.wang.account.AccountUser.User request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shigen.wang.account.AccountUser.FindUserByIdResp> findUserById(
        com.shigen.wang.account.AccountUser.UserIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shigen.wang.account.AccountUser.FindUserResp> findUserAll(
        com.shigen.wang.account.AccountUser.Null request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserAllMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_DELETE_USER_BY_ID = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_FIND_USER_BY_ID = 3;
  private static final int METHODID_FIND_USER_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.shigen.wang.account.AccountUser.User) request,
              (io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result>) responseObserver);
          break;
        case METHODID_DELETE_USER_BY_ID:
          serviceImpl.deleteUserById((com.shigen.wang.account.AccountUser.UserIdReq) request,
              (io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.shigen.wang.account.AccountUser.User) request,
              (io.grpc.stub.StreamObserver<com.shigen.wang.base.Base.Result>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((com.shigen.wang.account.AccountUser.UserIdReq) request,
              (io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserByIdResp>) responseObserver);
          break;
        case METHODID_FIND_USER_ALL:
          serviceImpl.findUserAll((com.shigen.wang.account.AccountUser.Null) request,
              (io.grpc.stub.StreamObserver<com.shigen.wang.account.AccountUser.FindUserResp>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shigen.wang.account.AccountUser.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethodHelper())
              .addMethod(getDeleteUserByIdMethodHelper())
              .addMethod(getUpdateUserMethodHelper())
              .addMethod(getFindUserByIdMethodHelper())
              .addMethod(getFindUserAllMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
