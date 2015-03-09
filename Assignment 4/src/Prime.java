//OK. O.Aktunc

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int number;
		int i = 1, j;
		int isPrime = 0;
		int tally = 0;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
			number = keyboard.nextInt();
		
		System.out.println("The prime numbers smaller than " + number + " are: ");
		
		while (i < number) {
			i = i + 1;
			isPrime = 1;
			for (j = 2; j < i; j++) {
				if	(i % j == 0) {
					isPrime = 0;
				}
			}
			if (isPrime == 1) {
				System.out.println(i);
				tally = tally + 1;
			}
		}
		System.out.println("There are a total of " + tally + " prime numbers.");
	}
}
