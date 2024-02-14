package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;

import com.iris.banking_institution.feature.X.domain.X;
import com.iris.banking_institution.feature.X.domain.XRepository;

public class ModifyMortgageUseCase {
    MortgageRepository mortgageRepository;

    public ModifyMortgageUseCase(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public void execute(String id, Mortgage mortgage){
        mortgageRepository.modifyMortgage(id,mortgage);
    }
}
