package br.com.fiap.tech_challenge_3.services;

import br.com.fiap.tech_challenge_3.controllers.exceptions.ResourceNotFoundException;
import br.com.fiap.tech_challenge_3.entities.Reserva;
import br.com.fiap.tech_challenge_3.entities.Restaurante;
import br.com.fiap.tech_challenge_3.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private RestauranteService restauranteService;

    public Reserva criarReserva(Long restauranteId, Reserva reserva) {
        Restaurante restaurante = restauranteService.obterRestaurantePorId(restauranteId);
        reserva.setRestaurante(restaurante);
        reserva.setStatus("Pendente");
        return reservaRepository.save(reserva);
    }

    public List<Reserva> obterReservasPorRestaurante(Long restauranteId) {
        Restaurante restaurante = restauranteService.obterRestaurantePorId(restauranteId);
        return reservaRepository.findByRestaurante(restaurante);
    }

    public Reserva atualizarStatusReserva(Long reservaId, String status) {
        Reserva reserva = reservaRepository.findById(reservaId)
                .orElseThrow(() -> new ResourceNotFoundException("Reserva não encontrada"));
        reserva.setStatus(status);
        return reservaRepository.save(reserva);
    }
}

