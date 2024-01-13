public interface Hand {
    //Ads card to player's hand
    Card addCardToHand(Card card);

    //Gets value of a player's hand
    int getValueOfHand();

    //Prints sum of hand
    void printValueOfHand(int value);

    //Prints a single card
    String printCard(Card card);

    //Prints all cards in hand
    void printCardsInHand();

    //Clear's hand
    void clearHand();

}
