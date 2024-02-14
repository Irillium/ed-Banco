package com.iris.banking_institution.feature.bankingProduct.card.domain;



import java.util.ArrayList;

public interface CardRepository {
    ArrayList<Card> obtainAllCards();
    Card obtainOneCard(String id);
    void deleteCard(String id);
    void addCard(Card card);
    void modifyCard(String id,Card card);
}
