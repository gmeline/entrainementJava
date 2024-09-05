import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Random rand = new Random();
    int secretNumber = rand.nextInt(100) + 1; // generate a random number between 1 and 100

    Scanner scanner = new Scanner(System.in);

    int guess;
    do {
      System.out.print("Guess a number between 1 and 100: ");
      guess = scanner.nextInt();

      if (guess < secretNumber) {
        System.out.println("Too low! Try again.");
      } else if (guess > secretNumber) {
        System.out.println("Too high! Try again.");
      }
    } while (guess != secretNumber);

    System.out.println(" Congratulations! You guessed the correct number: " + secretNumber);
  }
}