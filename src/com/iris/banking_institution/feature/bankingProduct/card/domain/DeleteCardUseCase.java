package com.iris.banking_institution.feature.bankingProduct.card.domain;

public class DeleteCardUseCase {
    CardRepository cardRepository;

    public DeleteCardUseCase(CardRepository cardRepository) {
        this.cardRepository= cardRepository;
    }

    public void execute(String id){
        cardRepository.deleteCard(id);
    }
}
