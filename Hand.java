import java.util.ArrayList;

public class Hand implements sameDeck {
    private ArrayList<Card> _hand;

    public Hand() {
        getHand().add(deck.getRandCard());
        getHand().add(deck.getRandCard());
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
}
