public class Dealer extends Player {
    private Hand hand;

    Dealer(Hand hand) {
        super(hand, null);
    }

    public void dealerMoves() {
        while (hand.calculateHand() < 17) {
            hand.addCardToHand();
        }
    }
}
