import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors 
{
	public static void main(String[] args) 
	{
		int user;
		int computer;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("scissors (0), rock (1), paper (2): ");
			user = keyboard.nextInt();
		
		Random ran = new Random();
		computer = ran.nextInt(3);
					
		if (user == 0 && computer == 0)
			System.out.print("You Tied: Double Scissors");
		else if (user == 0 && computer == 1)
			System.out.print("You Lost: Rock beats Scissors");
		else if (user == 0 && computer == 2)
			System.out.print("You Won: Scissors beats Paper");
		else if (user == 1 && computer == 0)
			System.out.print("You Won: Rock beats Scissors");
		else if (user == 1 && computer == 1)
			System.out.print("You Tied: Double Scissors");
		else if (user == 1 && computer == 2)
			System.out.print("You Lost: Paper beats Rock");
		else if (user == 2 && computer == 0)
			System.out.print("You Lost: Scissors beats Paper");
		else if (user == 2 && computer == 1)
			System.out.print("You Won: Paper beats Rock");
		else if (user == 2 && computer == 2)
			System.out.print("You Tied: Double Paper");
		else
			System.out.print("NULL");
	}
}
