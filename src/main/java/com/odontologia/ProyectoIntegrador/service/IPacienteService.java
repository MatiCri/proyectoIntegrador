package com.odontologia.ProyectoIntegrador.service;

import com.odontologia.ProyectoIntegrador.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    Paciente guardarPaciente(Paciente paciente);

    Paciente buscarPacientePorId(int id);

    List<Paciente> listarPacientes();

    Paciente buscarPacientePorDni(String dni);

    void eliminarPaciente(int id);



}
