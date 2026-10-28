import java.util.ArrayList;

public class Dealer {
    // TODO: Declare a private final ArrayList<Card> named hand.
    private final ArrayList<Card> hand;

    public Dealer() {
        // TODO: Initialize the dealer's empty hand.
        hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        // TODO: Add a non-null card to the dealer's hand.
        hand.add(card);
    }

    public ArrayList<Card> getHand() {
        // TODO: Return the dealer's hand.
        return hand;
    }

    public int getHandTotal() {
        // TODO: Add Blackjack values for all cards.
        // Number cards use their number; Jack, Queen, and King are 10.
        // Count each Ace as 11, then change Aces to 1 as needed to avoid a bust.
        int total= 0;
        boolean hadAce = false;
        for(int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);
            if(card.getRank().equals("Jack") || card.getRank().equals("Queen") || card.getRank().equals("King") ){
                total += 10;
            }else if(card.getRank().equals("Ace")){
                hadAce = true;
                total += 11;
            }else{
                total += Integer.valueOf(card.getRank());
            }
        }
        if(hadAce && total > 21){
            total -= 10;
        }
        return total;
    }

    public void playTurn(Deck deck) {
        // TODO: While the hand total is below 17, deal one card from the deck.
        // Stop if the deck is empty. The dealer stands on soft or hard 17.
        if(deck.getSize() < 0 || getHandTotal() > 17) return;

        while(getHandTotal() < 17){
            System.out.println("Dealer hit...");
            receiveCard(deck.dealCard());
            System.out.println("Dealer draws: " + getHand().get(getHand().size() - 1 ));
            System.out.println("Dealer's total:" + getHandTotal());

        }

        }
}