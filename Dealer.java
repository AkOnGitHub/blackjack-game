public class Dealer extends Player {
    private Hand hand;

    Dealer(Hand hand) {
        super(hand);
    }

    public Hand getHand() {
        return hand;
    }
}
