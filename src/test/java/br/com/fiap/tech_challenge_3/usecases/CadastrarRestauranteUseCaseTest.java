package br.com.fiap.tech_challenge_3.usecases;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.RestauranteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CadastrarRestauranteUseCaseTest {

    private RestauranteRepository restauranteRepository;
    private CadastrarRestauranteUseCase cadastrarRestauranteUseCase;

    @BeforeEach
    public void setUp() {
        restauranteRepository = Mockito.mock(RestauranteRepository.class);
        cadastrarRestauranteUseCase = new CadastrarRestauranteUseCase(restauranteRepository);
    }

    @Test
    public void deveCadastrarRestauranteComSucesso() {
        Restaurante restaurante = new Restaurante(UUID.randomUUID(), "Restaurante Exemplo", "São Paulo", "Italiana", 50);

        cadastrarRestauranteUseCase.execute(restaurante);

        verify(restauranteRepository, times(1)).salvar(restaurante);
    }
}
