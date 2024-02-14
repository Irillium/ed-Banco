package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

public class ModifyFixedTermUseCase {
    FixedTermRepository fixedTermRepository;

    public ModifyFixedTermUseCase(FixedTermRepository fixedTermRepository) {
        this.fixedTermRepository = fixedTermRepository;
    }

    public void execute(String id, FixedTerm fixedTerm){
        fixedTermRepository.modifyFixedTerm(id,fixedTerm);
    }
}
