package com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain;
import java.util.ArrayList;

public interface FixedTermRepository {
    ArrayList<FixedTerm> obtainAllFixedTerms();
    FixedTerm obtainOneFixedTerm(String id);
    void deleteFixedTerm(String id);
    void addFixedTerm(FixedTerm fixedTerm);
    void modifyFixedTerm(String id,FixedTerm fixedTerm);
}
