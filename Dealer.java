public class Dealer extends Player {
    private Hand hand = new Hand(Deck.getInstance());

    Dealer(Hand hand) {
        super(hand, null);
    }

    public void dealerMoves() {
        while (hand.calculateHand() < 17) {
            hand.addCardToHand();
        }
    }
}
