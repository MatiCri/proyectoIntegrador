package com.odontologia.ProyectoIntegrador.service;

import com.odontologia.ProyectoIntegrador.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {

    Odontologo guardarOdontologo(Odontologo odontologo);

    Odontologo buscarOdontologoPorId(int id);

    List<Odontologo> listarOdontologos();

    void eliminarOdontologo(int id);

    Odontologo actualizarOdontologo(Odontologo odontologo);


}