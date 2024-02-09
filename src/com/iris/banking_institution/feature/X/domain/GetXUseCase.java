package com.iris.banking_institution.feature.X.domain;

public class GetXUseCase {
    XRepository xRepository;

    public GetXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void Execute(String xCode){
        xRepository.obtainOneX(xCode);
    }
}
