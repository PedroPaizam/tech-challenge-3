package br.com.fiap.tech_challenge_3.adapters;

import br.com.fiap.tech_challenge_3.entities.Avaliacao;
import br.com.fiap.tech_challenge_3.repositories.AvaliacaoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepositoryJPA extends JpaRepository<Avaliacao, Long>, AvaliacaoRepository {
    // Consultas customizadas podem ser definidas aqui
}
