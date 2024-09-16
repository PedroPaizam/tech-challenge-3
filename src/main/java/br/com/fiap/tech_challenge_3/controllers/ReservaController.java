package br.com.fiap.tech_challenge_3.controllers;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.services.ReservaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/restaurante/{restauranteId}")
    public ResponseEntity<Reserva> criarReserva(@PathVariable Long restauranteId, @Valid @RequestBody Reserva reserva) {
        Reserva novaReserva = reservaService.criarReserva(restauranteId, reserva);
        return new ResponseEntity<>(novaReserva, HttpStatus.CREATED);
    }

    @GetMapping("/restaurante/{restauranteId}")
    public ResponseEntity<List<Reserva>> obterReservasPorRestaurante(@PathVariable Long restauranteId) {
        List<Reserva> reservas = reservaService.obterReservasPorRestaurante(restauranteId);
        return ResponseEntity.ok(reservas);
    }

    @PutMapping("/{reservaId}/status")
    public ResponseEntity<Reserva> atualizarStatusReserva(@PathVariable Long reservaId, @RequestParam String status) {
        Reserva reservaAtualizada = reservaService.atualizarStatusReserva(reservaId, status);
        return ResponseEntity.ok(reservaAtualizada);
    }
}

