package com.iris.banco.feature.persona.cliente.domain;

import com.iris.banco.feature.persona.Persona;

public class Cliente extends Persona {
    private String direccion;
    private String poblacion;
    private String codPostal;

    public Cliente(String dni, String nombre, String apellidos, String direccion, String poblacion, String codPostal) {
        super(dni, nombre, apellidos);
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
}
