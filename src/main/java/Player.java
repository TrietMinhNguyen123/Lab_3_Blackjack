import java.util.*;
public class Player {
    // TODO 1: Create an ArrayList<Card> to store this player's hand.
    // TODO 2: Add a boolean field to track whether the player has stood.
    private ArrayList<Card> playerHand;
    private boolean stood;
    public Player() { // TODO 3: Initialize the player's fields if needed.
        playerHand = new ArrayList<>();
    }
    public void addCard(Card card) {
        // TODO 4: Add the supplied card to the hand.
        playerHand.add(card);
    }
    public List<Card> getHand() {
        // TODO 5: Return the player's hand (a copy or unmodifiable view is recommended).
        List<Card> copyPlayerHand = new ArrayList<>();
        for(int i = 0; i < playerHand.size(); i++){
            copyPlayerHand.add(playerHand.get(i));
        }
        return copyPlayerHand;

    }
    public int getHandTotal() {
        // TODO 6: Add card values. Treat Aces as 11, then reduce by 10 for each Ace needed to avoid busting.
        int total= 0;
        boolean hadAce = false;
        for(int i = 0; i < playerHand.size(); i++){
            Card card = playerHand.get(i);
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
    public void hit(Deck deck) {
        // TODO 7: Draw a card from the deck and add it to the hand.
        playerHand.add(deck.dealCard());
    }
    public void stand() {
        // TODO 8: Mark the player as standing.
        stood = true;
    }
    public boolean isStanding() {
        // TODO 9: Return whether the player has stood.
        return stood;
    }
    public boolean isBust() {
        // TODO 10: Return true when the total exceeds 21.
        return (getHandTotal() > 21);
    }
}
