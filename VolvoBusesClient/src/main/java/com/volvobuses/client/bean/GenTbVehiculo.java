package com.volvobuses.client.bean;

import java.util.Date;

public class GenTbVehiculo {
    private Integer idVehiculo;

    private String placa;

    private Date fechaRegistroApi;

    private Integer idFlota;

    private Long idVehiculoApi;

    private String vin;

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaRegistroApi() {
        return fechaRegistroApi;
    }

    public void setFechaRegistroApi(Date fechaRegistroApi) {
        this.fechaRegistroApi = fechaRegistroApi;
    }

    public Integer getIdFlota() {
        return idFlota;
    }

    public void setIdFlota(Integer idFlota) {
        this.idFlota = idFlota;
    }

    public Long getIdVehiculoApi() {
        return idVehiculoApi;
    }

    public void setIdVehiculoApi(Long idVehiculoApi) {
        this.idVehiculoApi = idVehiculoApi;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}