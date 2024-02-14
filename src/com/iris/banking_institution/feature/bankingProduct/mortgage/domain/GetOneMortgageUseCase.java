package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;


public class GetOneMortgageUseCase {
    MortgageRepository mortgageRepository;

    public GetOneMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void execute(String id){
        mortgageRepository.obtainOneMortgage(id);
    }
}
