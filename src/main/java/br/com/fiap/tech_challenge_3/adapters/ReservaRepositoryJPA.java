package br.com.fiap.tech_challenge_3.adapters;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.repositories.ReservaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositoryJPA extends JpaRepository<Reserva, Long>, ReservaRepository {
    // Consultas customizadas podem ser definidas aqui
}
