public class Card {
    // TODO: Declare private final String fields named rank and suit.
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        // TODO: Store both constructor arguments in the fields.
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        // TODO: Return this card's rank.
        return rank;
    }

    public String getSuit() {
        // TODO: Return this card's suit.
        return suit;
    }

    @Override
    public String toString() {
        // TODO: Return text such as "Ace of Spades".
        return rank + " of " + suit;
    }
}
