package com.iris.banking_institution.feature.X.domain;

public class DeleteXUseCase {
    XRepository xRepository;

    public DeleteXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void Execute(String xCode){
        xRepository.deleteTapa(xCode);
    }
}
