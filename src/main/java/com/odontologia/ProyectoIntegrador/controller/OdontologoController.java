package com.odontologia.ProyectoIntegrador.controller;


import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.service.IPacienteService;
import com.odontologia.ProyectoIntegrador.service.impl.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/odontologos")
public class OdontologoController {

    private OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {

        this.odontologoService = odontologoService;
    }

    @GetMapping("/odontologos")
    public String buscarOdontologoPorId(Model model, @RequestParam("id") int Id){

        Odontologo odontologo = odontologoService.buscarOdontologoPorId(Id);

        //agregar los atributos del objeto al modelo que mostraremos en la vista
        model.addAttribute("nombre", odontologo.getNombre());
        model.addAttribute("apellido", odontologo.getApellido());
        model.addAttribute("matricula", odontologo.getMatricula());

        return "odontologos";

    }


}
