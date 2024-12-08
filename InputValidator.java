import java.util.Scanner;

public class InputValidator {
    public static double getValidTemperature(Scanner scanner) {
        double temperature = 0.0;
        while (true) {
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                return temperature; // Return valid temperature
            } else {
                System.out.println("Invalid input! Please enter a number for the temperature.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}
