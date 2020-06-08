package com.higherLowerGuessingGame.assignment1;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

	public static void main(String[] args) {

		Random number = new Random();
//		for (int i = 1; i <= 101; i++)
//		String numberGuessed = Integer.toString(number.nextInt(100));
		int numberGuessed = number.nextInt(100);
//		System.out.println(" Random number is "  + number.nextInt(100));
		System.out.println("Can you guess a number between 1 and 100: ");
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Can you guess a number between 1 and 100: ");
//		String userInput = scanner.net();
		int userInput = scanner.nextInt();
		
//		System.out.println("You guessed: " + userInput);

//		if (numberGuessed < 1 || numberGuessed > 100) {
//			System.out.println("You please guess a number between 1-100");
//		}
//		else 

		int a = Integer.parseInt("0");
		int z = Integer.parseInt("101");
		int guessAllowed = 0;	
		
		while (userInput != numberGuessed) {
			System.out.print("Guess again  :");
			userInput= scanner.nextInt();
			guessAllowed++;
		
			if (guessAllowed > 3) {
				System.out.println("Game Over");
				System.out.println("The number to guess was:  " + numberGuessed);
				userInput = numberGuessed;
			}
			
			else if (userInput == (numberGuessed)) {
			System.out.println("You win! + userInput");
			
		} else if (userInput <= a || userInput >= z) {
			System.out.println("You please guess a number between 1-100.");
		
		} else if (userInput > numberGuessed){ 
			System.out.println("To high please guess again.");
	
		
		}else if (userInput < numberGuessed){ 
			System.out.println("To low please guess again.");
			}
		
		}
		
		scanner.close();
		
	}
	
}
