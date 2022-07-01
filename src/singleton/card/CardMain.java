package singleton.card;

public class CardMain {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();
        Card card1 = cardCompany.createCard();
        Card card2 = cardCompany.createCard();
        Card card3 = cardCompany.createCard();


        System.out.println("카드1 번호"+card1.getCardNumber());
        System.out.println("카드2 번호"+card2.getCardNumber());
        System.out.println("카드3 번호"+card3.getCardNumber());
    }
}
