package br.com.fiap.tech_challenge_3.entities;

public class Avaliacao {
    private Long id;
    private Long restauranteId;
    private String clienteNome;
    private String comentario;
    private int nota;

    public Avaliacao(Long id, Long restauranteId, String clienteNome, String comentario, int nota) {
        this.id = id;
        this.restauranteId = restauranteId;
        this.clienteNome = clienteNome;
        this.comentario = comentario;
        this.nota = nota;
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
