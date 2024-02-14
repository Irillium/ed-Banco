package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

public class AddFixedTermUseCase {
    FixedTermRepository fixedTermRepository;

    public AddFixedTermUseCase(FixedTermRepository fixedTermRepository) {
        this.fixedTermRepository = fixedTermRepository;
    }

    public void execute(FixedTerm fixedTerm){
        fixedTermRepository.addFixedTerm(fixedTerm);
    }
}
