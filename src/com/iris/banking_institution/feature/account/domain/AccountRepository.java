package com.iris.banking_institution.feature.account.domain;
import java.util.ArrayList;

public interface AccountRepository {
    ArrayList<Account> obtainAllAccount();
    Account obtainOneAccount(String number);
    void deleteAccount(String numberAccount);
    void addAccount(Account account);
    void modifyAccount(String numberAccount,Account account);
}
