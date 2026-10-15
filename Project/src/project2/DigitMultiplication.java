package project2;
import java.util.Scanner;
public class DigitMultiplication {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Receive input for number
		System.out.print("Enter an integer between 0 to 1000: ");
		int number = scanner.nextInt();
		
		if (number < 0 || number > 1000) {
			System.out.println("Number must only be between 0 and 1000.");
		
		}else if (number ==0) {
			System.out.println("The multiplication of all the digits is 0");
			
		}else {
			int product = 1;
		
		while (number > 0) {
			int digit = number%10;
			product = product * digit;
			number = number / 10;
		}
		
		//Display the final product
		System.out.println("The multiplication of all the digits is " + product);
		
		scanner.close();
	    }
		
	}

}


