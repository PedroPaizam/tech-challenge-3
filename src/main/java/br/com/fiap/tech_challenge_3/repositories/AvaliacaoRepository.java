package br.com.fiap.tech_challenge_3.repositories;

import br.com.fiap.tech_challenge_3.entities.Avaliacao;
import br.com.fiap.tech_challenge_3.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByRestaurante(Restaurante restaurante);
}

