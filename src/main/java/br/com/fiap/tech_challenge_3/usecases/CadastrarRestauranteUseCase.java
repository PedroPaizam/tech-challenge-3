package br.com.fiap.tech_challenge_3.usecases;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.RestauranteRepository;

public class CadastrarRestauranteUseCase {
    private final RestauranteRepository restauranteRepository;

    public CadastrarRestauranteUseCase(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public void execute(Restaurante restaurante) {
        restauranteRepository.salvar(restaurante);
    }
}
