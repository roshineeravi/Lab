// Roshinee
// BC263927
// Lab 3


package project3;
import java.util.Scanner;
public class volume {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive length from user
		System.out.print("Enter length of the sides and height of the Equilateral triangle : ");
		double length = scanner.nextDouble();
		
		//Calculate the area of the equilateral triangle
		double area = (Math.sqrt(3.0)/4.0 ) * Math.pow(length,2);
		
		//Calculate the volume 
		double volume = area * length;
		
		//Display the area
		System.out.printf ("The area is %.2f\n" + area);
		
		//Display the volume
		System.out.printf ("The volume of the Triangular prism is %.2f\n" + volume);
		
		scanner.close();
    }
	
}


