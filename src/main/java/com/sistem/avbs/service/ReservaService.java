package com.sistem.avbs.service;

import com.sistem.avbs.model.Reserva;
import com.sistem.avbs.repository.EquipamentoRepository;
import com.sistem.avbs.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReservaService {
    private final ReservaRepository reservaRepository;
    private final EquipamentoRepository equipamentoRepository;

    public ReservaService(ReservaRepository reservaRepository, EquipamentoRepository equipamentoRepository) {
        this.reservaRepository = reservaRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    public Reserva criarReserva(Long usuarioId, Long equipamentoId, LocalDateTime dataReserva) {
        var equipamento = equipamentoRepository.findById(equipamentoId).orElseThrow(() ->
                new RuntimeException("Equipamento não encontrado"));
        var reserva = new Reserva();
        reserva.setEquipamento(equipamento);
        reserva.setDataReserva(dataReserva);
        return reservaRepository.save(reserva);

    }

    public void cancelarReserva(Long reservaId) {
        var reserva = reservaRepository.findById(reservaId).orElseThrow(() ->
                new RuntimeException("Reserva não encontrada"));
        reservaRepository.delete(reserva);
    }
}
