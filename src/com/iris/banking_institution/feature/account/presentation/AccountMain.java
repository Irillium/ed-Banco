package com.iris.banking_institution.feature.account.presentation;
import com.iris.banking_institution.feature.account.data.AccountDataRepository;
import com.iris.banking_institution.feature.account.domain.*;

public class AccountMain {
    public static void printAllAccount(){
        GetAllAccountUseCase getAllAccountUseCase = new GetAllAccountUseCase(AccountDataRepository.newInstance());
        getAllAccountUseCase.execute();
    }
    public static void printOneAccount(String numeroCuenta){
        GetOneAccountUseCase getOneAccountUseCase = new GetOneAccountUseCase(AccountDataRepository.newInstance());
        getOneAccountUseCase.execute(numeroCuenta);
    }
    public static void deleteAccount(String numeroCuenta){
        DeleteAccountUseCase deleteAccountUseCase = new DeleteAccountUseCase(AccountDataRepository.newInstance());
        deleteAccountUseCase.execute(numeroCuenta);
    }
    public static void addAccount(Account account){
        AddAccountUseCase addAccountUseCase = new AddAccountUseCase(AccountDataRepository.newInstance());
        addAccountUseCase.execute(account);
    }
    public static void modifyAccount(String numeroCuenta, Account account){
        ModifyAccountUseCase modifyAccountUseCase = new ModifyAccountUseCase(AccountDataRepository.newInstance());
        modifyAccountUseCase.execute(numeroCuenta,account);
    }
}
