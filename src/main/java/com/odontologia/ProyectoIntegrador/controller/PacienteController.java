package com.odontologia.ProyectoIntegrador.controller;

import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import com.odontologia.ProyectoIntegrador.service.impl.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {

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

    @GetMapping("/{id}")
    public Paciente buscarPacientePorId(@PathVariable int id){
        return pacienteService.buscarPacientePorId(id);
    }

    @PostMapping("/registrar")
    public Paciente registrarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }

    @PutMapping("/actualizar")
    public Paciente actualizarPaciente(@RequestBody Paciente paciente){
        return pacienteService.actualizarPaciente(paciente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPaciente(@PathVariable int id){
        pacienteService.eliminarPaciente(id);
    }

    @GetMapping()
    public List<Paciente> listarPaciente(){
        return pacienteService.listarPacientes();
    }


}
