import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The program will prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water (°C): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water (°C): ");
        double finalTemperature = scanner.nextDouble();

        // It will then calculate energy required in Joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Finally it will display the result
        System.out.println("The energy required to heat the water is " + Q + " Joules.");
        
        scanner.close();
    }
}
