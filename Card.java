enum Suits {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

enum Values {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
}

public class Card {
    Suits cardSuit;
    Values cardValue;

    Card(Values value, Suits suit) {
        this.cardValue = value;
        this.cardSuit = suit;
    }

    public void printCard() {
        System.out.printf("%s of %s", this.cardValue.name(), this.cardSuit.name());
    }
}
