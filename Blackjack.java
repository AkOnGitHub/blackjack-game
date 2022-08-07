import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println("Let's play Blackjack!");

        Deck myDeck = new Deck();
        // myDeck.printDeck();

        myDeck.shuffle(1);
        myDeck.printDeck();

        // Player myPlayer = new Player();
    }

    // public class Dealer extends Player {

    // }
    
    public class Player {
        private static Card[] playerInventory;
        private static Card card1;
        private static Card card2;

        public Player() {
            card1 = Card.getRandCard();
            card2 = Card.getRandCard();

            // playerInventory = {card1, card2};
        }

        public Card[] getInventory() {
            return playerInventory;
        }

        public boolean setInventory(Card[] playerInventory) {
            // need to implement validity check
            // if (!playerInventory[0].isValid() || !playerInventory[1].isValid()) { <-- need to define isValid
            //     return false;
            // }

            Blackjack.Player.playerInventory = playerInventory;
            return true;
        }
    }
}

// code that takes user input and converts it into integers: CAN BE USED LATER
/* 

Scanner userInput = new Scanner(System.in);
String cardToNumber = userInput.nextLine();
int cardNumber = Integer.parseInt(cardToNumber);

*/
