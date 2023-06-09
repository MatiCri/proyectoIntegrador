package com.odontologia.ProyectoIntegrador.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.odontologia.ProyectoIntegrador.entity.Domicilio;
import com.odontologia.ProyectoIntegrador.entity.Odontologo;
import com.odontologia.ProyectoIntegrador.entity.Paciente;
import com.odontologia.ProyectoIntegrador.entity.Turno;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
    public class PacienteDto {

        private String nombre;
        private String apellido;
        private String dni;
        private LocalDate fechaIngreso;
        private String domicilio;

    public PacienteDto(String nombre, String apellido, String dni, LocalDate fechaIngreso, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public PacienteDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public static PacienteDto fromPaciente(Paciente paciente){
        String domicilio = paciente.getDomicilio().getCalle();

        return new PacienteDto(paciente.getNombre(), paciente.getApellido(), paciente.getDni(), paciente.getFechaIngreso(), domicilio);

    }
}

