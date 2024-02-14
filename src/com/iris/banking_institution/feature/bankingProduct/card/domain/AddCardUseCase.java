package com.iris.banking_institution.feature.bankingProduct.card.domain;

public class AddCardUseCase {
    CardRepository cardRepository;

    public AddCardUseCase(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void execute(Card card){
        cardRepository.addCard(card);
    }
}
