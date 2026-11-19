// Roshinee
// BC263927
// Lab 3

package project6;
import java.util.Scanner;
public class phoneNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Recieve input
		System.out.print("Enter an unformatted telephone number: ");
		String number = scanner.nextLine();
		
		//Extract the telephone number out of the input received 
		String areaCode = number.substring(0,3);
		String prefix = number.substring(3,6);
		String lineNumber = number.substring(6,10);
		
		//Display the formatted number 
		System.out.println("Formatted tel.no: (" + areaCode + ")" + prefix + "-" + lineNumber);
		
		scanner.close();

	
	}
}	



