package project2;
import java.util.Scanner;
public class Average {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Reads input from user
		System.out.print("Enter the first number:");
		double number1 = scanner.nextDouble();
		
		System.out.print("Enter the second number:");
		double number2 = scanner.nextDouble();
		
		System.out.print("Enter the third number:");
		double number3 = scanner.nextDouble();
		
		//Calculates the average of the three numbers
		double averageValue = (number1+number2+number3)/ 3 ;
		
		//Displays the results 
		System.out.println ("The average of three numbers given is " + averageValue + ".");
		
		scanner.close();
	}
	
}

