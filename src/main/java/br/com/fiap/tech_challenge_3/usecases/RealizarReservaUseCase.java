package br.com.fiap.tech_challenge_3.usecases;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.repositories.ReservaRepository;

public class RealizarReservaUseCase {
    private final ReservaRepository reservaRepository;

    public RealizarReservaUseCase(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void execute(Reserva reserva) {
        reservaRepository.salvar(reserva);
    }
}
