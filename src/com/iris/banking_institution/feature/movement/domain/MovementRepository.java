package com.iris.banking_institution.feature.movement.domain;


import java.util.ArrayList;

public interface MovementRepository {
    ArrayList<Movement> obtainAllMovements();
    Movement obtainOneMovement(String id);
    void deleteMovement(String id);
    void addMovement(Movement movement);
    void modifyMovement(String id,Movement movement);
}
