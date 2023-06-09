package com.odontologia.ProyectoIntegrador.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.odontologia.ProyectoIntegrador.repository.IDao;
import com.odontologia.ProyectoIntegrador.dto.TurnoDto;
import com.odontologia.ProyectoIntegrador.entity.Turno;
import com.odontologia.ProyectoIntegrador.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TurnoService implements ITurnoService {

    private IDao<Turno> turnoIdao;
    private ObjectMapper objectMapper;

    @Autowired
    public TurnoService(IDao<Turno> turnoIdao, ObjectMapper objectMapper) {
        this.turnoIdao = turnoIdao;
        this.objectMapper = objectMapper;
    }


    @Override
    public TurnoDto guardarTurno(Turno turno) {

        return TurnoDto.fromTurno(turnoIdao.guardar(turno));

    }

    @Override
    public List<TurnoDto> listarTodos() {

        List<Turno> turnoList = turnoIdao.listarTodos();
        List<TurnoDto> turnoDtoList = new ArrayList<>();

        for(Turno t : turnoList){
            turnoDtoList.add(TurnoDto.fromTurno(t));
        }

        return turnoDtoList;

        //o podemos retornar  directamente
        //return turnoList.stream().map(t -> TurnoDto.fromTurno(t)).toList());
    }

    @Override
    public TurnoDto buscarTurnoPorId(int id) {

        return TurnoDto.fromTurno(turnoIdao.buscarPorId(id));

    }

    @Override
    public TurnoDto actualizarTurno(Turno turno) {
        return TurnoDto.fromTurno(turnoIdao.actualizar(turno));
    }

    @Override
    public void eliminarTurno(int id) {

    }


}
