package com.iris.banking_institution.feature.person.customer.domain;

import com.iris.banking_institution.feature.person.Person;

public class Customer extends Person {
    private String address;
    private String population;
    private String postalCode;

    public Customer(String dni, String name, String surnames, String address, String population, String postalCode) {
        super(dni, name, surnames);
        this.address = address;
        this.population = population;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
