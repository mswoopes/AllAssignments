import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		int number = (int)(Math.random()*100 + 1);;
		int guess;
		
	    Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 100.");
	    	guess = keyboard.nextInt();
	    
	    while (guess != number) {
	    if (guess > number) {
	    	System.out.println("Guess lower");
	    		guess = keyboard.nextInt();
	    }
	    else if (guess < number) {
	    	System.out.println("Guess higher");
    			guess = keyboard.nextInt();
	    }
	    }	
	    
	    if (guess == number) {
	    	System.out.print("You guessed right!");
	    }	
}
}