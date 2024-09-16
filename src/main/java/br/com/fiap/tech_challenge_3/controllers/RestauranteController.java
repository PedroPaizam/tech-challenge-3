package br.com.fiap.tech_challenge_3.controllers;

import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.services.RestauranteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping
    public ResponseEntity<Restaurante> cadastrarRestaurante(@Valid @RequestBody Restaurante restaurante) {
        Restaurante novoRestaurante = restauranteService.cadastrarRestaurante(restaurante);
        return new ResponseEntity<>(novoRestaurante, HttpStatus.CREATED);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Restaurante>> buscarRestaurantes(@RequestParam String termo) {
        List<Restaurante> restaurantes = restauranteService.buscarRestaurantes(termo);
        return ResponseEntity.ok(restaurantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> obterRestaurantePorId(@PathVariable Long id) {
        Restaurante restaurante = restauranteService.obterRestaurantePorId(id);
        return ResponseEntity.ok(restaurante);
    }
}
