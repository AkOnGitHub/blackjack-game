import java.util.Scanner;

public class BlackjackGame {

    public void playGame() {

        Deck myDeck = Deck.getInstance();

        Hand playerHand = new Hand(myDeck);
        Player myPlayer = new Player(playerHand);

        myPlayer.getHand().printHand();
        System.out.println(myPlayer.getHand().calculateHand());
    }
}
