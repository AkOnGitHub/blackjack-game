import java.util.Scanner;
import java.util.ArrayList;

public class Blackjack {
    public static void main(String[] args) {
        BlackjackGame myGame = new BlackjackGame();
        myGame.playGame();
    }
}

// code that takes user input and converts it into integers: CAN BE USED LATER
/* 

Scanner userInput = new Scanner(System.in);
String cardToNumber = userInput.nextLine();
int cardNumber = Integer.parseInt(cardToNumber);

*/
