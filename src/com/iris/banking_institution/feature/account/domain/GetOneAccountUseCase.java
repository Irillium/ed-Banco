package com.iris.banking_institution.feature.account.domain;

import com.iris.banking_institution.feature.X.domain.XRepository;

public class GetOneAccountUseCase {
    AccountRepository accountRepository;

    public GetOneAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(String numberAccount){
        accountRepository.obtainOneAccount(numberAccount);
    }
}
