package com.iris.banking_institution.feature.movement.presentation;
import com.iris.banking_institution.feature.movement.data.MovementDataRepository;
import com.iris.banking_institution.feature.movement.domain.*;

public class MovementMain {
    public static void printAllMovement(){
        GetAllMovementUseCase getAllMovementUseCase = new GetAllMovementUseCase(MovementDataRepository.newInstance());
        getAllMovementUseCase.execute();
    }
    public static void printOneMovement(String idMovement){
        GetOneMovementUseCase getOneMovementUseCase = new GetOneMovementUseCase(MovementDataRepository.newInstance());
        getOneMovementUseCase.execute(idMovement);
    }
    public static void deleteMovement(String idMovement){
        DeleteMovementUseCase deleteMovementUseCase = new DeleteMovementUseCase(MovementDataRepository.newInstance());
        deleteMovementUseCase.execute(idMovement);
    }
    public static void addMovement(Movement movement){
        AddMovementUseCase addMovementUseCase = new AddMovementUseCase(MovementDataRepository.newInstance());
        addMovementUseCase.execute(movement);
    }
    public static void modifyMovement(String idMovement,Movement movement){
        ModifyMovementUseCase modifyMovementUseCase = new ModifyMovementUseCase(MovementDataRepository.newInstance());
        modifyMovementUseCase.execute(idMovement,movement);
    }
}
