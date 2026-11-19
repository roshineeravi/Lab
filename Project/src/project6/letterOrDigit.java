// Roshinee
// BC263927
// Lab 2

package project6;
import java.util.Scanner;
public class letterOrDigit {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive input from user 
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		
		boolean digitsOnly = true;
		boolean lettersOnly = true;
		
		//Check each of the characters entered
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch<='Z') || (ch >= 'a' && ch <='z'))) {
				lettersOnly = false;
			}
			
			if(!(ch >= '0' && ch <='9')) {
				digitsOnly = false;
			}
		}

	        // Display the result
	        if (str.length()>0 && digitsOnly) {
	            System.out.println("The string contains digits only");
	        }
	        else if (str.length()>0 && lettersOnly) {
	            System.out.println("The string contains letters only");
	        }
	        else {
	            System.out.println("The string is mixed");
	        }
	        scanner.close();
	    }
	}



