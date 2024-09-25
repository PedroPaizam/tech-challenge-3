package br.com.fiap.tech_challenge_3.usecases;

import br.com.fiap.tech_challenge_3.entities.Avaliacao;
import br.com.fiap.tech_challenge_3.repositories.AvaliacaoRepository;

public class AvaliarRestauranteUseCase {
    private final AvaliacaoRepository avaliacaoRepository;

    public AvaliarRestauranteUseCase(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public void execute(Avaliacao avaliacao) {
        avaliacaoRepository.salvar(avaliacao);
    }
}
