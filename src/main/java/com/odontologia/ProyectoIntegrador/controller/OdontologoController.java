package com.odontologia.ProyectoIntegrador.controller;


import com.odontologia.ProyectoIntegrador.dto.OdontologoDto;
import com.odontologia.ProyectoIntegrador.dto.TurnoDto;
import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IOdontologoService;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import com.odontologia.ProyectoIntegrador.service.impl.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {

        this.odontologoService = odontologoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdontologoDto> buscarOdontologoPorId(@PathVariable int id){

        ResponseEntity<OdontologoDto> respuesta;

        OdontologoDto odontologoDto = odontologoService.buscarOdontologoPorId(id);

        if (odontologoDto != null){
            respuesta = new ResponseEntity<>(odontologoDto, null, HttpStatus.OK);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;

    }

    @PostMapping("/registrar")
    public ResponseEntity<OdontologoDto> registrarOdontologo(@RequestBody Odontologo odontologo){
        ResponseEntity<OdontologoDto> respuesta;

        OdontologoDto odontologoDto = odontologoService.guardarOdontologo(odontologo);

        if (odontologoDto != null){
            respuesta = new ResponseEntity<>(odontologoDto, null, HttpStatus.CREATED);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;
    }

    @PutMapping("/actualizar")
    public ResponseEntity<OdontologoDto> actualizarOdontologo(@RequestBody Odontologo odontologo){
        ResponseEntity<OdontologoDto> respuesta;

        OdontologoDto odontologoDto = odontologoService.actualizarOdontologo(odontologo);

        if (odontologoDto != null){
            respuesta = new ResponseEntity<>(odontologoDto, null, HttpStatus.OK);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarOdontologo(@PathVariable int id){
        odontologoService.eliminarOdontologo(id);
    }

    @GetMapping()
    public ResponseEntity<List<OdontologoDto>> listarOdontologos(){
        ResponseEntity<List<OdontologoDto>> respuesta;

        List<OdontologoDto> odontologoDtoList = odontologoService.listarOdontologos();

        if (odontologoDtoList != null){
            respuesta = new ResponseEntity<>(odontologoDtoList, null, HttpStatus.OK);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;
    }










}
