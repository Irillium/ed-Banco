package com.iris.banking_institution.feature.bankingProduct.mortgage.domain;

import java.util.ArrayList;

public interface MortgageRepository {
    ArrayList<Mortgage> obtainAllMortgages();
    Mortgage obtainOneMortgage(String id);
    void deleteMortgage(String id);
    void addMortgage(Mortgage mortgage);
    void modifyMortgage(String id,Mortgage Mortgage);
}
