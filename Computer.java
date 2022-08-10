public class Computer {
    private Player player;
    private Dealer dealer;
    private boolean isPlayerWin = false;

    public Computer(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public boolean isPlayerWin() {
        int playerHandValue = player.getHand().calculateHand();
        int dealerHandValue = dealer.getHand().calculateHand();

        if (playerHandValue > dealerHandValue) {
            isPlayerWin = true;
        }

        return isPlayerWin;
    }
}
