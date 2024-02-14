package com.iris.banking_institution.feature.account.data;

import com.iris.banking_institution.feature.account.domain.*;

import java.util.ArrayList;

public class AccountDataRepository implements AccountRepository{
    public static AccountDataRepository instance = null;
    ArrayList<Account> localAccounts = new ArrayList<>();

    public  static AccountDataRepository newInstance(){
        if(instance == null){
            instance = new AccountDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Account> obtainAllAccount() {
        return localAccounts;
    }

    @Override
    public Account obtainOneAccount(String idAccount) {
        for(Account acccount:localAccounts){
            if(acccount.getNumeroCuenta().equals(idAccount)){
                return acccount;
            }
        }
        return null;
    }

    @Override
    public void deleteAccount(String idAccount) {
        for(Account account:localAccounts){
            if(account.getNumeroCuenta().equals(idAccount)){
                localAccounts.remove(account);
            }
        }
    }

    @Override
    public void addAccount(Account account) {
        localAccounts.add(account);
    }

    @Override
    public void modifyAccount(String idAccount,Account account) {
        for(Account accountIn:localAccounts){
            if(accountIn.getNumeroCuenta().equals(idAccount)){
                accountIn=account;
            }
        }
    }
}
