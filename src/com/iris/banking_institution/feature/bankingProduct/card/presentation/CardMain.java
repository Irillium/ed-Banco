package com.iris.banking_institution.feature.bankingProduct.card.presentation;
import com.iris.banking_institution.feature.bankingProduct.card.data.CardDataRepository;
import com.iris.banking_institution.feature.bankingProduct.card.domain.*;

public class CardMain {
    public static void printAllCard(){
        GetAllCardUseCase getAllCardUseCase = new GetAllCardUseCase(CardDataRepository.newInstance());
        getAllCardUseCase.execute();
    }
    public static void printOneCard(String id){
        GetOneCardUseCase getOneCardUseCase = new GetOneCardUseCase(CardDataRepository.newInstance());
        getOneCardUseCase.execute(id);
    }
    public static void deleteCard(String id){
        DeleteCardUseCase deleteCardUseCase = new DeleteCardUseCase(CardDataRepository.newInstance());
        deleteCardUseCase.execute(id);
    }
    public static void addCard(Card card){
        AddCardUseCase addCardUseCase = new AddCardUseCase(CardDataRepository.newInstance());
        addCardUseCase.execute(card);
    }
    public static void modifyCard(String id,Card card){
        ModifyCardUseCase modifyCardUseCase = new ModifyCardUseCase(CardDataRepository.newInstance());
        modifyCardUseCase.execute(id,card);
    }
}
