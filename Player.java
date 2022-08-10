import java.util.Scanner;

public class Player {
    private Hand hand;
    private int balance = 0;
    private int betMoney = 0;
    private boolean isBust = false;

    private boolean isHit = false;
    private boolean isStand = false;
    private String userInp = "";

    public Player(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public String getUserInp() {
        return userInp;
    }

    public boolean getIsHit() {
        return isHit;
    }

    public boolean getIsStand() {
        return isStand;
    }

    public void placeBet() {
        balance -= betMoney;
    }

    public boolean isBust() {
        if (hand.calculateHand() > 21) {
            isBust = true;
            return isBust;
        }
        return isBust;
    }

    public void hitOrStand() {
        if (userInp == "hit" || userInp == "h" || userInp == "Hit" || userInp == "H") {
            isHit = true;
        } else if (userInp == "stand" || userInp == "s" || userInp == "Stand" || userInp == "S") {
            isStand = true;
        }
    }
}