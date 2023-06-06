package com.odontologia.ProyectoIntegrador.controller;


import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IOdontologoService;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import com.odontologia.ProyectoIntegrador.service.impl.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @GetMapping("/odontologos")
//    public String buscarOdontologoPorId(Model model, @RequestParam("id") int Id){
//
//        Odontologo odontologo = odontologoService.buscarOdontologoPorId(Id);
//
//        //agregar los atributos del objeto al modelo que mostraremos en la vista
//        model.addAttribute("nombre", odontologo.getNombre());
//        model.addAttribute("apellido", odontologo.getApellido());
//        model.addAttribute("matricula", odontologo.getMatricula());
//
//        return "odontologos";
//
//    }

    @GetMapping("/{id}")
    public Odontologo buscarOdontologoPorId(@PathVariable int id){
        return odontologoService.buscarOdontologoPorId(id);
    }

    @PostMapping("/registrar")
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }

    @PutMapping("/actualizar")
    public Odontologo actualizarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.actualizarOdontologo(odontologo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarOdontologo(@PathVariable int id){
        odontologoService.eliminarOdontologo(id);
    }

    @GetMapping()
    public List<Odontologo> listarOdontologos(){
        return odontologoService.listarOdontologos();
    }










}
