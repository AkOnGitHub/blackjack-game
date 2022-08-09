import java.util.ArrayList;
import java.util.Collections;
// import java.util.Random;

public class Deck {
    public static int DECK_SIZE = 52;

    private static Deck mInstance;
    private ArrayList<Card> deck = new ArrayList<Card>(DECK_SIZE);

    Deck() {
        int deckIdx = 0;
        for(Suits suit : Suits.values()) {
            for(Values value : Values.values()) {
                deck.add(new Card(value, suit));
                
                deckIdx += 1;
                if (deckIdx > DECK_SIZE-1) break;
            }
        }

        shuffle();
    }

    public static Deck getInstance() {
        if (mInstance == null) {
            mInstance = new Deck();
        }

        return mInstance;
    }

    public synchronized Card drawFromDeck() {
        DECK_SIZE--;
        return (Card) deck.remove(0);
    }

    public synchronized boolean addToDeck(Card card) {
        return deck.add(card);
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    // public Card getRandCard() {
    //     Random rand = new Random();
    //     int randIdx = rand.nextInt(DECK_SIZE+1);

    //     Card randCard = this.getDeck().get(randIdx-1);
    //     getDeck().remove(randIdx);
    //     DECK_SIZE--;

    //     return randCard;
    // }

    // public void printRandCard() {
    //     Card randCard = this.getRandCard();
    //     randCard.printCard();
    // }

    public void printDeck() {
        for(Card c : this.deck) {
            c.printCard();
        }
    }
}