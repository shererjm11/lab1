package Lab1;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	public static void main(String[] args) {
		Random num = new Random();
		int numguess = num.nextInt(10);
		Scanner input = new Scanner(System.in);
		int guess;
		int numTries = 0;
		boolean win = false;
		
			while(win == false){
		
			System.out.println("Guess a number between 1 and 10: ");
			guess = input.nextInt();
			numTries++;	
		
			if(guess == numguess){
				win = true;
			}else{
				System.out.println("Wrong! Guess again!");
			}
			
			
		
		}
			System.out.println("You Won");
			System.out.println("The number of tries it took to guess is: " + numTries);
			

	}
}
