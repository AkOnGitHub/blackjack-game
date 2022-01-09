public class Deck {
    Card[] deck = new Card[52];

    Deck() {
        int deckIdx = 0;
        for(Suits suit : Suits.values()) {
            for(Values value : Values.values()) {
                deck[deckIdx] = new Card(value, suit);
                deckIdx += 1;
            }
        }
    }

    public void printDeck() {
        for(Card c : this.deck) {
            c.printCard();
        }
    }
}
