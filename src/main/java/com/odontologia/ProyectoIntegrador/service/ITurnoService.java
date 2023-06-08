package com.odontologia.ProyectoIntegrador.service;

import com.odontologia.ProyectoIntegrador.dto.TurnoDto;
import com.odontologia.ProyectoIntegrador.entity.Turno;

import java.util.List;

public interface ITurnoService {

    TurnoDto guardarTurno(Turno turno);

    List<TurnoDto> listarTodos();

    TurnoDto buscarTurnoPorId(int id);

    TurnoDto actualizarTurno(Turno turno);

    void eliminarTurno(int id);


}
