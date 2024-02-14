package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

public class DeleteFixedTermUseCase {
    FixedTermRepository fixedTermRepository;

    public DeleteFixedTermUseCase(FixedTermRepository fixedTermRepository) {
        this.fixedTermRepository = fixedTermRepository;
    }

    public void execute(String id){
        fixedTermRepository.deleteFixedTerm(id);
    }
}
