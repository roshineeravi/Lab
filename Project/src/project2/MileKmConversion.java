package project2;
import java.util.Scanner;
public class MileKmConversion {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Reads input of miles from user 
		System.out.print("Enter the miles: ");
		double mile = scanner.nextDouble() ;
		
		//Converts the mile from the input to Kilometres
		double kilometer = mile * 1.6 ;
		
		//Displays the conversion results
		System.out.println(mile + " miles " + " converted to kilometres is " + kilometer + " kilometers.");
		
		scanner.close();
	}

}


