import java.util.Scanner;
import java.util.Random;

public class GuessRandomNumber {
    public static void main(String[] args) {
        System.out.printf("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? \n");
        System.out.printf("Type a number: ");
        Scanner scanner = new Scanner(System.in);
        int numberGiven = scanner.nextInt();
        int numberToGuess = (new Random()).nextInt(100) + 1;
        
        System.out.printf("Your guess is %d\n", numberGiven);
        if (numberGiven != numberToGuess) {
            System.out.printf("The number I was thinking of is: %d\n", numberToGuess);
            System.out.printf("You were off by: %d\n", numberToGuess - numberGiven);
        }
        else {
            System.out.printf("You have found it!");
        }
        scanner.close();
    }
}
