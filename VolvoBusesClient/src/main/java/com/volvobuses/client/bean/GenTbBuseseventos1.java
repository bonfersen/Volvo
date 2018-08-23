package com.volvobuses.client.bean;

import java.util.Date;

public class GenTbBuseseventos {
    private Integer idBusEvento;

    private Integer idVehiculo;

    private Date fechaEvento;

    private String nombreEvento;

    private String evento;

    public Integer getIdBusEvento() {
        return idBusEvento;
    }

    public void setIdBusEvento(Integer idBusEvento) {
        this.idBusEvento = idBusEvento;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}