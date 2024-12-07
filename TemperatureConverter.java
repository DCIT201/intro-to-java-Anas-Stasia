import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        // Display menu options
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;

        // Validate menu option input
        while (!validInput) {
            try {
                System.out.print("Enter your choice (1 or 2): ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            }
        }

        // Prompt user for temperature input
        double temperature = 0.0;
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the temperature: ");
                temperature = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Perform conversion based on choice
        if (choice == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, fahrenheit);
        } else {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, celsius);
        }

        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
