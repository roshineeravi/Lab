package project4;
import java.util.Scanner;
public class RootsEquation {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive input from user
		System.out.print("Enter the value of a, b and c: ");
		double a = scanner.nextDouble ();
		double b = scanner.nextDouble ();
		double c = scanner.nextDouble ();
		
		if (a == 0) {
		    System.out.println("a cannot be 0 for a quadratic equation.");
		}
		else {
			// Calculate discriminant
			double d = ( Math.pow (b,2) ) - 4*a*c;
			
			//Calculate roots 
			if (d>0) {
				double r1 = (-b + Math.pow (d,0.5) ) / (2*a);
				double r2 = (-b - Math.pow (d,0.5) ) / (2*a);
				System.out.println ("The roots of the equation are " + r1 + " and " + r2);
			}
			else if (d==0) {
				double r = -b / (2*a) ;
				System.out.println ("The root of the equation is " + r);
			}
			
			else {
				System.out.println ("The equation has no real roots");
			}
		}
	    scanner.close();
	}

}


