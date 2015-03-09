//OK. O.Aktunc

import java.util.Scanner;

public class MilesPerGallon
{
   public static void main(String[] args)
   {
      int miles;           // Miles Driven
      double gallons;      // Gallons used
      double mpg;		   // miles-per-gallon
      
      Scanner keyboard = new Scanner(System.in);
            
      System.out.print("How many miles were driven? ");
      miles = keyboard.nextInt();
      
      System.out.print("How many gallons of fuel was used? ");
      gallons = keyboard.nextDouble();
      
      mpg = miles / gallons;
      
      System.out.println("The Miles per Gallon is " + mpg);
   }
}
