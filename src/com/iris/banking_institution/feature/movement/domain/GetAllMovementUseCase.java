package com.iris.banking_institution.feature.movement.domain;

public class GetAllMovementUseCase {
    MovementRepository movementRepository;

    public GetAllMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(){
        movementRepository.obtainAllMovements();
    }
}
