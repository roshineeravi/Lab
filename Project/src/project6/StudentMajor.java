// Roshinee
// BC263927
// Lab 2

package project6;
import java.util.Scanner;
public class StudentMajor {
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	//Receive input from user 
	System.out.print("Enter two characters: ");
	String code = scanner.nextLine();
	
	//Check inputs length
	if(code.length() != 2) {
		System.out.println("Invalid input has been entered");
	}
	else {
		//Convert the letters to uppercase
		code= code.toUpperCase();
		
		//Get individual characters
		char majorCode = code.charAt(0);
		char yearCode = code.charAt(1);
		
		//Initialize two variables
		String major = "";
		String status = "";
		
		//Determine major
		if(majorCode == 'I') {
			major = "Information Systems";
        }
        else if (majorCode == 'C') {
            major = "Computer Science";
        }
        else if (majorCode == 'A') {
            major = "Accounting";
        }

        //Identify the student's status
        if (yearCode == '1') {
            status = "Freshman";
        }
        else if (yearCode == '2') {
            status = "Sophomore";
        }
        else if (yearCode == '3') {
            status = "Junior";
        }
        else if (yearCode == '4') {
            status = "Senior";
        }

        //Display result by checking the condition
        if (!major.equals("") && !status.equals("")) {
            System.out.println(major + " " + status);
        }
        else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
}

