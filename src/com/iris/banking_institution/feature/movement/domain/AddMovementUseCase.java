package com.iris.banking_institution.feature.movement.domain;

public class AddMovementUseCase {
    MovementRepository movementRepository;

    public AddMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(Movement movement){
        movementRepository.addMovement(movement);
    }
}
