public class Dealer extends Player {
    private Hand _dealerHand = new Hand();

    Dealer() {
        super();
    }

    public Hand getDealerHand() {
        return _dealerHand;
    }

    public void setPlayerHand(Hand dealerHand) {
        _dealerHand = dealerHand;
    }


    public void printDealerHand() {
        System.out.println("Here's the dealer's hand: \n");
        getDealerHand().printHand();
    }
}
