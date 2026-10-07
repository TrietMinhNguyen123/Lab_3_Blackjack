import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    @Test
    void cardStoresAndDisplaysItsValues() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Ace", card.getRank());
        assertEquals("Spades", card.getSuit());
        assertEquals("Ace of Spades", card.toString());
    }

    @Test
    void newDeckContains52Cards() {
        assertEquals(52, new Deck().getSize());
    }

    @Test
    void dealingCardsChangesDeckSize() {
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.dealCards(5);
        assertEquals(5, hand.size());
        assertEquals(47, deck.getSize());
    }
}
