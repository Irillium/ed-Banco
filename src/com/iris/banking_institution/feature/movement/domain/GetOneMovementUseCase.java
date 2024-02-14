package com.iris.banking_institution.feature.movement.domain;


public class GetOneMovementUseCase {
    MovementRepository movementRepository;

    public GetOneMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(String id){
        movementRepository.obtainOneMovement(id);
    }
}
