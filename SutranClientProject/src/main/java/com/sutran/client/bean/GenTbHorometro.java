package com.sutran.client.bean;

import java.util.Date;

public class GenTbHorometro {
    private Integer idHorometro;

    private Long horometro;

    private Date fechaInicio;

    private Date fechaFin;

    private Integer idVehiculo;

    public Integer getIdHorometro() {
        return idHorometro;
    }

    public void setIdHorometro(Integer idHorometro) {
        this.idHorometro = idHorometro;
    }

    public Long getHorometro() {
        return horometro;
    }

    public void setHorometro(Long horometro) {
        this.horometro = horometro;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
}