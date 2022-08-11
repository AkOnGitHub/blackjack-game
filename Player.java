public class Player {
    private Hand hand = new Hand(Deck.getInstance());
    private int balance = 0;
    private int betMoney = 0;
    private String name = "";

    private boolean isBust = false;
    private boolean isHit = false;
    private boolean isBlackjack = false;

    public Player(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    // get and set balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // get and set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get and set betMoney
    public int getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(int betMoney) {
        this.betMoney = betMoney;
    }

    // get and set isBust
    public boolean getBust() {
        return isBust;
    }

    public void setBust(boolean bust) {
        this.isBust = bust;
    }

    // get and set isHit
    public boolean getHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        this.isHit = hit;
    }

    // get and set isBlackjack
    public boolean getBlackjack() {
        return isBlackjack;
    }

    public void setBlackjack(boolean isBlackjack) {
        this.isBlackjack = isBlackjack;
    }

    // take betMoney from balance
    public boolean placeBet() {
        if (balance - betMoney > 0) {
            balance -= betMoney;
            return true;
        }
        
        return false;
    }

    // for when user hits
    public void hit() {
        hand.addCardToHand();
    }

    // checks if hand value > 21 -> resets or nothing
    public void checkBust() {
        if (hand.calculateHand() > 21) {
            isBust = true;
        }
    }

    public boolean checkBlackjack() {
        if (hand.calculateHand() == 21) {
            isBlackjack = true;
        }

        return isBlackjack;
    }
}