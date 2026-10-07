import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        // TODO: Create arrays containing the 13 ranks and 4 suits.
        // TODO: Use nested loops to add all 52 unique Card objects.
        String[] suit =  {"Spaces","Clubs", "Diamonds", "Hearts"};
        for(int suit_index = 0; suit_index < 4; suit_index++){
            for(int ranks = 1; ranks <= 13; ranks++){
                if(ranks == 1){
                    Card card = new Card("Ace", suit[suit_index]);
                    cards.add(card);
                }else if(ranks == 11){
                    Card card = new Card("Jack", suit[suit_index]);
                    cards.add(card);
                } else if (ranks == 12) {
                    Card card = new Card("Queen", suit[suit_index]);
                    cards.add(card);
                } else if (ranks == 13) {
                    Card card = new Card("King", suit[suit_index]);
                    cards.add(card);
                }else {

                    Card card = new Card(String.valueOf(ranks), suit[suit_index]);
                    cards.add(card);
                }
            }
        }
    }

    public int getSize() {
        // TODO: Return the number of cards still in the deck.
        return cards.size();
    }

    public void shuffle() {
        // TODO: Shuffle cards using Collections.shuffle.
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        // TODO: Return null if empty; otherwise remove and return the top card.
        if(cards.isEmpty())return null;

        Card dealCard = cards.get(cards.size() - 1);
        cards.remove(cards.size() -1);
        return dealCard;
    }

    public ArrayList<Card> dealCards(int n) {
        // TODO: Throw IllegalArgumentException if n is negative or too large.
        // TODO: Deal n cards into a new ArrayList and return it
        if( n < 0 || n > cards.size()){
            throw new IllegalArgumentException("n is negative or too large" + n);
        }
        ArrayList<Card> dealCards = new ArrayList<>();
        for(int i = 0; i < n;i++){
            Card dealing_card = dealCard();
            dealCards.add(dealing_card);
        }

            return dealCards;
    }
}
