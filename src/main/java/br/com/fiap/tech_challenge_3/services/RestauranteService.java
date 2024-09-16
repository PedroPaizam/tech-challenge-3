package br.com.fiap.tech_challenge_3.services;

import br.com.fiap.tech_challenge_3.controllers.exceptions.ResourceNotFoundException;
import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante cadastrarRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public List<Restaurante> buscarRestaurantes(String termo) {
        return restauranteRepository.findByNomeContainingIgnoreCaseOrLocalizacaoContainingIgnoreCaseOrTipoCozinhaContainingIgnoreCase(termo, termo, termo);
    }

    public Restaurante obterRestaurantePorId(Long id) {
        return restauranteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurante não encontrado"));
    }
}
