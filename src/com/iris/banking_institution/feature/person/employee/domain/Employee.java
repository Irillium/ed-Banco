package com.iris.banking_institution.feature.person.employee.domain;

import com.iris.banking_institution.feature.person.Person;

public class Employee extends Person {
    //Why did I add a class that wasn't necessary?
    //For the same reason I created use cases that weren't necessary,
    // because I can.
    private String ssn;

    public Employee(String dni, String nombre, String apellidos, String ssn) {
        super(dni, nombre, apellidos);
        this.ssn = ssn;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
