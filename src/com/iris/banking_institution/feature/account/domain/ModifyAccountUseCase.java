package com.iris.banking_institution.feature.account.domain;
public class ModifyAccountUseCase {
    AccountRepository accountRepository;

    public ModifyAccountUseCase(AccountRepository aAccountRepository) {
        this.accountRepository = accountRepository;
    }

    public void execute(String numberAccount, Account account){
        accountRepository.modifyAccount(numberAccount,account);
    }
}
