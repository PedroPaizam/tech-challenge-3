package br.com.fiap.tech_challenge_3.adapters;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.repositories.ReservaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReservaRepositoryJPA extends JpaRepository<Reserva, UUID>, ReservaRepository {
    // Consultas customizadas podem ser definidas aqui
}
