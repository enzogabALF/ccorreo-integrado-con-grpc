package com.example;

import io.grpc.stub.StreamObserver;
import com.example.GestorCorreosServiceProto.Correo;
import com.example.GestorCorreosServiceProto.CorreoRequest;
import com.example.GestorCorreosServiceProto.CorreoResponse;

import java.util.ArrayList;
import java.util.List;




import com.example.GestorCorreosServiceProto.FavoritoRequest;
import com.example.GestorCorreosServiceProto.FavoritoListRequest;
import com.example.GestorCorreosServiceProto.FavoritoListResponse;



public class GestorCorreosServiceImpl extends GestorCorreosServiceGrpc.GestorCorreosServiceImplBase {

    private final List<Correo> correosRecibidos = new ArrayList<>();

    @Override
    public void enviarCorreo(CorreoRequest request, StreamObserver<CorreoResponse> responseObserver) {
        Correo correo = request.getCorreo();
        correosRecibidos.add(correo);
        String mensajeRespuesta = "Correo enviado a " + correo.getDestinatario();

        CorreoResponse response = CorreoResponse.newBuilder()
            .setMensaje(mensajeRespuesta)
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void recibirCorreo(CorreoRequest request, StreamObserver<CorreoResponse> responseObserver) {
        Correo correoSolicitado = request.getCorreo();
        Correo encontrado = null;

        for (Correo correo : correosRecibidos) {
            if (correo.getRemitente().equals(correoSolicitado.getRemitente())) {
                encontrado = correo;
                break;
            }
        }

        String mensajeRespuesta;
        if (encontrado != null) {
            mensajeRespuesta = "Correo de " + encontrado.getRemitente() + 
                               "\nAsunto: " + encontrado.getAsunto() +
                               "\nContenido: " + encontrado.getContenido();
        } else {
            mensajeRespuesta = "No se encontró ningún correo del remitente " + correoSolicitado.getRemitente();
        }

        CorreoResponse response = CorreoResponse.newBuilder()
            .setMensaje(mensajeRespuesta)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void marcarComoFavorito(FavoritoRequest request, StreamObserver<CorreoResponse> responseObserver) {
        String remitente = request.getRemitente();
        boolean esFavorito = request.getEsFavorito();
        Correo correoEncontrado = null;

        for (Correo correo : correosRecibidos) {
            if (correo.getRemitente().equals(remitente)) {
                correoEncontrado = correo.toBuilder().setEsFavorito(esFavorito).build();
                correosRecibidos.set(correosRecibidos.indexOf(correo), correoEncontrado);
                break;
            }
        }

        String mensajeRespuesta = (correoEncontrado != null) 
            ? "El correo de " + remitente + " ha sido " + (esFavorito ? "marcado como favorito." : "quitado de favoritos.")
            : "No se encontró el correo del remitente " + remitente;

        CorreoResponse response = CorreoResponse.newBuilder()
            .setMensaje(mensajeRespuesta)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listarFavoritos(FavoritoListRequest request, StreamObserver<FavoritoListResponse> responseObserver) {
        List<Correo> favoritos = new ArrayList<>();
        for (Correo correo : correosRecibidos) {
            if (correo.getEsFavorito()) {
                favoritos.add(correo);
            }
        }

        FavoritoListResponse response = FavoritoListResponse.newBuilder()
            .addAllCorreosFavoritos(favoritos)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}