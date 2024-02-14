package com.iris.banking_institution.feature.movement.domain;

public class Movement {
    private String idMovement;
    private String description;
    private double amount;

    public Movement(String idMovement, String description, double amount) {
        this.idMovement = idMovement;
        this.description = description;
        this.amount = amount;
    }

    public String getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(String idMovement) {
        this.idMovement = idMovement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
