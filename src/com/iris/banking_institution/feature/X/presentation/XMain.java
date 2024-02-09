package com.iris.banking_institution.feature.X.presentation;

import com.iris.banking_institution.feature.X.data.XDataRepository;
import com.iris.banking_institution.feature.X.domain.GetXUseCase;
import com.iris.banking_institution.feature.X.domain.GetXsUseCase;
import com.iris.banking_institution.feature.X.domain.X;

public class XMain {
    public static void printAllX(){
        GetXsUseCase getXsUseCase = new GetXsUseCase(XDataRepository.newInstancia());
    }
    public static void printOneX(String xCode){
        GetXUseCase getXUseCase = new GetXUseCase(XDataRepository.newInstancia());
    }
    public static void deleteX(String xCode){

    }
    public static void addX(X x){

    }
    public static void modifyX(X x){

    }
}
