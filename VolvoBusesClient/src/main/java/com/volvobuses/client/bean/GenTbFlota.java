package com.volvobuses.client.bean;

public class GenTbFlota {
    private Integer idFlota;

    private String nombreFlota;

    private String usuario;

    private String password;

    private String activo;

    private String tipoFlota;

    public Integer getIdFlota() {
        return idFlota;
    }

    public void setIdFlota(Integer idFlota) {
        this.idFlota = idFlota;
    }

    public String getNombreFlota() {
        return nombreFlota;
    }

    public void setNombreFlota(String nombreFlota) {
        this.nombreFlota = nombreFlota;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getTipoFlota() {
        return tipoFlota;
    }

    public void setTipoFlota(String tipoFlota) {
        this.tipoFlota = tipoFlota;
    }
}