package com.odontologia.ProyectoIntegrador.controller;

import com.odontologia.ProyectoIntegrador.dto.TurnoDto;
import com.odontologia.ProyectoIntegrador.entity.Turno;
import com.odontologia.ProyectoIntegrador.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private ITurnoService turnoService;

    @Autowired
    public TurnoController(ITurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @GetMapping()
    public List<TurnoDto> listarTurnos(){

        return turnoService.listarTodos();

    }

    @PostMapping("/registrar")
    public ResponseEntity<TurnoDto> guardarTurno(@RequestBody Turno turno){
        ResponseEntity<TurnoDto> respuesta;

        TurnoDto turnoDto = turnoService.guardarTurno(turno);

        if(turnoDto != null){
            respuesta = new ResponseEntity<>(turnoDto, null, HttpStatus.CREATED);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;

    }

    @GetMapping("/{id")
    public ResponseEntity<TurnoDto> buscarTurnoPorId(@PathVariable int id){

        ResponseEntity<TurnoDto> respuesta;

        TurnoDto turnoDto = turnoService.buscarTurnoPorId(id);

        if(turnoDto != null){
            respuesta = new ResponseEntity<>(turnoDto, null, HttpStatus.OK);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;

    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTurno(@PathVariable int id){
        turnoService.eliminarTurno(id);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<TurnoDto> actualizarTurno(@RequestBody Turno turno){

        ResponseEntity<TurnoDto> respuesta;

        TurnoDto turnoDto = turnoService.actualizarTurno(turno);

        if(turnoDto != null){
            respuesta = new ResponseEntity<>(turnoDto, null, HttpStatus.OK);
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return respuesta;

    }
}
























