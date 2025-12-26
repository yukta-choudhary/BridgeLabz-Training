// This program calculates volume of earth  in km^3 and miles^3

public class CalculateEarthVolume{
    public static void main(String[] args){
	
        final double PI = 3.14;

        // Create radiusEarth, volumeInKm and volumeInMiles
        int radiusEarth = 6378;
        double volumeInKm, volumeInMiles;

        // Calculate volumeInKm and volumeInMiles
        // 1 Km^3 = 0.24 miles^3
        volumeInKm = 4*PI*(double)(radiusEarth*radiusEarth*radiusEarth)/(double)3;
	volumeInMiles = volumeInKm * 0.24;

        // Print volumeInKm and volumeInMiles
        System.out.println(" The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
    }
}