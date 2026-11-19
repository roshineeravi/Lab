// Roshinee
// BC263927
// Lab 3

package project6;
import java.util.Scanner;
public class NumOfVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Receive input from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Convert the input to lowercase
        str = str.toLowerCase();

        // Initialize value for all the vowels
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int others = 0;

        // Count vowels
        for (int x = 0; x < str.length(); x++) {
            char ch = str.charAt(x);
            if (ch == 'a') {
                a++;
            }
            else if (ch == 'e') {
                e++;
            }
            else if (ch == 'i') {
                i++;
            }
            else if (ch == 'o') {
                o++;
            }
            else if (ch == 'u') {
                u++;
            }
            else {
                others++;
            }
        }

        // Calculate total vowels
        int totalVowels = a + e + i + o + u;

        // Display results
        System.out.println("Total vowels: " + totalVowels);
        System.out.println("a " + a);
        System.out.println("e " + e);
        System.out.println("i " + i);
        System.out.println("o " + o);
        System.out.println("u " + u);
        System.out.println("others " + others);
        
        scanner.close();
    }
}


