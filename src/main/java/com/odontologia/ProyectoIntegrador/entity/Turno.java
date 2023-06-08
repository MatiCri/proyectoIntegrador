package com.odontologia.ProyectoIntegrador.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {

    private int id;
    private Paciente paciente;
    private Odontologo odonotologo;
    private LocalDateTime fecha;

    public Turno(int id, Paciente paciente, Odontologo odonotologo, LocalDateTime fecha) {
        this.id = id;
        this.paciente = paciente;
        this.odonotologo = odonotologo;
        this.fecha = fecha;
    }

    public Turno(Paciente paciente, Odontologo odonotologo, LocalDateTime fecha) {
        this.paciente = paciente;
        this.odonotologo = odonotologo;
        this.fecha = fecha;
    }

    public Turno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdonotologo() {
        return odonotologo;
    }

    public void setOdonotologo(Odontologo odonotologo) {
        this.odonotologo = odonotologo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
