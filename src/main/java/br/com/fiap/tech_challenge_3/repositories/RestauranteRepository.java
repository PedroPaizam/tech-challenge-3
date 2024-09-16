package br.com.fiap.tech_challenge_3.repositories;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    List<Restaurante> findByNomeContainingIgnoreCaseOrLocalizacaoContainingIgnoreCaseOrTipoCozinhaContainingIgnoreCase(String nome, String localizacao, String tipoCozinha);
}
