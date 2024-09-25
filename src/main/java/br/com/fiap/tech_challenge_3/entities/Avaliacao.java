package br.com.fiap.tech_challenge_3.entities;

import java.util.UUID;

public class Avaliacao {
    private UUID id;
    private UUID restauranteId;
    private String clienteNome;
    private String comentario;
    private int nota;

    public Avaliacao(UUID id, UUID restauranteId, String clienteNome, String comentario, int nota) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteNome = clienteNome;
        this.comentario = comentario;
        this.nota = nota;
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(UUID restauranteId) {
        this.restauranteId = restauranteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
