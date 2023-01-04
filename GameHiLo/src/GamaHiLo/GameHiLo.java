package GamaHiLo;

import java.util.Scanner;

public class GameHiLo {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	   	System.out.println("Guess a number between 0 and 10: ");
				String playAgain ="";
		do {
	// Create a random number for the user to quess
				int theNumber=(int)(Math.random()*10+1);
				int quess=0;
				int numberOfTries=0;
			while(quess !=theNumber) {
				quess = scan.nextInt();
				    numberOfTries++;   
				    System.out.println("You entered "+quess+".");
				    if (quess<theNumber)
					System.out.println(quess+" is too low.Try again.");
				else if (quess>theNumber)
					System.out.println(quess+"is too high.Tru again.");
				else
					System.out.println(quess+"is correct.You win!");}
				    System.out.println("It only took you "+numberOfTries+"!"+"Good work!");
				
				System.out.println("Woud you like to play again (y/n)? ");
		playAgain=scan.next();
		
	}
		while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for plaing! You winner! Bye,bye)");
		scan.close();
	}
}
