package br.com.fiap.tech_challenge_3.adapters;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.RestauranteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepositoryJPA extends JpaRepository<Restaurante, Long>, RestauranteRepository {
    // Aqui você pode definir consultas customizadas, se necessário
}
