package com.iris.banking_institution.feature.bankingProduct.fixedTerm.data;
import com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain.FixedTerm;
import com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain.FixedTermRepository;

import java.util.ArrayList;

public class FixedTermDataRepository implements FixedTermRepository {
    public static FixedTermDataRepository instance = null;
    ArrayList<FixedTerm> localFixedTerms = new ArrayList<>();

    public  static FixedTermDataRepository newInstance(){
        if(instance == null){
            instance = new FixedTermDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<FixedTerm> obtainAllFixedTerms() {
        return localFixedTerms;
    }

    @Override
    public FixedTerm obtainOneFixedTerm(String id) {
        for(FixedTerm fixedTerm:localFixedTerms){
            if(fixedTerm.getId().equals(id)){
                return fixedTerm;
            }
        }
        return null;
    }

    @Override
    public void deleteFixedTerm(String id) {
        for(FixedTerm fixedTerm:localFixedTerms){
            if(fixedTerm.getId().equals(id)){
                localFixedTerms.remove(fixedTerm);
            }
        }
    }

    @Override
    public void addFixedTerm(FixedTerm fixedTerm) {
        localFixedTerms.add(fixedTerm);
    }

    @Override
    public void modifyFixedTerm(String id,FixedTerm fixedTerm) {
        for(FixedTerm fixedTermIn:localFixedTerms){
            if(fixedTermIn.getId().equals(id)){
                fixedTermIn=fixedTerm;
            }
        }
    }
}
