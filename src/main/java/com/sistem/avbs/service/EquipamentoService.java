package com.sistem.avbs.service;

import com.sistem.avbs.model.Equipamento;
import com.sistem.avbs.repository.EquipamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(EquipamentoRepository equipamentoRepository) {
        this.equipamentoRepository = equipamentoRepository;
    }

    // Métodos de negócios
    public void criarEquipamento() {
        var equipamento = new Equipamento();
        equipamentoRepository.save(equipamento);
    }
}


