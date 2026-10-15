package project2;
import java.util.Scanner;
public class MeterFtConversion {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Reads input of meters from user 
		System.out.print("Enter the meters: ");
		double meter = scanner.nextDouble() ;
		
		//Converts the meter from the input to feet
		double feet = meter * 3.2786 ;
		
		//Displays the conversion results
		System.out.println(meter + " meter " + " converted to feet is " + feet + " feet.");
		
		scanner.close();
	}

}

