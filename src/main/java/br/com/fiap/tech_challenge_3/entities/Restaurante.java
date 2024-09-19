package br.com.fiap.tech_challenge_3.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Localização é obrigatória")
    private String localizacao;

    @NotBlank(message = "Tipo de cozinha é obrigatório")
    private String tipoCozinha;

    @NotBlank(message = "Horário de funcionamento é obrigatório")
    private String horarioFuncionamento;

    @Min(value = 1, message = "Capacidade deve ser no mínimo 1")
    private int capacidade;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL)
    private List<Avaliacao> avaliacoes;
}
