package com.iris.banking_institution.feature.person.employee.domain;

import com.iris.banking_institution.feature.person.Person;

public class Employee extends Person {
    private String numeroSS;

    public Employee(String dni, String nombre, String apellidos, String numeroSS) {
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
