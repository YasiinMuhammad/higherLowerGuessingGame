package com.higherLowerGuessingGame.assignment1;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

	public static void main(String[] args) {

		Random number = new Random();

		int numberGuessed = number.nextInt(99) +1;
		
		System.out.println(numberGuessed);

		Scanner scanner = new Scanner(System.in);

		int userInput = 0;

		int minGuessingNumber = 0;
		int maxGuessingNumber = 101;
		int guessAllowed = 0;

		while (userInput != numberGuessed) {
			System.out.print("Can you guess a number between 1 and 100: ");
			userInput = scanner.nextInt();

			if (guessAllowed > 3) {
				System.out.println("Game Over");
				System.out.println("The number to guess was:  " + numberGuessed);
				break;

			} else if (userInput == numberGuessed) {
				System.out.println("You win!" + userInput);

			} else if (userInput <= minGuessingNumber || userInput >= maxGuessingNumber) {
				System.out.println("Please guess a number between 1-100.");

			} else if (userInput > numberGuessed) {
				guessAllowed++;
				System.out.println("To high please guess again.");

			} else if (userInput < numberGuessed) {
				guessAllowed++;
				System.out.println("To low please guess again.");
			}

		}

		scanner.close();

	}

}
