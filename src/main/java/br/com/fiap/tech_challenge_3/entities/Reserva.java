package br.com.fiap.tech_challenge_3.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reserva {
    private UUID id;
    private UUID restauranteId;
    private String clienteNome;
    private LocalDateTime dataHora;
    private int numeroPessoas;

    public Reserva(UUID id, UUID restauranteId, String clienteNome, LocalDateTime dataHora, int numeroPessoas) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteNome = clienteNome;
        this.dataHora = dataHora;
        this.numeroPessoas = numeroPessoas;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
}
