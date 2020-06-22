import java.util.Scanner;   // For the Scanner class

/**
  This program will ask the user for a temperature(F) and
  a wind speed(mph) and return the wind chill.
*/
public class WindChill
{
  public static void main(String[] args)
  {
    // Create Scanner variable
    Scanner keyboard = new Scanner(System.in);

    // Declare variables to store temp, wind, and wind chill values
    double temp;
    double wind;
    double wind_chill;

    // Display Top Banner
    System.out.println("******************************************");
    System.out.println("WIND CHILL CALCULATOR");
    System.out.println("******************************************");

    // Prompt user for a temp (deg F)
    System.out.println("\nPlease enter the temperature in Fahrenheit ");
    System.out.print("(The value must be between -45 and 40): ");
    temp = keyboard.nextDouble();

    // Prompt user for a wind speed (mph)
    System.out.println("\nPlease enter the wind speed in mph ");
    System.out.print("(must be between 5 and 60): ");
    wind = keyboard.nextDouble();

    // Calculate the wind chill
    wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) +
                0.4275 * temp * Math.pow(wind, 0.16);

    // Display wind chill
    System.out.println("\nThe wind chill is " + wind_chill);
    System.out.println("degrees Fahrenheit.");

    // Close Scanner
    keyboard.close();

    // Display Programmer name
    System.out.println("\n\n******************************************");
    System.out.println("Programmed by Michael Dolan III");
    System.out.println("******************************************");

  }
}
