package com.iris.banking_institution.feature.bankingProduct.card.domain;

public class GetOneCardUseCase {
    CardRepository cardRepository;

    public GetOneCardUseCase(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void execute(String id){
        cardRepository.obtainOneCard(id);
    }
}
