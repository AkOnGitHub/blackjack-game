import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BlackjackGame {
    private Scanner sc;
    private Player mPlayer;
    private Dealer mDealer; 
    private Computer mComputer;
    private boolean isPlaying = true;
    private boolean pass = false;

    private ArrayList<String> keepPlaying = new ArrayList<String>(2);
    private ArrayList<String> allowedAnswers = new ArrayList<String>(2);

    public BlackjackGame() {
        System.out.println("What's your name?");
        sc = new Scanner(System.in);
        String name = sc.nextLine();

        mPlayer = new Player(new Hand(Deck.getInstance()), name);
        mDealer = new Dealer(new Hand(Deck.getInstance()));
        mComputer = new Computer(mPlayer, mDealer);
        
        System.out.printf("Hello, %s! What's your balance (in dollars)? ", name);
        sc = new Scanner(System.in);
        int balance = sc.nextInt();
        mPlayer.setBalance(balance);

        keepPlaying.add("y");
        keepPlaying.add("n");

        allowedAnswers.add("hit");
        allowedAnswers.add("stand");
    }

    // TODO: fix spacing in prompts
    public void playGame() {
        // getting and placing bet
        System.out.println("How much do you want to bet this round?");
        sc = new Scanner(System.in);
        int betMoney = sc.nextInt();
        mPlayer.setBetMoney(betMoney);
        mPlayer.placeBet();
        
        System.out.println("Shuffling...");
        try { Thread.sleep(2000); } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }

        mComputer.deal();

        while (pass != true) {
            mComputer.prompt();
            sc = new Scanner(System.in);
            String userChoice = sc.nextLine();

            if (allowedAnswers.contains(userChoice)) {
                if (userChoice == "hit") {
                    mPlayer.hit();
                }

                pass = true;
            } else {
                System.out.println("That's not a valid answer. Try again.\n");
            }
        }

        // TODO: check dealer blackjack, what to do if both blackjack, etc.

        mPlayer.checkBust();
        if (mPlayer.getBust() == true) {
            System.out.println("Sorry, you bust. Play again?");
            // TODO: implement game loop
        }

        mPlayer.checkBlackjack();
        if (mPlayer.getBlackjack() == true && mDealer.checkBlackjack() == false) {
            System.out.println("Yayyy! Blackjack! You beat the dealer!");
            // TODO: implement game loop
            // TODO: implement payout
        }

        System.out.println("Here's your hand now: \n");
        mPlayer.getHand().addCardToHand();
        mPlayer.getHand().printHand();
    }
}
