import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Player 1, enter your choice (Rock, Paper, or Scissors): ");
    String player1Choice = scanner.next();

    System.out.print("Player 2, enter your choice (Rock, Paper, or Scissors): ");
    String player2Choice = scanner.next();

    // Determine the winner
    if (player1Choice.equalsIgnoreCase("Rock")) {
      if (player2Choice.equalsIgnoreCase("Scissors")) {
        System.out.println("Player 1 wins! Rock beats Scissors.");
      } else if (player2Choice.equalsIgnoreCase("Paper")) {
        System.out.println("Player 2 wins! Paper beats Rock.");
      } else {
        System.out.println("It's a tie!");
      }
    } else if (player1Choice.equalsIgnoreCase("Scissors")) {
      if (player2Choice.equalsIgnoreCase("Paper")) {
        System.out.println("Player 1 wins! Scissors beats Paper.");
      } else if (player2Choice.equalsIgnoreCase("Rock")) {
        System.out.println("Player 2 wins! Rock beats Scissors.");
      } else {
        System.out.println("It's a tie!");
      }
    } else if (player1Choice.equalsIgnoreCase("Paper")) {
      if (player2Choice.equalsIgnoreCase("Rock")) {
        System.out.println("Player 1 wins! Paper beats Rock.");
      } else if (player2Choice.equalsIgnoreCase("Scissors")) {
        System.out.println("Player 2 wins! Scissors beats Paper.");
      } else {
        System.out.println("It's a tie!");
      }
    } else {
      System.out.println("Invalid input. Please try again.");
    }
  }
}