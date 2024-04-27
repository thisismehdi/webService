package com.example.demo;

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
    comments = "Source: EtudiantService.proto")
public final class EtudiantServiceGrpc {

  private EtudiantServiceGrpc() {}

  public static final String SERVICE_NAME = "EtudiantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest,
      com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> getGetAllEtudiantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllEtudiant",
      requestType = com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest.class,
      responseType = com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest,
      com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> getGetAllEtudiantMethod() {
    io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest, com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> getGetAllEtudiantMethod;
    if ((getGetAllEtudiantMethod = EtudiantServiceGrpc.getGetAllEtudiantMethod) == null) {
      synchronized (EtudiantServiceGrpc.class) {
        if ((getGetAllEtudiantMethod = EtudiantServiceGrpc.getGetAllEtudiantMethod) == null) {
          EtudiantServiceGrpc.getGetAllEtudiantMethod = getGetAllEtudiantMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest, com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EtudiantService", "getAllEtudiant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EtudiantServiceMethodDescriptorSupplier("getAllEtudiant"))
                  .build();
          }
        }
     }
     return getGetAllEtudiantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest,
      com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> getGetEtudiantByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEtudiantById",
      requestType = com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest.class,
      responseType = com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest,
      com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> getGetEtudiantByIdMethod() {
    io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest, com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> getGetEtudiantByIdMethod;
    if ((getGetEtudiantByIdMethod = EtudiantServiceGrpc.getGetEtudiantByIdMethod) == null) {
      synchronized (EtudiantServiceGrpc.class) {
        if ((getGetEtudiantByIdMethod = EtudiantServiceGrpc.getGetEtudiantByIdMethod) == null) {
          EtudiantServiceGrpc.getGetEtudiantByIdMethod = getGetEtudiantByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest, com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EtudiantService", "getEtudiantById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EtudiantServiceMethodDescriptorSupplier("getEtudiantById"))
                  .build();
          }
        }
     }
     return getGetEtudiantByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest,
      com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> getSaveEtudiantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveEtudiant",
      requestType = com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest.class,
      responseType = com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest,
      com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> getSaveEtudiantMethod() {
    io.grpc.MethodDescriptor<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest, com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> getSaveEtudiantMethod;
    if ((getSaveEtudiantMethod = EtudiantServiceGrpc.getSaveEtudiantMethod) == null) {
      synchronized (EtudiantServiceGrpc.class) {
        if ((getSaveEtudiantMethod = EtudiantServiceGrpc.getSaveEtudiantMethod) == null) {
          EtudiantServiceGrpc.getSaveEtudiantMethod = getSaveEtudiantMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest, com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EtudiantService", "saveEtudiant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EtudiantServiceMethodDescriptorSupplier("saveEtudiant"))
                  .build();
          }
        }
     }
     return getSaveEtudiantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EtudiantServiceStub newStub(io.grpc.Channel channel) {
    return new EtudiantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EtudiantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EtudiantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EtudiantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EtudiantServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EtudiantServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllEtudiant(com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllEtudiantMethod(), responseObserver);
    }

    /**
     */
    public void getEtudiantById(com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEtudiantByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveEtudiant(com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveEtudiantMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllEtudiantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest,
                com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse>(
                  this, METHODID_GET_ALL_ETUDIANT)))
          .addMethod(
            getGetEtudiantByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest,
                com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse>(
                  this, METHODID_GET_ETUDIANT_BY_ID)))
          .addMethod(
            getSaveEtudiantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest,
                com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse>(
                  this, METHODID_SAVE_ETUDIANT)))
          .build();
    }
  }

  /**
   */
  public static final class EtudiantServiceStub extends io.grpc.stub.AbstractStub<EtudiantServiceStub> {
    private EtudiantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EtudiantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EtudiantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EtudiantServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllEtudiant(com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllEtudiantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEtudiantById(com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEtudiantByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEtudiant(com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveEtudiantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EtudiantServiceBlockingStub extends io.grpc.stub.AbstractStub<EtudiantServiceBlockingStub> {
    private EtudiantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EtudiantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EtudiantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EtudiantServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse getAllEtudiant(com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllEtudiantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse getEtudiantById(com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEtudiantByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse saveEtudiant(com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveEtudiantMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EtudiantServiceFutureStub extends io.grpc.stub.AbstractStub<EtudiantServiceFutureStub> {
    private EtudiantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EtudiantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EtudiantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EtudiantServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse> getAllEtudiant(
        com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllEtudiantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse> getEtudiantById(
        com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEtudiantByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse> saveEtudiant(
        com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveEtudiantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ETUDIANT = 0;
  private static final int METHODID_GET_ETUDIANT_BY_ID = 1;
  private static final int METHODID_SAVE_ETUDIANT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EtudiantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EtudiantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ETUDIANT:
          serviceImpl.getAllEtudiant((com.example.demo.EtudiantServiceOuterClass.GetAllEtudiantsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantsResponse>) responseObserver);
          break;
        case METHODID_GET_ETUDIANT_BY_ID:
          serviceImpl.getEtudiantById((com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.GetEtudiantByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_ETUDIANT:
          serviceImpl.saveEtudiant((com.example.demo.EtudiantServiceOuterClass.SaveEtudiantRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.EtudiantServiceOuterClass.SaveEtudiantResponse>) responseObserver);
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

  private static abstract class EtudiantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EtudiantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.EtudiantServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EtudiantService");
    }
  }

  private static final class EtudiantServiceFileDescriptorSupplier
      extends EtudiantServiceBaseDescriptorSupplier {
    EtudiantServiceFileDescriptorSupplier() {}
  }

  private static final class EtudiantServiceMethodDescriptorSupplier
      extends EtudiantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EtudiantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EtudiantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EtudiantServiceFileDescriptorSupplier())
              .addMethod(getGetAllEtudiantMethod())
              .addMethod(getGetEtudiantByIdMethod())
              .addMethod(getSaveEtudiantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
