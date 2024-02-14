package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;

import com.iris.banking_institution.feature.bankingProduct.BankingProduct;

public class FixedTerm extends BankingProduct {
    private String monthsTerm;
    private  String interest;

    public FixedTerm(String id, String name, String description, String monthsTerm, String interest) {
        super(id, name, description);
        this.monthsTerm = monthsTerm;
        this.interest = interest;
    }

    public String getMonthsTerm() {
        return monthsTerm;
    }

    public void setMonthsTerm(String monthsTerm) {
        this.monthsTerm = monthsTerm;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
