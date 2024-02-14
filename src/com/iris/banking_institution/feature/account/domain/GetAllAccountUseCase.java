package com.iris.banking_institution.feature.account.domain;

import com.iris.banking_institution.feature.account.domain.*;
import com.iris.banking_institution.feature.account.data.*;

public class GetAllAccountUseCase {
    AccountRepository accountRepository;

    public GetAllAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(){
        accountRepository.obtainAllAccount();
    }
}
