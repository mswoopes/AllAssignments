import java.util.Scanner;

public class CompareNumbers 
{
   public static void main(String[] args)
   {
	   int first;
	   int second;
	   int third;
	   int sum;
	   int product;
	   double average;
	   
	   Scanner keyboard = new Scanner(System.in);
	   
	   System.out.print("Enter first integer: ");
	      first = keyboard.nextInt();
	      
	   System.out.print("Enter second integer: ");
	      second = keyboard.nextInt();
	      
	   System.out.print("Enter third integer: ");
	      third = keyboard.nextInt();
	      
	   System.out.print("For the integers " + first + ", " + second + ", and " + third);
	   
	   System.out.print("\nLargest is ");
	   
	   if (first > second)
	   {
		   if (first > third)
		   {
			   System.out.print(first);
		   }
	   }
	   else if (second > first)
	   {
		   if (second > third)
		   {
			   System.out.print(second);
		   }
	   }
	   else if (third > first)
	   {
		   if (third > second)
		   {
			   System.out.print(third);
		   }
	   }
		   
	   System.out.print("\nSmallest is ");
	  
	   if (first < second)
	   {
		   if (first < third)
		   {
			   System.out.print(first);
		   }
	   }
	   else if (second < first)
	   {
		   if (second < third)
		   {
			   System.out.print(second);
		   }
	   }
	   else if (third < first)
	   {
		   if (third < second)
		   {
			   System.out.print(third);
		   }
	   }
	   
	   sum = first + second + third;
	   
	   System.out.print("\nSum is " + sum);
	   
	   product = first * second * third;
	   
	   System.out.print("\nProduct is " + product);
	   
	   average = sum / 3;
	   
	   System.out.print("\nAverage is " + average);
	   
   }
}