package com.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.GestorCorreosServiceProto.Correo;
import com.example.GestorCorreosServiceProto.CorreoRequest;
import com.example.GestorCorreosServiceProto.CorreoResponse;
import com.example.GestorCorreosServiceProto.FavoritoRequest;
import com.example.GestorCorreosServiceProto.FavoritoListRequest;
import com.example.GestorCorreosServiceProto.FavoritoListResponse;

import java.util.HashMap;
import java.util.Map;

public class GestorCorreosClient {
    private final GestorCorreosServiceGrpc.GestorCorreosServiceBlockingStub blockingStub;
    private final Map<String, GrupoDeUsuarios> gruposDeUsuarios;

    public GestorCorreosClient(ManagedChannel channel) {
        blockingStub = GestorCorreosServiceGrpc.newBlockingStub(channel);
        gruposDeUsuarios = new HashMap<>();
    }

    // Enviar correo a un destinatario
    public void enviarCorreo(String remitente, String destinatario, String asunto, String contenido) {
        Correo correo = Correo.newBuilder()
            .setRemitente(remitente)
            .setDestinatario(destinatario)
            .setAsunto(asunto)
            .setContenido(contenido)
            .build();

        CorreoRequest request = CorreoRequest.newBuilder().setCorreo(correo).build();
        CorreoResponse response = blockingStub.enviarCorreo(request);
        System.out.println(response.getMensaje());
    }

    // Enviar correo a un grupo
    public void enviarCorreoAGrupo(String remitente, String nombreGrupo, String asunto, String contenido) {
        GrupoDeUsuarios grupo = gruposDeUsuarios.get(nombreGrupo);
        if (grupo != null) {
            for (String destinatario : grupo.getContactos()) {
                enviarCorreo(remitente, destinatario, asunto, contenido);
            }
        } else {
            System.out.println("El grupo " + nombreGrupo + " no existe.");
        }
    }

    // Recibir correo
    public void recibirCorreo(String remitente) {
        Correo correo = Correo.newBuilder()
            .setRemitente(remitente)
            .build();
    
        CorreoRequest request = CorreoRequest.newBuilder().setCorreo(correo).build();
        CorreoResponse response = blockingStub.recibirCorreo(request);
        System.out.println(response.getMensaje());
    }

    // Manejo de favoritos
    public void marcarComoFavorito(String remitente, boolean esFavorito) {
        FavoritoRequest request = FavoritoRequest.newBuilder()
            .setRemitente(remitente)
            .setEsFavorito(esFavorito)
            .build();
        CorreoResponse response = blockingStub.marcarComoFavorito(request);
        System.out.println(response.getMensaje());
    }
    
    public void listarFavoritos() {
        FavoritoListRequest request = FavoritoListRequest.newBuilder().build();
        FavoritoListResponse response = blockingStub.listarFavoritos(request);
    
        System.out.println("Correos favoritos:");
        for (Correo correo : response.getCorreosFavoritosList()) {
            System.out.println("Remitente: " + correo.getRemitente() +
                               "\nAsunto: " + correo.getAsunto() +
                               "\nContenido: " + correo.getContenido() + "\n");
        }
    }

    // Gestión de grupos
    public void crearGrupo(String nombreGrupo) {
        if (!gruposDeUsuarios.containsKey(nombreGrupo)) {
            gruposDeUsuarios.put(nombreGrupo, new GrupoDeUsuarios(nombreGrupo));
            System.out.println("Grupo " + nombreGrupo + " creado.");
        } else {
            System.out.println("El grupo " + nombreGrupo + " ya existe.");
        }
    }

    public void agregarContactoAGrupo(String nombreGrupo, String contacto) {
        GrupoDeUsuarios grupo = gruposDeUsuarios.get(nombreGrupo);
        if (grupo != null) {
            grupo.agregarContacto(contacto);
        } else {
            System.out.println("El grupo " + nombreGrupo + " no existe.");
        }
    }

    public void eliminarContactoDeGrupo(String nombreGrupo, String contacto) {
        GrupoDeUsuarios grupo = gruposDeUsuarios.get(nombreGrupo);
        if (grupo != null) {
            grupo.eliminarContacto(contacto);
        } else {
            System.out.println("El grupo " + nombreGrupo + " no existe.");
        }
    }

    public void listarGrupos() {
        System.out.println("Grupos de usuarios:");
        for (String nombreGrupo : gruposDeUsuarios.keySet()) {
            System.out.println("- " + nombreGrupo);
        }
    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        GestorCorreosClient client = new GestorCorreosClient(channel);

        // Enviar y recibir correos
        client.enviarCorreo("remitente@example.com", "destinatario@example.com", "Asunto de prueba", "Contenido del correo");
        client.recibirCorreo("remitente@example.com");

        // Marcar como favorito y listar favoritos
        client.marcarComoFavorito("remitente@example.com", true);
        client.listarFavoritos();
        client.marcarComoFavorito("remitente@example.com", false); // Remover de favoritos

        // Crear y gestionar grupos
        client.crearGrupo("Familia");
        client.agregarContactoAGrupo("Familia", "familiar1@example.com");
        client.agregarContactoAGrupo("Familia", "familiar2@example.com");
        client.listarGrupos();

        // Enviar correo a un grupo
        client.enviarCorreoAGrupo("remitente@example.com", "Familia", "Asunto grupal", "Mensaje para la familia");

        channel.shutdown();
    }
}