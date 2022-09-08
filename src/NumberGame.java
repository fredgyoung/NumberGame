

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println(randomNumber);

        System.out.println("I have chosen a random number between 1 and 100");
        System.out.println("Guess it or die!");

        Scanner scanner = new Scanner(System.in);

        for(int i = 10; i > 0; i--) {

            if(i == 1) {
                System.out.println("You have 1 guess left! Guess again: ");
            } else {
                System.out.println("You have " + i + " guesses left. Guess again: ");
            }

            int guess = scanner.nextInt();

            if(guess == randomNumber) {
                System.out.println("You guessed correctly!");
                break;
            } else {
                System.out.println("Sorry. Wrong number.");
            }
        }

    }




}
