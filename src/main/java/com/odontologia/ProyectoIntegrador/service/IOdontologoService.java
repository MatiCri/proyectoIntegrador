package com.odontologia.ProyectoIntegrador.service;

import com.odontologia.ProyectoIntegrador.dto.OdontologoDto;
import com.odontologia.ProyectoIntegrador.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {

    OdontologoDto guardarOdontologo(Odontologo odontologo);

    OdontologoDto buscarOdontologoPorId(int id);

    List<OdontologoDto> listarOdontologos();

    void eliminarOdontologo(int id);

    OdontologoDto actualizarOdontologo(Odontologo odontologo);


}