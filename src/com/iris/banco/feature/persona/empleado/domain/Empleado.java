package com.iris.banco.feature.persona.empleado.domain;

import com.iris.banco.feature.persona.Persona;

public class Empleado extends Persona {
    private String numeroSS;

    public Empleado(String dni, String nombre, String apellidos, String numeroSS) {
        super(dni, nombre, apellidos);
        this.numeroSS = numeroSS;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }
}
