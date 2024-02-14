package com.iris.banking_institution.feature.bankingProduct.card.domain;

import com.iris.banking_institution.feature.bankingProduct.BankingProduct;

public class Card extends BankingProduct {
    private String expirationDate;
    private String cardNumber;

    public Card(String id,String name, String description, String expirationDate, String cardNumber) {
        super(id, name, description);
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
