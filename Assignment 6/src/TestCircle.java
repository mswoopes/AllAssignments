import java.util.Scanner;

public class TestCircle {
	
	public static void main(String[] args) {
		
		double r;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter in a radius: ");
	      r = keyboard.nextDouble();
	      
	    Circle c = new Circle();
	    
	    c.radius = r;
	      
	    System.out.println(c.getRadius());
	    System.out.println(c.getArea());
	    System.out.println(c.getDiameter());
	    System.out.println(c.getCircumference());
	}
}