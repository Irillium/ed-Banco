package com.iris.banking_institution.feature.bankingProduct.mortgage.data;

import com.iris.banking_institution.feature.bankingProduct.mortgage.domain.Mortgage;
import com.iris.banking_institution.feature.bankingProduct.mortgage.domain.MortgageRepository;

import java.util.ArrayList;

public class MortgageDataRepository implements MortgageRepository {
    public static MortgageDataRepository instance = null;
    ArrayList<Mortgage> localMortgages = new ArrayList<>();

    public  static MortgageDataRepository newInstance(){
        if(instance == null){
            instance = new MortgageDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Mortgage> obtainAllMortgages() {
        return localMortgages;
    }

    @Override
    public Mortgage obtainOneMortgage(String id) {
        for(Mortgage mortgage:localMortgages){
            if(mortgage.getId().equals(id)){
                return mortgage;
            }
        }
        return null;
    }

    @Override
    public void deleteMortgage(String id) {
        for(Mortgage mortgage:localMortgages){
            if(mortgage.getId().equals(id)){
                localMortgages.remove(mortgage);
            }
        }
    }

    @Override
    public void addMortgage(Mortgage mortgage) {
        localMortgages.add(mortgage);
    }

    @Override
    public void modifyMortgage(String id,Mortgage mortgage) {
        for(Mortgage mortgageIn:localMortgages){
            if(mortgageIn.getId().equals(id)){
                mortgageIn=mortgage;
            }
        }
    }
}
