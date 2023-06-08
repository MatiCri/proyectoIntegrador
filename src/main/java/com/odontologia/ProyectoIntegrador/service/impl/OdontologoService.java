package com.odontologia.ProyectoIntegrador.service.impl;

import com.odontologia.ProyectoIntegrador.repository.IDao;
import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService implements IOdontologoService {

    private IDao<Odontologo> odontologoIDao;


    @Autowired
    public OdontologoService(IDao<Odontologo> odontologoIDao) {

        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public Odontologo guardarOdontologo(Odontologo odontologo) {

        return odontologoIDao.guardar(odontologo);
    }

    @Override
    public Odontologo buscarOdontologoPorId(int id) {

        return odontologoIDao.buscarPorId(id);
    }

    @Override
    public List<Odontologo> listarOdontologos() {

        return odontologoIDao.listarTodos();
    }

    @Override
    public void eliminarOdontologo(int id) {

        odontologoIDao.eliminar(id);

    }

    @Override
    public Odontologo actualizarOdontologo(Odontologo odontologo) {
        return odontologoIDao.actualizar(odontologo);
    }


}
