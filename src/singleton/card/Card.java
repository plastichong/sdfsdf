package singleton.card;

public class Card {
    private int cardNumber;
    private static int serialNum = 10000;

    public Card(){
        serialNum++;
        cardNumber = serialNum;
    }
    public int getCardNumber(){
        return cardNumber;
    }

}
