
//OK. O.Aktunc
import javax.swing.JOptionPane;

public class ComputeBMI
{
   public static void main(String[] args)
   {
      String inputString;	// For reading input
      int weight1;          // Weight in pounds
      double weight2;		// Weight in kilograms
      int height1;			// Height in inches
      double height2;		// Height in meters
      double height3;		// Height for calculation
      double bmi;			// The body mass index
      
      inputString =
        JOptionPane.showInputDialog("Enter your weight " + "in pounds. ");

      weight1 = Integer.parseInt(inputString);

      inputString =
    	JOptionPane.showInputDialog("Enter your height " + "in inches. ");

      height1 = Integer.parseInt(inputString);
    	     
      weight2 = weight1 * 0.45359237;
    		  
      height2 = height1 * 0.0254;
      
      height3 = height2 * height2;
      
      bmi = weight2 / height2;
            
      JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bmi);

      System.exit(0);
   }
}
