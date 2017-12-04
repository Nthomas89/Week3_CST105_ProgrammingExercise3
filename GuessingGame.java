import java.util.Scanner;

/**
 * Program: Guessing Game
 * File: GuessingGame.java
 * Summary: Random number generating guessing game
 * Author: Nicholas Thomas
 *Date: December 3, 2017
 */

public class GuessingGame {
	
	private static Scanner input;
	
	static int min = 1;
	static int max = 10000;
	static int number = (int) (Math.random() * (max - min)) + 1;
	static int numOfGuesses = 0;
	
	//writing a program to guess a random number
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.print("Enter a number between " + min +" and " + max + ": \n ");
		int guess = input.nextInt();
			
			
			//when a guess is too low
			if (guess<number) {
				System.out.println("HIGHER");
				min = guess;
				numOfGuesses++;
				main(args);
			}
			
			//when a guess is too high
			else if (guess>number) {
				System.out.println("LOWER");
				max = guess;
				numOfGuesses++;
				main(args);
			}
			
			//when you guessed the number correctly
			else {
				numOfGuesses++;
				System.out.println("You Won. It took you " + numOfGuesses + " guesses.");
			}
		}
	
	}

