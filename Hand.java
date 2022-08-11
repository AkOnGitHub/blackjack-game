import java.util.ArrayList;

public class Hand {
    private Deck deck;
    private ArrayList<Card> hand;

    public Hand(Deck deck) {
        this.deck = deck;
        hand = new ArrayList<Card>(2);
        setHand();
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setHand() {
        resetHand();
        for (int i = 0; i < 2; i++) {
            hand.add(i, deck.drawFromDeck());
        }
    }

    public void resetHand() {
        for (int i = 0; i < hand.size(); i++) {
            deck.addToDeck(hand.get(i));
        }
    }
    
    public void addCardToHand() {
        hand.add(deck.drawFromDeck());
    }

    public void printHand() {
        int size = hand.size();

        for (int i = 0; i < size; i++)
            hand.get(i).printCard();
    }

    public int calculateHand() {
        int value = 0, size = hand.size();

        for (int i = 0; i < size; i++)
            value += hand.get(i).calculateCard();

        return value;
    }

    public void showOneCard() {
        hand.get(0).printCard();
    }
}
