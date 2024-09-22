package br.com.fiap.tech_challenge_3.entities;

import java.time.LocalDateTime;

public class Reserva {
    private Long id;
    private Long restauranteId;
    private String clienteNome;
    private LocalDateTime dataHora;
    private int numeroPessoas;

    public Reserva(Long id, Long restauranteId, String clienteNome, LocalDateTime dataHora, int numeroPessoas) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteNome = clienteNome;
        this.dataHora = dataHora;
        this.numeroPessoas = numeroPessoas;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Long restauranteId) {
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
