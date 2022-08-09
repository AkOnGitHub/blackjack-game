import java.util.Random;

enum Suits {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES;

    public static Suits getRandomSuit() {
        Random randomSuit = new Random();
        return values()[randomSuit.nextInt(values().length)];
    }
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
    ACE;

    public static Values getRandomValue() {
        Random randomValue = new Random();
        return values()[randomValue.nextInt(values().length)];
    }
}

public class Card {
    Suits cardSuit;
    private Values _cardValue;

    Card(Values value, Suits suit) {
        this._cardValue = value;
        this.cardSuit = suit;
    }

    // public static Card getRandCard() {
    //     Card randCard = new Card(Values.getRandomValue(), Suits.getRandomSuit());
    //     return randCard;
    // }

    // public static void printRandCard() {
    //     Card randCard = getRandCard();
    //     System.out.printf("%s of %s\n", randCard.cardValue, randCard.cardSuit);
    // }

    // public boolean isValid(Card card) {
        
    // }

    public Values getValue() {
        return _cardValue;
    } 

    public void setSuit(Values cardValue) {
        _cardValue = cardValue;
    }

    public void printCard() {
        System.out.printf("%s of %s\n", this.getValue().name(), this.cardSuit.name());
    }

    public int calculateCard(Card card) {
        int value = 0;

        

        return value;
    }
}
