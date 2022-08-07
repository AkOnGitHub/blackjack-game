public class Deck {
    Card[] deck = new Card[52];

    Deck() {
        int deckIdx = 0;
        for(Suits suit : Suits.values()) {
            for(Values value : Values.values()) {
                deck[deckIdx] = new Card(value, suit);
                
                deckIdx++;
                if (deckIdx > 51) break;
            }
        }
    }

    public void shuffle(int times) {
        for (int i = 0; i < times; i++) {
            deck[26] = deck[0];
            for (int j = 25, k = 27; j > 0; j--) {
                deck[j] = deck[26 - j];
                deck[k] = deck[j + 1];
                k--;
            }
        }
    }

    public void printDeck() {
        for(Card c : this.deck) {
            c.printCard();
        }
    }
}
