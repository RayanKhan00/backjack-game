import java.util.Collections;
import java.util.List;


//Shuffles Deck to Randomize Order
public class ShuffleDeck extends Deck {

    public static List<Card> shuffle (List<Card> deck){
        Collections.shuffle(deck);
        return deck;
    }
}
