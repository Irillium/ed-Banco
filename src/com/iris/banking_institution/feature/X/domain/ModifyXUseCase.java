package com.iris.banking_institution.feature.X.domain;

public class ModifyXUseCase {
    XRepository xRepository;

    public ModifyXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void Execute(String xCode, X x){
        xRepository.modifyTapa(xCode,x);
    }
}
