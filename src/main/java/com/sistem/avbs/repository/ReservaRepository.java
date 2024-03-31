package com.sistem.avbs.repository;

import com.sistem.avbs.model.Reserva;
import com.sistem.avbs.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByUsuario(Usuario usuario);
}
