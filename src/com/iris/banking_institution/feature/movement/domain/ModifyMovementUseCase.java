package com.iris.banking_institution.feature.movement.domain;

public class ModifyMovementUseCase {
    MovementRepository movementRepository;

    public ModifyMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(String id, Movement movement){
        movementRepository.modifyMovement(id,movement);
    }
}
