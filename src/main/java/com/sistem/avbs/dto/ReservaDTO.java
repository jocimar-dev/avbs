package com.sistem.avbs.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReservaDTO {
    private Long usuarioId;
    private Long equipamentoId;
    private LocalDateTime dataReserva;

    // Getters e setters...
}
