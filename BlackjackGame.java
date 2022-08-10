import java.util.Scanner;

public class BlackjackGame {

    public void playGame() {

        Deck myDeck = Deck.getInstance();

        Hand playerHand = new Hand(myDeck);
        Player myPlayer = new Player(playerHand);

        Hand dealerHand = new Hand(myDeck);
        Dealer myDealer = new Dealer(dealerHand);

        myPlayer.getHand().printHand();
        System.out.println(myPlayer.getHand().calculateHand());

        myDealer.getHand().printHand();
        System.out.println(myDealer.getHand().calculateHand());
    }
}
