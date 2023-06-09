package com.odontologia.ProyectoIntegrador.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.odontologia.ProyectoIntegrador.dto.OdontologoDto;
import com.odontologia.ProyectoIntegrador.repository.IDao;
import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService implements IOdontologoService {

    private IDao<Odontologo> odontologoIDao;

    private ObjectMapper objectMapper;


    @Autowired
    public OdontologoService(IDao<Odontologo> odontologoIDao, ObjectMapper objectMapper) {

        this.odontologoIDao = odontologoIDao;
        this.objectMapper = objectMapper;
    }

    @Override
    public OdontologoDto guardarOdontologo(Odontologo odontologo) {

        Odontologo o = odontologoIDao.guardar(odontologo);

        OdontologoDto odontologoDto = objectMapper.convertValue(o, OdontologoDto.class);

        return odontologoDto;

//        OdontologoDto odontologoDto = objectMapper.convertValue(odontologoIDao.guardar(odontologo), OdontologoDto.class);
//        return odontologoDto;
    }

    @Override
    public OdontologoDto buscarOdontologoPorId(int id) {

        Odontologo o = odontologoIDao.buscarPorId(id);

        OdontologoDto odontologoDto = objectMapper.convertValue(o, OdontologoDto.class);

        return odontologoDto;
    }

    @Override
    public List<OdontologoDto> listarOdontologos() {

        List<Odontologo> odontologoList = odontologoIDao.listarTodos();

        List<OdontologoDto> odontologoDtoList = new ArrayList<>();

        for (Odontologo o : odontologoList){
            OdontologoDto odontologoDto = objectMapper.convertValue(o, OdontologoDto.class);
            odontologoDtoList.add(odontologoDto);
        }

        return odontologoDtoList;
    }

    @Override
    public void eliminarOdontologo(int id) {

        odontologoIDao.eliminar(id);

    }

    @Override
    public OdontologoDto actualizarOdontologo(Odontologo odontologo) {

        Odontologo o = odontologoIDao.actualizar(odontologo);

        OdontologoDto odontologoDto = objectMapper.convertValue(o, OdontologoDto.class);

        return odontologoDto;
    }


}
