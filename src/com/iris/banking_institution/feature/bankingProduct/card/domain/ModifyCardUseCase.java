package com.iris.banking_institution.feature.bankingProduct.card.domain;


public class ModifyCardUseCase {
    CardRepository cardRepository;

    public ModifyCardUseCase(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void execute(String id, Card card){
        cardRepository.modifyCard(id,card);
    }
}
