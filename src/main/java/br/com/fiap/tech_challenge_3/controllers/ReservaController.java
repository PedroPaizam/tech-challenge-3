package br.com.fiap.tech_challenge_3.controllers;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.usecases.RealizarReservaUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final RealizarReservaUseCase realizarReservaUseCase;

    public ReservaController(RealizarReservaUseCase realizarReservaUseCase) {
        this.realizarReservaUseCase = realizarReservaUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> realizarReserva(@RequestBody Reserva reserva) {
        realizarReservaUseCase.execute(reserva);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
