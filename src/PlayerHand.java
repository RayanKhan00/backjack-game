import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class PlayerHand implements Hand {


    //Represents the cards a person draws.
    List<Card> player_Hand = new ArrayList<>();

    @Override //Ads card to player's hand
    public Card addCardToHand(Card card) {
        player_Hand.add(card);
        return card;
    }

    @Override //Gets value of a player's hand
    public int getValueOfHand() {
        int value = 0;
        for (Card card : player_Hand) {
            value += card.getValue();
        }
        return value;
    }

    @Override //Prints sum of hand
    public void printValueOfHand(int value) {
        System.out.println( "Hand Value is: " + getValueOfHand());
    }

    @Override //Prints a single card
    public String printCard(Card card) {
        return card.toString();
    }

    @Override //Prints all cards in hand
    public void printCardsInHand() {
        //System.out.println(getName() + "'s Current Hand");
        for (Card card : player_Hand) {
            System.out.println(card);
        }

    }

    @Override //Clear's hand
    public void clearHand() {
        player_Hand.clear();
        System.out.println("Hand cleared");
    }
}

   /* public String toString(){
        return name;
    }

}*/
