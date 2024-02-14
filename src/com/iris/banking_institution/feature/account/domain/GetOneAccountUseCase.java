package com.iris.banking_institution.feature.account.domain;
public class GetOneAccountUseCase {
    AccountRepository accountRepository;

    public GetOneAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(String numberAccount){
        accountRepository.obtainOneAccount(numberAccount);
    }
}
