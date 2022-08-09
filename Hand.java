import java.util.ArrayList;

public class Hand {
    private Deck deck;
    private ArrayList<Card> hand = new ArrayList<Card>(2);

    public Hand(Deck deck) {
        this.deck = deck;
        setHand(hand);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        for (int i = 0; i < 2; i++) {
            getHand().add(i, deck.drawFromDeck());
        }
    }
    
    public void addCardToHand() {
        getHand().add(deck.drawFromDeck());
    }

    public void printHand() {
        int size = getHand().size();

        for (int i = 0; i < size; i++)
            getHand().get(i).printCard();
    }

    public int calculateHand() {
        int value = 0, size = getHand().size();

        for (int i = 0; i < size; i++)
            value += getHand().get(i).calculateCard();

        return value;
    }
}
