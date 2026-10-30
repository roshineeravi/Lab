// Roshinee
// BC263927
// Lab 3

package project3;
import java.util.Scanner;
public class drivingCost {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Receive driving distance from user
		System.out.print("Enter the driving distance : ");
		double drivingDistance = scanner.nextDouble();
		
		// Receive miles per gallon from user
		System.out.print("Enter miles per gallon : ");
		double milesPerGallon = scanner.nextDouble();
		
		// Receive price per gallon from user
		System.out.print("Enter price per gallon : ");
		double pricePerGallon = scanner.nextDouble();
		
		//Calculate driving cost
		double drivingCost = (drivingDistance/milesPerGallon) *pricePerGallon;
		
		//Display the driving cost
		System.out.printf("The cost of driving is $%.2f\n", drivingCost);
		
		scanner.close();
	}

}


