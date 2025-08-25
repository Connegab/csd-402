// Gabe Conner
// 8/24/25
// Assignment 2.1
// This program simulates the Rock-Paper-Scissors game.

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The computer randomly chooses 1 (Rock), 2 (Paper), or 3 (Scissors)
        int computerChoice = (int)(Math.random() * 3) + 1;

        // It will prompt user for their choice
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = input.nextInt();

        // The computer's and user's choices will be displayed
        System.out.println("Computer chose: " + choiceToString(computerChoice));
        System.out.println("You chose: " + choiceToString(userChoice));

        // The result will be determined
        if (userChoice == computerChoice) {
            System.out.println("It is a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }

    // The program will then convert the choice number into a word
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
