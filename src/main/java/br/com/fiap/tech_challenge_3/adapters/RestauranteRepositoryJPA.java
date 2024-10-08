package br.com.fiap.tech_challenge_3.adapters;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.RestauranteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RestauranteRepositoryJPA extends JpaRepository<Restaurante, UUID>, RestauranteRepository {
    // Aqui você pode definir consultas customizadas, se necessário
}
