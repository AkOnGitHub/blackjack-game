import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BlackjackGame {
    private Scanner sc;
    private Player mPlayer;
    private Dealer mDealer; 
    private Computer mComputer;
    private boolean isPlaying = true;
    private String userChoice;

    private ArrayList<String> keepPlaying = new ArrayList<String>(2);
    private ArrayList<String> allowedAnswers = new ArrayList<String>(2);

    public BlackjackGame() {
        System.out.printf("What's your name? ");
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
    // TODO: make balance matter in gameplay loop
    // TODO: every hit, check bust and blackjack, make it so when bust or blackjack == true, action is taken
    public void playGame() {

        // getting and placing bet
        System.out.printf("How much do you want to bet this round? ");
        sc = new Scanner(System.in);
        int betMoney = sc.nextInt();
        mPlayer.setBetMoney(betMoney);
        mPlayer.placeBet();
        
        // shuffling deck
        System.out.println("Shuffling...");
        Deck.getInstance().shuffle();

        mComputer.deal();


        // TODO: player hits more than once
        do {
            System.out.printf("Do you want to hit or stand? ");
            sc = new Scanner(System.in);
            userChoice = sc.nextLine();
        } while (!allowedAnswers.contains(userChoice));

        if (userChoice.equals("hit")) {
            mPlayer.hit();
            System.out.println("Now here's your hand: ");
            mPlayer.getHand().printHand();
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
    }
}
