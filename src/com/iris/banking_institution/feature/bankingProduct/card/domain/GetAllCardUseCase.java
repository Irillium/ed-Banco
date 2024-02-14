package com.iris.banking_institution.feature.bankingProduct.card.domain;

public class GetAllCardUseCase {
    CardRepository cardRepository;

    public GetAllCardUseCase(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void execute(){
        cardRepository.obtainAllCards();
    }
}
