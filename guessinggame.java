package Lab1;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	public static void main(String[] args) {
		Random num = new Random();
		int numguess = num.nextInt(10);
		Scanner input = new Scanner(System.in);
		int guess;
		
		System.out.println("Guess a number between 1 and 10: ");
		guess = input.nextInt();
		
		
		if(guess == numguess){
			System.out.println("Youre right!");
		}else{
			System.out.println("Youre Wrong!");
			
		}
		
	}

}
