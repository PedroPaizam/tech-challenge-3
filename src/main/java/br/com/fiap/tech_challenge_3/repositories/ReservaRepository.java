package br.com.fiap.tech_challenge_3.repositories;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByRestaurante(Restaurante restaurante);
}

