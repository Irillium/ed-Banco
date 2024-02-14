package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;


public class DeleteMortgageUseCase {
    MortgageRepository mortgageRepository;

    public DeleteMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }
    public void execute(String id){
        mortgageRepository.deleteMortgage(id);
    }
}
