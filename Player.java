public class Player implements sameDeck {
    private Hand _playerHand;

    public Player() {
        _playerHand = new Hand();
    }

    public Hand getPlayerHand() {
        return _playerHand;
    }

    public void setPlayerHand(Hand hand) {
        _playerHand = hand;
    }


    public void printPlayerHand() {
        System.out.println("Here's your hand: \n");
        getPlayerHand().printHand();
    }
}