package br.com.fiap.tech_challenge_3.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Data e hora são obrigatórios")
    private LocalDateTime dataHora;

    @Min(value = 1, message = "Número de pessoas deve ser no mínimo 1")
    private int numeroPessoas;

    @NotBlank(message = "Nome do usuário é obrigatório")
    private String nomeUsuario;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    private String status; // Exemplo: "Pendente", "Confirmada", "Cancelada"
}

