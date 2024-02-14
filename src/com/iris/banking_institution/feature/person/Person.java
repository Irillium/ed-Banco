package com.iris.banking_institution.feature.person;

public class Person {
    private String dni;
    private String name;
    private String surnames;

    public Person(String dni, String name, String surnames) {
        this.dni = dni;
        this.name = name;
        this.surnames = surnames;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }
}
