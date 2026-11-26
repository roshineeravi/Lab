package project5;
import java.util.Scanner;
public class Discount {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive input from user
		System.out.print("Enter your bill amount : ");
		double billAmount = scanner.nextDouble();
		
		double discount; 
		
		if (billAmount < 150) {
			discount = 0.05;
		}else if (billAmount < 600) {
			discount = 0.10;
		}else {
			discount = 0.15;
		}
        
		//Calculate discount
		double discountedPrice = billAmount - (billAmount * discount);
		
		//Display the discounted price
		System.out.println("The discounted final bill is RM" + discountedPrice);
			
		scanner.close();
	}

}


