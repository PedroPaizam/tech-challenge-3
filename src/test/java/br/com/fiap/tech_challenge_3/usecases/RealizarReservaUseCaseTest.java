package br.com.fiap.tech_challenge_3.usecases;

import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.repositories.ReservaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RealizarReservaUseCaseTest {

    private ReservaRepository reservaRepository;
    private RealizarReservaUseCase realizarReservaUseCase;

    @BeforeEach
    public void setUp() {
        reservaRepository = Mockito.mock(ReservaRepository.class);
        realizarReservaUseCase = new RealizarReservaUseCase(reservaRepository);
    }

    @Test
    public void deveRealizarReservaComSucesso() {
        Reserva reserva = new Reserva(UUID.randomUUID(), UUID.randomUUID(), "Cliente Exemplo", LocalDateTime.now(), 4);

        realizarReservaUseCase.execute(reserva);

        verify(reservaRepository, times(1)).salvar(reserva);
    }
}
