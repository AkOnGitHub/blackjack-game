import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BlackjackGame {
    private Scanner sc;
    private Player mPlayer;
    private Dealer mDealer; 
    private Computer mComputer;
    private boolean isPlaying = true;

    private ArrayList<String> keepPlaying = new ArrayList<String>(2);
    private ArrayList<String> allowedAnswers = new ArrayList<String>(2);

    public BlackjackGame() {
        System.out.println("What's your name?");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        System.out.printf("Hello, %s! How deep are your pockets?", name);
        sc = new Scanner(System.in);
        int balance = sc.nextInt();
        mPlayer.setBalance(balance); 

        mPlayer = new Player(new Hand(Deck.getInstance()), name);
        mDealer = new Dealer(new Hand(Deck.getInstance()));
        mComputer = new Computer(mPlayer, mDealer);

        keepPlaying.add("y");
        keepPlaying.add("n");

        allowedAnswers.add("hit");
        allowedAnswers.add("stand");
    }

    // TODO: make player starting balance actually matter
    public void playGame() {
        // getting and placing bet
        System.out.println("How much do you want to bet?");
        sc = new Scanner(System.in);
        int betMoney = sc.nextInt();
        mPlayer.setBetMoney(betMoney);
        mPlayer.placeBet();

        
    }
}
