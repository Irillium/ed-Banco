package com.iris.banking_institution.feature.bankingProduct.card.data;
import com.iris.banking_institution.feature.bankingProduct.card.domain.*;
import java.util.ArrayList;

public class CardDataRepository implements CardRepository {
    public static CardDataRepository instance = null;
    ArrayList<Card> localCards = new ArrayList<>();

    public  static CardDataRepository newInstance(){
        if(instance == null){
            instance = new CardDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Card> obtainAllCards() {
        return localCards;
    }

    @Override
    public Card obtainOneCard(String idCard) {
        for(Card card:localCards){
            if(card.getId().equals(idCard)){
                return card;

            }
        }
        return null;
    }

    @Override
    public void deleteCard(String idCard) {
        for(Card card:localCards){
            if(card.getId().equals(idCard)){
                localCards.remove(card);
            }
        }
    }

    @Override
    public void addCard(Card card) {
        localCards.add(card);
    }

    @Override
    public void modifyCard(String xCode,Card card) {
        for(Card cardIn:localCards){
            if(cardIn.getId().equals(xCode)){
                cardIn=card;
            }
        }
    }
}
