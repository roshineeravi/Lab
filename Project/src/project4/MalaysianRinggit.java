package project4;
import java.util.Scanner;
public class MalaysianRinggit {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive the total amount
		System.out.print("Enter Malaysian Ringgit amount : "); 
		int malaysianRinggit = scanner.nextInt();
		
		//Calculate the minimum bills
		int bill50 = malaysianRinggit / 50;
		int remainder = malaysianRinggit % 50;
		
		int bill20 = remainder / 20;
		remainder = remainder % 20;
		
		int bill10 = remainder / 10;
		remainder = remainder % 10;
		
		int bill5 = remainder / 5;
		remainder = remainder % 5;
		
		int bill1 = remainder;
		
		//Display the minimum number of bills
		System.out.println("Number of RM50 bills : " + bill50);
		System.out.println("Number of RM20 bills : " + bill20);
		System.out.println("Number of RM10 bills : " + bill10);
		System.out.println("Number of RM5 bills : " + bill5);
		System.out.println("Number of RM1 bills : " + bill1);
		
		scanner.close();
		
	}

}

