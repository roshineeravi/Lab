package project4;
import java.util.Scanner;
public class Game {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Receive the input from user
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoice = scanner.nextInt();
		
		//Generate random input for computer
		int computerChoice = (int)(Math.random() * 3);
		
		//Check the results
		
		String userChoiceName; 
		if (userChoice == 0) {
			userChoiceName = "Scissor"; 
		} else if (userChoice == 1) {
			userChoiceName = "Rock";
		} else if(userChoice == 2) {
			userChoiceName = "Paper";
		}
		
		String ComputerChoiceName; 
		if (computerChoice == 0) {
			ComputerChoiceName = "Scissor"; 
		} else if (computerChoice == 1) {
			ComputerChoiceName = "Rock";
		} else if (computerChoice ==2) {
			ComputerChoiceName = "Paper";
		}
		
		if (userChoice < 0 || userChoice > 2) {
		    System.out.println("Invalid choice");
		} else if (userChoice == computerChoice) {
			System.out.println("The computer is "+ ComputerChoiceName + ". You are " + userChoiceName + ". It is a draw" );
		} else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
			System.out.println("The computer is "+ ComputerChoiceName + ". You are " + userChoiceName + ". You won");
		} else {
			System.out.println ("The computer is "+ ComputerChoiceName + ". You are " + userChoiceName + ". Computer won ");
		}
		scanner.close();
	}

}


