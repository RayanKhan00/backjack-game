import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    //Deck of 52 cards
    private static List<Card> deck = new ArrayList<>();



    //This is mainly used for testing to ensure the deck has 52 cards at the beginning of each round.
    public int getDeckSize(){
        return deck.size();
    }


    //Below are the methods that will be called. They use the other methods that won't be directly called.
    //----------------------------------------------------------------------------------------------------

    // All values and names are assigned to the cards,but it is unshuffled.
    public List <Card> getTheDeck(){
        giveDeckSuitsAndRanks();
        giveValues(deck);
        return deck;
    }












    //This will give create all the standard 52 cards in a deck by making a card object and passing in values from the "Ranks" & "Suits" Array
    //The cards still need to be assigned their game value.
    private  List <Card>  giveDeckSuitsAndRanks () {

        //This will clear the deck when a new round is started.
        deck.clear();

        for (int i = 0; i < Constants.suits.length; i++) {
            for (int j = 0; j < Constants.ranks.length; j++) {
                Card card = new Card(Constants.suits[i], Constants.ranks[j]);
                deck.add(card);

            }
        }
        return deck;
    }



    //Assigns game value to all cards by setting the method from the "Values" array
    private  List<Card> giveValues(List<Card> deck){
        for (int i=0;i<deck.size();i++){
            deck.get(i).setValue(Constants.values[i]);
        }
        return deck;
    }




    //Removes the last element of the deck, like how you draw a card from the top of the deck. Returns the card that was drawn.
    public Card draw(){

        return deck.remove(deck.size()-1);
    }










}
