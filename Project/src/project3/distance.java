// Roshinee
// BC263927
// Lab 3

package project3;
import java.util.Scanner;
public class distance {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Receive point 1 from user
		System.out.print("Enter x1 and y1 : ");
		double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
		
		// Receive point 2 from user
		System.out.print("Enter x2 and y2 : ");
		double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
		
		//Calculate the distance
		double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
		
		//Display the distance
		System.out.println("The distance between the two points is " + distance);
		
		scanner.close();
	}

}


