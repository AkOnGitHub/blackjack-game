public class Player implements sharedDeck {
    private Hand _playerHand = new Hand();

    public Player() {
        
    }

    public Hand getPlayerHand() {
        return _playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        _playerHand = playerHand;
    }


    public void printPlayerHand() {
        System.out.println("Here's your hand: \n");
        getPlayerHand().printHand();
    }
}