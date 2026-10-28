import java.util.*;
public class Main {
    public static String determineResult(int playerTotal,int dealerTotal) {
        // TODO 11: Return "wins", "loses", or "push".
        // Player busts lose; dealer busts mean surviving players win; ties push.
        String decision = "";
        if((playerTotal < dealerTotal && dealerTotal <= 21) || dealerTotal < 21 && playerTotal > 21) decision = "lose";
        else if((playerTotal > dealerTotal && playerTotal <= 21) || (playerTotal < 21 && dealerTotal > 21)) decision = "win";
        else if((playerTotal == dealerTotal) || (playerTotal > 21 && dealerTotal > 21)) decision  = "push";
        return decision;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // TODO 12: Ask for 1-4 players. Reject invalid input and prompt again.
        System.out.print("Enter number of players (1-4): ");
        // TODO 13: Create one Deck, one Dealer, and the requested Player objects.
        int numbersPlayer = input.nextInt();
        Deck deck = new Deck();
        deck.shuffle();
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.dealCard());
        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < numbersPlayer;i++){
            players.add(new Player());
        }
        // TODO 14: Deal two cards to every player and the dealer.
        for(int x = 0; x < players.size(); x++){
            Player player = players.get(x);
            for(int i = 0; i < 2; i++){
                player.addCard(deck.dealCard());
            }
        }
        // TODO 15: For each player, print their hand/total and ask "hit or stand?".
        //          Continue until they stand or bust. Handle invalid choices.
        for(int i = 0; i < players.size();i++){
            Player player = players.get(i);
            System.out.println("Player " + (i+ 1) + "\'s hand: " + player.getHand().toString());
            System.out.println("Player " + (i+ 1) + " total: " + player.getHandTotal());
            System.out.print("Player " + (i+ 1) + ", hit or stand? ");
            String choice = input.next();
            if(choice.equals("stand")){
                player.stand();
            }if(choice.equals("hit")) {
                while (!player.isStanding()) {
                    player.hit(deck);
                    List<Card> added_card = player.getHand();
                    System.out.println("Player " + (i + 1) + " draws: " + added_card.get(added_card.size() - 1));
                    System.out.println("Player " + (i + 1) + " total: " + player.getHandTotal());
                    if (player.isBust()) break;
                    System.out.print("Player " + (i + 1) + ", hit or stand? ");
                    choice = input.next();
                    if (choice.equals("stand")) player.stand();
                }
            }
        }
        // TODO 16: After all player turns, show the dealer's hand and total.
        System.out.println(" ");
        System.out.println("Dealer's hand: " + dealer.getHand().toString());
        System.out.println("Dealer's total:" + dealer.getHandTotal());
        dealer.playTurn(deck);
        // TODO 17: Dealer draws until their total is at least 17.
        // TODO 18: Print results for each player using determineResult().
        for(int i = 0; i < players.size(); i++){
            Player player = players.get(i);
            String decision = determineResult(player.getHandTotal(),dealer.getHandTotal());
            System.out.println("Player "+ (i + 1) + " total: " + player.getHandTotal() + " -> " + decision);
        }
    }
}
