package com.iris.banking_institution.feature.account.domain;
import com.iris.banking_institution.feature.account.data.AccountDataRepository;

public class AddAccountUseCase {
    AccountRepository accountRepository;

    public AddAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(Account account){
        accountRepository.addAccount(account);
    }
}
