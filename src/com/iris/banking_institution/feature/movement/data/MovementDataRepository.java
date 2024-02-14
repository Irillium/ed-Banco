package com.iris.banking_institution.feature.movement.data;


import com.iris.banking_institution.feature.movement.domain.Movement;
import com.iris.banking_institution.feature.movement.domain.MovementRepository;

import java.util.ArrayList;

public class MovementDataRepository implements MovementRepository {
    public static MovementDataRepository instance = null;
    ArrayList<Movement> localMovements = new ArrayList<>();

    public  static MovementDataRepository newInstance(){
        if(instance == null){
            instance = new MovementDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Movement> obtainAllMovements() {
        return localMovements;
    }

    @Override
    public Movement obtainOneMovement(String id) {
        for(Movement movement:localMovements){
            if(movement.getIdMovement().equals(id)){
                return movement;
            }
        }
        return null;
    }

    @Override
    public void deleteMovement(String id) {
        for(Movement movement:localMovements){
            if(movement.getIdMovement().equals(id)){
                localMovements.remove(movement);
            }
        }
    }

    @Override
    public void addMovement(Movement movement) {
        localMovements.add(movement);
    }

    @Override
    public void modifyMovement(String id,Movement movement) {
        for(Movement movementIn:localMovements){
            if(movementIn.getIdMovement().equals(id)){
                movementIn=movement;
            }
        }
    }
}
