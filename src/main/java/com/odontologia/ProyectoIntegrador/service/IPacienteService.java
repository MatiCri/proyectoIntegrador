package com.odontologia.ProyectoIntegrador.service;

import com.odontologia.ProyectoIntegrador.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    List<Paciente> listarPacientes();
    Paciente buscarPacientePorDni(String dni);


}
