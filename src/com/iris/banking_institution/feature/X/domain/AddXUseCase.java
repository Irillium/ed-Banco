package com.iris.banking_institution.feature.X.domain;

public class AddXUseCase {
    XRepository xRepository;

    public AddXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void Execute(X x){
        xRepository.addTapa(x);
    }
}
