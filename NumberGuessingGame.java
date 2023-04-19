import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random Generated_Number = new Random();
        int Correct_Guess = Generated_Number.nextInt(100);
        int Number_Of_Trials = 0;
        int Guess_Value;
        int Max_Attempts = 5; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome,Please enter your full name:");
        String username = scanner.nextLine();
        while (username.length() == 0) {
            System.out.println("Welcome,Please enter your full name:");
            username = scanner.nextLine();
        };

        System.out.println("Hello " + username + ", welcome to the number guessing game,Best Of Luck"); 

        for (int i = 1; i <= Max_Attempts; i++) {
            System.out.println("Guess a number between 0 and 100:");
            Guess_Value = scanner.nextInt();
            Number_Of_Trials++;
            if (Guess_Value == Correct_Guess) {
                System.out.println(
                        "Congratulations " + username + "! You guessed the number in " + Number_Of_Trials + " attempt");
                break;
            } else if (Guess_Value < Correct_Guess) {
                System.out.println("Your guess is too low,try again");
            } else {
                System.out.println("Your guess is too high,try again");
            }
            if (i == Max_Attempts) {
                System.out.println("Sorry, " + username + ", you didn't guess the number in " + Max_Attempts
                        + " attempts. The correct number was " + Correct_Guess);
            }
        }

        scanner.close();
    }

};