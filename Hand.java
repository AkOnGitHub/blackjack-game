import java.util.ArrayList;

public class Hand implements sharedDeck {
    private Card _card1 = deck.getRandCard();
    private Card _card2 = deck.getRandCard();
    private ArrayList<Card> _hand = new ArrayList<>();

    public Hand() {
        _hand.add(_card1);
        _hand.add(_card2);
    }

    public ArrayList<Card> getHand() {
        return _hand;
    }

    public void setHand(ArrayList<Card> hand) {
        _hand = hand;
    }
    
    public void addCard() {
        getHand().add(deck.getRandCard());
    }

    public void printHand() {
        getHand().get(0).printCard();
        getHand().get(1).printCard();
    }

    public int calculateHand(Hand hand) {
        int value = 0;

        

        return value;
    }
}
