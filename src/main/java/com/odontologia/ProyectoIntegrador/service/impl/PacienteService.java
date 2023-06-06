package com.odontologia.ProyectoIntegrador.service.impl;

import com.odontologia.ProyectoIntegrador.dao.IDao;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PacienteService implements IPacienteService {

    private IDao<Paciente> pacienteIDao;

    @Autowired
    public PacienteService(IDao<Paciente> pacienteIDao) {

        this.pacienteIDao = pacienteIDao;

    }

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    @Override
    public Paciente buscarPacientePorId(int id) {
        return pacienteIDao.buscarPorId(id);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteIDao.listarTodos();
    }

    @Override
    public Paciente buscarPacientePorDni(String dni) {
        return pacienteIDao.buscarPorCriterio(dni);
    }

    @Override
    public void eliminarPaciente(int id) {

        pacienteIDao.eliminar(id);
    }

    @Override
    public Paciente actualizarPaciente(Paciente paciente) {

        return pacienteIDao.actualizar(paciente);

    }


}
