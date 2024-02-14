package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

public class GetOneFixedTermUseCase {
    FixedTermRepository fixedTermRepository;

    public GetOneFixedTermUseCase(FixedTermRepository fixedTermRepository) {
        this.fixedTermRepository= fixedTermRepository;
    }

    public void execute(String id){
        fixedTermRepository.obtainOneFixedTerm(id);
    }
}
