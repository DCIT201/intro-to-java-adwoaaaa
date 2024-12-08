import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        // Creating scanner object to take input from users
        Scanner scanner = new Scanner(System.in);

        // Displaying Instruction messages to the user.
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // variable to hold user's choice
        int choice = 0;

        // Looping util the user enters a valid choice.
        while (true){
            System.out.println("Enter your choice, 1 or 2: ");
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                
         //checking if the user's input is valid and breaking out of the loop if it is
                if (choice == 1  || choice == 2) { 
                    break;
                }     
            }

        //Error message for invalid input
            System.out.println("Invalid choice. Please enetr 1 or 2.");
            scanner.nextLine(); // Clear the input buffer
        }

        // Performing convertion from celcius to fahreinheit for choice 1
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = InputValidator.getValidTemperature(scanner); // Getting valid temperature from the user
            double fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        } else {

        // Performing convertion from fahreinheit to celcius for choice 2
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = InputValidator.getValidTemperature(scanner); // Getting valid temperature from the user
            double celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
            System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
        }

        // Closing message
        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();   
    }


     // Inner class to validate temperature input
    public static class InputValidator {
        // Method to get and validate temperature input from the user
        public static double getValidTemperature(Scanner scanner) {
            double temperature = 0.0; // Initialize temperature variable
            while (true) {
                if (scanner.hasNextDouble()) {
                    temperature = scanner.nextDouble();

                    //Extreme temperature handling
                    if (temperature < -273.15 || temperature > 1000) {
                        System.out.println("Invalid temperature! Please enter a temperature between -273.15°C and 1000°C.");
                    }else {
                        return temperature; // Return valid temperature
                    }
                } else {
                    // error message for invalid input
                    System.out.println("Invalid input! Please enter a number for the temperature.");
                    scanner.nextLine(); // Clear invalid input
                }
            }
        }
    }
}