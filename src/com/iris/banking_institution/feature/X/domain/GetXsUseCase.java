package com.iris.banking_institution.feature.X.domain;

public class GetXsUseCase {
    XRepository xRepository;

    public GetXsUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void Execute(){
        xRepository.obtainAllX();
    }
}
