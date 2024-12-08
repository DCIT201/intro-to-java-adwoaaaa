import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;

        while (true){
            System.out.println("Enter your choice, 1 or 2: ");
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                if (choice == 1  || choice == 2) { 
                    break;
                }     
            }
            System.out.println("Invalid choice. Please enetr 1 or 2.");
            scanner.nextLine();

        }
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = InputValidator.getValidTemperature(scanner); // Getting valid temperature from the user
            double fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        } else {

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = InputValidator.getValidTemperature(scanner); // Getting valid temperature from the user
            double celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
            System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
        }
            // Closing message
        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();   
    }
}