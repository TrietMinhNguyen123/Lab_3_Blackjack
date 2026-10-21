import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DealerTest {
    @Test public void emptyDealerHasTotalZero() {
        assertEquals(0, new Dealer().getHandTotal());
    }

    @Test public void totalsNumberAndFaceCards() {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("7", "Hearts"));
        dealer.receiveCard(new Card("King", "Clubs"));
        assertEquals(17, dealer.getHandTotal());
    }

    @Test public void aceChangesFromElevenToOne() {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Ace", "Spades"));
        dealer.receiveCard(new Card("9", "Hearts"));
        dealer.receiveCard(new Card("5", "Diamonds"));
        assertEquals(15, dealer.getHandTotal());
    }
}
