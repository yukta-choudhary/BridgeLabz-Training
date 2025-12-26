import java.util.Scanner;

public class UnitConverterFahrenheitCelsius {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));
		
        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
		
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
		
        System.out.print("Enter kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));
		
        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
		
        System.out.print("Enter liters: ");
        double liters = input.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));
        input.close();
    }
}
