package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;

import com.iris.banking_institution.feature.bankingProduct.BankingProduct;

public class Mortgage extends BankingProduct {
    private String starDate;
    private String endDate;
    private String interest;
    private String amountborrowed;

    public Mortgage(String id, String name, String description, String starDate, String endDate, String interest, String amountborrowed) {
        super(id, name, description);
        this.starDate = starDate;
        this.endDate = endDate;
        this.interest = interest;
        this.amountborrowed = amountborrowed;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getAmountborrowed() {
        return amountborrowed;
    }

    public void setAmountborrowed(String amountborrowed) {
        this.amountborrowed = amountborrowed;
    }
}
