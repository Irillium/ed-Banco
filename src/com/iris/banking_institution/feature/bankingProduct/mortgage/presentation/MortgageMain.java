package com.iris.banking_institution.feature.bankingProduct.mortgage.presentation;
import com.iris.banking_institution.feature.bankingProduct.mortgage.data.MortgageDataRepository;
import com.iris.banking_institution.feature.bankingProduct.mortgage.domain.*;

public class MortgageMain {
    public static void printAllMortgage(){
        GetAllMortgageUseCase getAllMortgageUseCase = new GetAllMortgageUseCase(MortgageDataRepository.newInstance());
        getAllMortgageUseCase.execute();
    }
    public static void printOneMortgage(String idMortgage){
        GetOneMortgageUseCase getOneMortgageUseCase = new GetOneMortgageUseCase(MortgageDataRepository.newInstance());
        getOneMortgageUseCase.execute(idMortgage);
    }
    public static void deleteMortgage(String idMortgage){
        DeleteMortgageUseCase deleteMortgageUseCase = new DeleteMortgageUseCase(MortgageDataRepository.newInstance());
        deleteMortgageUseCase.execute(idMortgage);
    }
    public static void addX(Mortgage mortgage){
        AddMortgageUseCase addMortgageUseCase = new AddMortgageUseCase(MortgageDataRepository.newInstance());
        addMortgageUseCase.execute(mortgage);
    }
    public static void modifyMortgage(String idMortgage,Mortgage mortgage){
        ModifyMortgageUseCase modifyMortgageUseCase = new ModifyMortgageUseCase(MortgageDataRepository.newInstance());
        modifyMortgageUseCase.execute(idMortgage,mortgage);
    }
}
