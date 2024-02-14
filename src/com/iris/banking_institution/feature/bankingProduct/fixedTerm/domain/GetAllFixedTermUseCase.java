package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

public class GetAllFixedTermUseCase {
    FixedTermRepository fixedTermRepository;

    public GetAllFixedTermUseCase(FixedTermRepository fixedTermRepository) {
        this.fixedTermRepository = fixedTermRepository;
    }

    public void execute(){
        fixedTermRepository.obtainAllFixedTerms();
    }
}
