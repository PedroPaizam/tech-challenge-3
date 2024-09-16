package br.com.fiap.tech_challenge_3.services;

import br.com.fiap.tech_challenge_3.entities.Avaliacao;
import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private RestauranteService restauranteService;

    public Avaliacao criarAvaliacao(Long restauranteId, Avaliacao avaliacao) {
        Restaurante restaurante = restauranteService.obterRestaurantePorId(restauranteId);
        avaliacao.setRestaurante(restaurante);
        return avaliacaoRepository.save(avaliacao);
    }

    public List<Avaliacao> obterAvaliacoesPorRestaurante(Long restauranteId) {
        Restaurante restaurante = restauranteService.obterRestaurantePorId(restauranteId);
        return avaliacaoRepository.findByRestaurante(restaurante);
    }
}

