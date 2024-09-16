package br.com.fiap.tech_challenge_3.controllers;

import br.com.fiap.tech_challenge_3.entities.Avaliacao;
import br.com.fiap.tech_challenge_3.services.AvaliacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping("/restaurante/{restauranteId}")
    public ResponseEntity<Avaliacao> criarAvaliacao(@PathVariable Long restauranteId, @Valid @RequestBody Avaliacao avaliacao) {
        Avaliacao novaAvaliacao = avaliacaoService.criarAvaliacao(restauranteId, avaliacao);
        return new ResponseEntity<>(novaAvaliacao, HttpStatus.CREATED);
    }

    @GetMapping("/restaurante/{restauranteId}")
    public ResponseEntity<List<Avaliacao>> obterAvaliacoesPorRestaurante(@PathVariable Long restauranteId) {
        List<Avaliacao> avaliacoes = avaliacaoService.obterAvaliacoesPorRestaurante(restauranteId);
        return ResponseEntity.ok(avaliacoes);
    }
}

