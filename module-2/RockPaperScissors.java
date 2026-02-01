/* Isaac St Hubert 01/25/2026 Module 2.2
   This program simulates a game of rock, paper, scissors */

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate computer choice adding 1 to generate values 1, 2, and 3
        int computerChoice = (int)(Math.random() * 3) + 1;

        System.out.println("1 = Rock 2 = Paper 3 = Scissors");
        System.out.print("Enter your choice: ");

        int userChoice = input.nextInt();

        // Display computer choice
        System.out.print("\nComputer chose: ");
        switch (computerChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        // Display user choice
        System.out.print("You chose: ");
        switch (userChoice) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        // Determine winner
        System.out.print("Result: ");
        switch (userChoice) {
            case 1:
                if (computerChoice == 3) {
                    System.out.println("You win!");
                } else if (computerChoice == 2) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            case 2:
                if (computerChoice == 1) {
                    System.out.println("You win!");
                } else if (computerChoice == 3) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            case 3:
                if (computerChoice == 2) {
                    System.out.println("You win!");
                } else if (computerChoice == 1) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            default:
                System.out.println("Invalid user input");
                break;
        }

        input.close();
    }
}


