package br.com.fiap.tech_challenge_3.controllers;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.usecases.CadastrarRestauranteUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    private final CadastrarRestauranteUseCase cadastrarRestauranteUseCase;

    public RestauranteController(CadastrarRestauranteUseCase cadastrarRestauranteUseCase) {
        this.cadastrarRestauranteUseCase = cadastrarRestauranteUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarRestaurante(@RequestBody Restaurante restaurante) {
        cadastrarRestauranteUseCase.execute(restaurante);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
