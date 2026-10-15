package project2;
import java.util.Scanner;
public class TelevisionCost {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		//Reads input of tv cost 
		System.out.print("Enter the price of the tv: ");
		double priceTv = scanner.nextDouble ();
		
		//Reads input of sales tax
		System.out.print("Enter the sales tax percentage that was paid: ");
		double salesTax = scanner.nextDouble ();
		
		//Calculate the total price 
		double totalPrice = ((priceTv * (salesTax/100)) + priceTv);
		
		//Display the total cost
		System.out.println ("The total cost of the television is RM" + totalPrice);
		
		scanner.close();
	}

}

