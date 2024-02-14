package com.iris.banking_institution.feature.bankingProduct.fixedTerm.presentation;
import com.iris.banking_institution.feature.bankingProduct.fixedTerm.data.FixedTermDataRepository;
import com.iris.banking_institution.feature.bankingProduct.fixedTerm.domain.*;

public class FixedTermMain {
    public static void printAllFixedTerm(){
        GetAllFixedTermUseCase getAllFixedTermUseCase = new GetAllFixedTermUseCase(FixedTermDataRepository.newInstance());
        getAllFixedTermUseCase.execute();
    }
    public static void printOneFixedTerm(String idFixedTerm){
        GetOneFixedTermUseCase getOneFixedTermUseCase = new GetOneFixedTermUseCase(FixedTermDataRepository.newInstance());
        getOneFixedTermUseCase.execute(idFixedTerm);
    }
    public static void deleteFixedTerm(String idFixedTerm){
        DeleteFixedTermUseCase deleteFixedTermUseCase = new DeleteFixedTermUseCase(FixedTermDataRepository.newInstance());
        deleteFixedTermUseCase.execute(idFixedTerm);
    }
    public static void addFixedTerm(FixedTerm fixedTerm){
        AddFixedTermUseCase addFixedTermUseCase = new AddFixedTermUseCase(FixedTermDataRepository.newInstance());
        addFixedTermUseCase.execute(fixedTerm);
    }
    public static void modifyFixedTerm(String idFixedTerm,FixedTerm fixedTerm){
        ModifyFixedTermUseCase modifyFixedTermUseCase = new ModifyFixedTermUseCase(FixedTermDataRepository.newInstance());
        modifyFixedTermUseCase.execute(idFixedTerm,fixedTerm);
    }
}
