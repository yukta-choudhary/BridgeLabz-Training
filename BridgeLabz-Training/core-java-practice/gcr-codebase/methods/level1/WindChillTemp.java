// Calculate wind chill temperature

import java.util.Scanner;

public class WindChillTemp{

	//Create method

	public double calculateWindChill(double temperature, double windSpeed){
		double windChill;
		windChill = 35.74 + 0.6215 * temperature +  (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter temperature: ");
        double temperature = input.nextDouble();
		
		System.out.println("Enter windspeed: ");
        double windSpeed = input.nextDouble();
		
		//Create class object to call the method
		WindChillTemp windChillTemp = new WindChillTemp();
		
		//Call method
		double windChill = windChillTemp.calculateWindChill(temperature, windSpeed);

        //Display result		
		System.out.println("The wind chill temperature is " + windChill);
		
        //Close Scanner object
        input.close();

    }
}