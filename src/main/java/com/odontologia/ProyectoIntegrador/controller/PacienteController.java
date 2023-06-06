package com.odontologia.ProyectoIntegrador.controller;

import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private IPacienteService pacienteService;

    @Autowired
    public PacienteController(IPacienteService pacienteService) {

        this.pacienteService = pacienteService;
    }
//
//    @GetMapping("/pacientes")
//    public String buscarPacientePorDni(Model model, @RequestParam("dni") String dni){
//
//        Paciente paciente = pacienteService.buscarPacientePorDni(dni);
//
//        //agregar los atributos del objeto al modelo que mostraremos en la vista
//        model.addAttribute("nombre", paciente.getNombre());
//        model.addAttribute("apellido", paciente.getApellido());
//
//        return "pacientes";
//
//    }



}
