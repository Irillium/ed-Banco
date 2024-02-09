package com.iris.banking_institution.feature.X.data;

import com.iris.banking_institution.feature.X.domain.X;
import com.iris.banking_institution.feature.X.domain.XRepository;

import java.util.ArrayList;

public class XDataRepository implements XRepository {
    public static XDataRepository instance = null;
    ArrayList<X> localX = new ArrayList<>();

    public  static XDataRepository newInstancia(){
        if(instance == null){
            instance = new XDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<X> obtainAllX() {
        return localX;
    }

    @Override
    public X obtainOneX(String xCode) {
        for(X x:localX){
            if(x.getxCode().equals(xCode)){
                return x;
            }
        }
        return null;
    }

    @Override
    public void deleteTapa(String xCode) {
        for(X x:localX){
            if(x.getxCode().equals(xCode)){
               localX.remove(x);
            }
        }
    }

    @Override
    public void addTapa(X x) {
        localX.add(x);
    }

    @Override
    public void modifyTapa(String xCode,X x) {
        for(X y:localX){
            if(y.getxCode().equals(xCode)){
                y=x;
            }
        }
    }
}
