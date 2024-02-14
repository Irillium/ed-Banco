package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;


public class GetAllMortgageUseCase {
    MortgageRepository mortgageRepository;

    public GetAllMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void execute(){
        mortgageRepository.obtainAllMortgages();
    }
}
