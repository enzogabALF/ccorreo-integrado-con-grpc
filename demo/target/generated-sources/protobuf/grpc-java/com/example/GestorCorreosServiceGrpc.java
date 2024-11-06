package com.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: gestor_correos.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GestorCorreosServiceGrpc {

  private GestorCorreosServiceGrpc() {}

  public static final String SERVICE_NAME = "GestorCorreosService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getEnviarCorreoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnviarCorreo",
      requestType = com.example.GestorCorreosServiceProto.CorreoRequest.class,
      responseType = com.example.GestorCorreosServiceProto.CorreoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getEnviarCorreoMethod() {
    io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest, com.example.GestorCorreosServiceProto.CorreoResponse> getEnviarCorreoMethod;
    if ((getEnviarCorreoMethod = GestorCorreosServiceGrpc.getEnviarCorreoMethod) == null) {
      synchronized (GestorCorreosServiceGrpc.class) {
        if ((getEnviarCorreoMethod = GestorCorreosServiceGrpc.getEnviarCorreoMethod) == null) {
          GestorCorreosServiceGrpc.getEnviarCorreoMethod = getEnviarCorreoMethod =
              io.grpc.MethodDescriptor.<com.example.GestorCorreosServiceProto.CorreoRequest, com.example.GestorCorreosServiceProto.CorreoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnviarCorreo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.CorreoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.CorreoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GestorCorreosServiceMethodDescriptorSupplier("EnviarCorreo"))
              .build();
        }
      }
    }
    return getEnviarCorreoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getRecibirCorreoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecibirCorreo",
      requestType = com.example.GestorCorreosServiceProto.CorreoRequest.class,
      responseType = com.example.GestorCorreosServiceProto.CorreoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getRecibirCorreoMethod() {
    io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.CorreoRequest, com.example.GestorCorreosServiceProto.CorreoResponse> getRecibirCorreoMethod;
    if ((getRecibirCorreoMethod = GestorCorreosServiceGrpc.getRecibirCorreoMethod) == null) {
      synchronized (GestorCorreosServiceGrpc.class) {
        if ((getRecibirCorreoMethod = GestorCorreosServiceGrpc.getRecibirCorreoMethod) == null) {
          GestorCorreosServiceGrpc.getRecibirCorreoMethod = getRecibirCorreoMethod =
              io.grpc.MethodDescriptor.<com.example.GestorCorreosServiceProto.CorreoRequest, com.example.GestorCorreosServiceProto.CorreoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecibirCorreo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.CorreoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.CorreoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GestorCorreosServiceMethodDescriptorSupplier("RecibirCorreo"))
              .build();
        }
      }
    }
    return getRecibirCorreoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getMarcarComoFavoritoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarcarComoFavorito",
      requestType = com.example.GestorCorreosServiceProto.FavoritoRequest.class,
      responseType = com.example.GestorCorreosServiceProto.CorreoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoRequest,
      com.example.GestorCorreosServiceProto.CorreoResponse> getMarcarComoFavoritoMethod() {
    io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoRequest, com.example.GestorCorreosServiceProto.CorreoResponse> getMarcarComoFavoritoMethod;
    if ((getMarcarComoFavoritoMethod = GestorCorreosServiceGrpc.getMarcarComoFavoritoMethod) == null) {
      synchronized (GestorCorreosServiceGrpc.class) {
        if ((getMarcarComoFavoritoMethod = GestorCorreosServiceGrpc.getMarcarComoFavoritoMethod) == null) {
          GestorCorreosServiceGrpc.getMarcarComoFavoritoMethod = getMarcarComoFavoritoMethod =
              io.grpc.MethodDescriptor.<com.example.GestorCorreosServiceProto.FavoritoRequest, com.example.GestorCorreosServiceProto.CorreoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarcarComoFavorito"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.FavoritoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.CorreoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GestorCorreosServiceMethodDescriptorSupplier("MarcarComoFavorito"))
              .build();
        }
      }
    }
    return getMarcarComoFavoritoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoListRequest,
      com.example.GestorCorreosServiceProto.FavoritoListResponse> getListarFavoritosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListarFavoritos",
      requestType = com.example.GestorCorreosServiceProto.FavoritoListRequest.class,
      responseType = com.example.GestorCorreosServiceProto.FavoritoListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoListRequest,
      com.example.GestorCorreosServiceProto.FavoritoListResponse> getListarFavoritosMethod() {
    io.grpc.MethodDescriptor<com.example.GestorCorreosServiceProto.FavoritoListRequest, com.example.GestorCorreosServiceProto.FavoritoListResponse> getListarFavoritosMethod;
    if ((getListarFavoritosMethod = GestorCorreosServiceGrpc.getListarFavoritosMethod) == null) {
      synchronized (GestorCorreosServiceGrpc.class) {
        if ((getListarFavoritosMethod = GestorCorreosServiceGrpc.getListarFavoritosMethod) == null) {
          GestorCorreosServiceGrpc.getListarFavoritosMethod = getListarFavoritosMethod =
              io.grpc.MethodDescriptor.<com.example.GestorCorreosServiceProto.FavoritoListRequest, com.example.GestorCorreosServiceProto.FavoritoListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListarFavoritos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.FavoritoListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.GestorCorreosServiceProto.FavoritoListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GestorCorreosServiceMethodDescriptorSupplier("ListarFavoritos"))
              .build();
        }
      }
    }
    return getListarFavoritosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GestorCorreosServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceStub>() {
        @java.lang.Override
        public GestorCorreosServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GestorCorreosServiceStub(channel, callOptions);
        }
      };
    return GestorCorreosServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GestorCorreosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceBlockingStub>() {
        @java.lang.Override
        public GestorCorreosServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GestorCorreosServiceBlockingStub(channel, callOptions);
        }
      };
    return GestorCorreosServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GestorCorreosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GestorCorreosServiceFutureStub>() {
        @java.lang.Override
        public GestorCorreosServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GestorCorreosServiceFutureStub(channel, callOptions);
        }
      };
    return GestorCorreosServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GestorCorreosServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void enviarCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnviarCorreoMethod(), responseObserver);
    }

    /**
     */
    public void recibirCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecibirCorreoMethod(), responseObserver);
    }

    /**
     */
    public void marcarComoFavorito(com.example.GestorCorreosServiceProto.FavoritoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarcarComoFavoritoMethod(), responseObserver);
    }

    /**
     */
    public void listarFavoritos(com.example.GestorCorreosServiceProto.FavoritoListRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.FavoritoListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarFavoritosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnviarCorreoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.GestorCorreosServiceProto.CorreoRequest,
                com.example.GestorCorreosServiceProto.CorreoResponse>(
                  this, METHODID_ENVIAR_CORREO)))
          .addMethod(
            getRecibirCorreoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.GestorCorreosServiceProto.CorreoRequest,
                com.example.GestorCorreosServiceProto.CorreoResponse>(
                  this, METHODID_RECIBIR_CORREO)))
          .addMethod(
            getMarcarComoFavoritoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.GestorCorreosServiceProto.FavoritoRequest,
                com.example.GestorCorreosServiceProto.CorreoResponse>(
                  this, METHODID_MARCAR_COMO_FAVORITO)))
          .addMethod(
            getListarFavoritosMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.GestorCorreosServiceProto.FavoritoListRequest,
                com.example.GestorCorreosServiceProto.FavoritoListResponse>(
                  this, METHODID_LISTAR_FAVORITOS)))
          .build();
    }
  }

  /**
   */
  public static final class GestorCorreosServiceStub extends io.grpc.stub.AbstractAsyncStub<GestorCorreosServiceStub> {
    private GestorCorreosServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GestorCorreosServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GestorCorreosServiceStub(channel, callOptions);
    }

    /**
     */
    public void enviarCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnviarCorreoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recibirCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecibirCorreoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marcarComoFavorito(com.example.GestorCorreosServiceProto.FavoritoRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarcarComoFavoritoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarFavoritos(com.example.GestorCorreosServiceProto.FavoritoListRequest request,
        io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.FavoritoListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarFavoritosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GestorCorreosServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GestorCorreosServiceBlockingStub> {
    private GestorCorreosServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GestorCorreosServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GestorCorreosServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.GestorCorreosServiceProto.CorreoResponse enviarCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnviarCorreoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.GestorCorreosServiceProto.CorreoResponse recibirCorreo(com.example.GestorCorreosServiceProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecibirCorreoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.GestorCorreosServiceProto.CorreoResponse marcarComoFavorito(com.example.GestorCorreosServiceProto.FavoritoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarcarComoFavoritoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.GestorCorreosServiceProto.FavoritoListResponse listarFavoritos(com.example.GestorCorreosServiceProto.FavoritoListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarFavoritosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GestorCorreosServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GestorCorreosServiceFutureStub> {
    private GestorCorreosServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GestorCorreosServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GestorCorreosServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.GestorCorreosServiceProto.CorreoResponse> enviarCorreo(
        com.example.GestorCorreosServiceProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnviarCorreoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.GestorCorreosServiceProto.CorreoResponse> recibirCorreo(
        com.example.GestorCorreosServiceProto.CorreoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecibirCorreoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.GestorCorreosServiceProto.CorreoResponse> marcarComoFavorito(
        com.example.GestorCorreosServiceProto.FavoritoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarcarComoFavoritoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.GestorCorreosServiceProto.FavoritoListResponse> listarFavoritos(
        com.example.GestorCorreosServiceProto.FavoritoListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarFavoritosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENVIAR_CORREO = 0;
  private static final int METHODID_RECIBIR_CORREO = 1;
  private static final int METHODID_MARCAR_COMO_FAVORITO = 2;
  private static final int METHODID_LISTAR_FAVORITOS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GestorCorreosServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GestorCorreosServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVIAR_CORREO:
          serviceImpl.enviarCorreo((com.example.GestorCorreosServiceProto.CorreoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse>) responseObserver);
          break;
        case METHODID_RECIBIR_CORREO:
          serviceImpl.recibirCorreo((com.example.GestorCorreosServiceProto.CorreoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse>) responseObserver);
          break;
        case METHODID_MARCAR_COMO_FAVORITO:
          serviceImpl.marcarComoFavorito((com.example.GestorCorreosServiceProto.FavoritoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.CorreoResponse>) responseObserver);
          break;
        case METHODID_LISTAR_FAVORITOS:
          serviceImpl.listarFavoritos((com.example.GestorCorreosServiceProto.FavoritoListRequest) request,
              (io.grpc.stub.StreamObserver<com.example.GestorCorreosServiceProto.FavoritoListResponse>) responseObserver);
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

  private static abstract class GestorCorreosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GestorCorreosServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.GestorCorreosServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GestorCorreosService");
    }
  }

  private static final class GestorCorreosServiceFileDescriptorSupplier
      extends GestorCorreosServiceBaseDescriptorSupplier {
    GestorCorreosServiceFileDescriptorSupplier() {}
  }

  private static final class GestorCorreosServiceMethodDescriptorSupplier
      extends GestorCorreosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GestorCorreosServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GestorCorreosServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GestorCorreosServiceFileDescriptorSupplier())
              .addMethod(getEnviarCorreoMethod())
              .addMethod(getRecibirCorreoMethod())
              .addMethod(getMarcarComoFavoritoMethod())
              .addMethod(getListarFavoritosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
