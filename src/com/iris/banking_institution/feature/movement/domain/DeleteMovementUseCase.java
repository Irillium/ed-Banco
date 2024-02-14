package com.iris.banking_institution.feature.movement.domain;

public class DeleteMovementUseCase {
    MovementRepository movementRepository;

    public DeleteMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(String id){
        movementRepository.deleteMovement(id);
    }
}
