import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    public static final int DECK_SIZE = 52;

    private ArrayList<Card> _deck;

    Deck() {
        _deck = new ArrayList<Card>(DECK_SIZE);

        int deckIdx = 0;
        for(Suits suit : Suits.values()) {
            for(Values value : Values.values()) {
                getDeck().add(new Card(value, suit));
                
                deckIdx += 1;
                if (deckIdx > DECK_SIZE-1) break;
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return _deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        deck = _deck;
    }

    public void shuffle() {
        Collections.shuffle(this.getDeck());
    }

    public Card getRandCard() {
        Random rand = new Random();
        int randIdx = rand.nextInt(DECK_SIZE+1);

        Card randCard = this.getDeck().get(randIdx);
        getDeck().remove(randIdx);

        return randCard;
    }

    public void printRandCard() {
        Card randCard = this.getRandCard();
        randCard.printCard();
    }

    public void printDeck() {
        for(Card c : this.getDeck()) {
            c.printCard();
        }
    }
}

interface sameDeck {
    Deck deck = new Deck();
}