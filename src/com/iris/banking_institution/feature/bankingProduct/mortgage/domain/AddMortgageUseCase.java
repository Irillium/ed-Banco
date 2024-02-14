package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;


public class AddMortgageUseCase {
    MortgageRepository mortgageRepository;

    public AddMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void execute(Mortgage mortgage){
        mortgageRepository.addMortgage(mortgage);
    }
}
