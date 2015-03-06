import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {

		String name;
		String type;
		int age;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter in the dog's name: ");;
	      name = keyboard.nextLine();
	    
	    System.out.println("Enter in dog's breed: ");
	      type = keyboard.nextLine();
	      
	    System.out.println("Enter in the dog's age: ");
	      age = keyboard.nextInt();
		
		Pet p1 = new Pet(name, type, age);
		
		System.out.println(p1.getName() + " " + p1.getType() + " " + p1.getAge());
		
	}
}
