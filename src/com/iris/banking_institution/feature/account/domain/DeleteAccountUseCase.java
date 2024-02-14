package com.iris.banking_institution.feature.account.domain;

public class DeleteAccountUseCase {
    AccountRepository accountRepository;

    public DeleteAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(String numberAccount){
        accountRepository.deleteAccount(numberAccount);
    }
}
