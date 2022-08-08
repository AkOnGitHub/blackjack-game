public class BlackjackGame {

    public void playGame() {

        Deck myDeck = new Deck();
        Player myPlayer = new Player();
        
        System.out.println("Let's play Blackjack!");

        System.out.println("Shuffling...");

        myPlayer.printPlayerHand();
    }

}
