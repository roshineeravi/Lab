package project5;
import java.util.Scanner;
public class Seconds {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive input
		System.out.print ("Enter the number of seconds: ");
		int numOfSeconds = scanner.nextInt();
		
		int days, hours, minutes ;
		
		if (numOfSeconds <0) {
			System.out.println("Invalid input");
		}else if (numOfSeconds >= 86400) {
			days = numOfSeconds / 86400; 
		    System.out.println("The number of days are " + days);
		}else if (numOfSeconds >= 3600) {
			hours = numOfSeconds / 3600 ;
			System.out.println("The number of hours are " + hours);
		}else if (numOfSeconds >= 60) {
			minutes = numOfSeconds / 60 ;
			System.out.println("The number of minutes are " + minutes);

		}else
			System.out.println("Less than a minute");
		
		scanner.close();
	}

}



