package project5;
import java.util.Scanner;

public class Dataplan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String packageName;
        int minutesUsed;
        int baseMinutes = 0;
        int extraMinutes = 0;
        double baseCharge = 0;
        double extraCharge = 0;
        double totalCharges;

        //Read packageName, minutesUsed
        System.out.println("Enter the following details:");
        System.out.println();
        System.out.print("Package type: ");
        packageName = scanner.next();
        System.out.print("Minutes used: ");
        minutesUsed = scanner.nextInt();

        //Switch
        switch (packageName) {

            case "Gold":
                baseCharge = 80;
                if (minutesUsed > 450) {
                    baseMinutes = 450;
                    extraMinutes = minutesUsed - 450;
                    extraCharge = extraMinutes * 0.40;
                }
                else {
                    baseMinutes = minutesUsed;
                }
                break;

            case "Platinum":
                baseCharge = 120;
                if (minutesUsed > 900) {
                    baseMinutes = 900;
                    extraMinutes = minutesUsed - 900;
                    extraCharge = extraMinutes * 0.20;
                }
                else {
                    baseMinutes = minutesUsed;
                }
                break;

            case "Titanium":
                baseCharge = 160;
                baseMinutes = minutesUsed;
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        totalCharges = baseCharge + extraCharge;

        //Print bill description
        System.out.println();
        System.out.println("<<Bill description>>");
        System.out.println();
        System.out.println("Package: " + packageName);
        System.out.println();
        System.out.printf(baseMinutes + " minutes: RM%.2f%n", baseCharge);
        if (extraMinutes > 0) {
            System.out.printf(extraMinutes + " minutes: RM%.2f%n", extraCharge);
        }
        System.out.printf("Total charges: RM%.2f%n", totalCharges);

        scanner.close();
    }
}