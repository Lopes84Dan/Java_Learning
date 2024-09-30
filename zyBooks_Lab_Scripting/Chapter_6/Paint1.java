import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallon = 350.0;

        // Validate wall height
        boolean validInput = false;
        do {
            try {
                System.out.print("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    System.out.println("Error: Height must be a positive number.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scnr.next(); // Clear input
            }
        } while (!validInput);

        // Validate wall width
        validInput = false;
        do {
            try {
                System.out.print("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                    System.out.println("Error: Width must be a positive number.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scnr.next(); // Clear input
            }
        } while (!validInput);

        // Calculate wall area and output
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate the amount of paint (in gallons) needed to paint the wall and output
        gallonsPaintNeeded = wallArea / squareFeetPerGallon;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Close the scanner
        scnr.close();
    }
}
