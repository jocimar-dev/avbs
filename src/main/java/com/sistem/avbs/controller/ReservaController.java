package com.sistem.avbs.controller;

import com.sistem.avbs.dto.ReservaDTO;
import com.sistem.avbs.model.Reserva;
import com.sistem.avbs.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ResponseEntity<Reserva> criarReserva(@RequestBody ReservaDTO reservaDTO) {
        Reserva reservaCriada = reservaService.criarReserva(
                reservaDTO.getUsuarioId(), reservaDTO.getEquipamentoId(), reservaDTO.getDataReserva());
        return ResponseEntity.ok(reservaCriada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarReserva(@PathVariable Long id) {
        reservaService.cancelarReserva(id);
        return ResponseEntity.ok().build();
    }
}
