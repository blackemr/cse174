/* Name: Matthew Blackert
 * Date: September 20th, 2018
 * Filename: Lab4.java
 * Description: This program generates a number (1 or 2) and then the user inputs a temperature
 * that gets converted.
 */
import java.util.Scanner; // Reads user input
public class Lab4 {
  // This generates a random number (1 or 2) and then allows the user to input a temperature.
  public static void main(String[] args) {
    // Setting up a scanner to read the temperature
    Scanner keyBoard = new Scanner(System.in);
    // Generates either 1 or 2
    int randomConversion = 1 + (int)(Math.random() * 2);
    // Store the variables
    double temperature;
    // If logic for if it is 1 or 2
    if(randomConversion == 1) {
      System.out.println("Random Number 1: Farenheit to Celsius Conversion:");
      System.out.print("Enter temperature in Fahrenheit:");
      temperature = keyBoard.nextDouble();
      double celsiusTemperature = (temperature - 32) * .5556;
      System.out.printf("%.3f Celsius = %.3f Fahrenheit \n", celsiusTemperature, temperature);
      // Returns state of water
      if(celsiusTemperature <= 0) {
        System.out.println("*** Water is Solid");
      } else if(celsiusTemperature >= 100) {
        System.out.println("*** Water is Gas");
      } else if(0 < celsiusTemperature && celsiusTemperature < 100) {
        System.out.println("*** Water is Liquid");
      } else {
        System.out.println("*** Error");
      }
    } else {
      System.out.println("Random Number 2: Celsius to Farenheit Conversion:");
      System.out.print("Enter temperature in Celsius:");
      temperature = keyBoard.nextDouble();
      double farenheitTemperature = temperature * 1.8 + 32;
      System.out.printf("%.3f Fahrenheit = %.3f Celsius \n", farenheitTemperature, temperature);
      // Returns state of water
      if(temperature <= 0) {
        System.out.println("*** Water is Solid");
      } else if(temperature >= 100) {
        System.out.println("*** Water is Gas");
      } else if(0 < temperature && temperature < 100) {
        System.out.println("*** Water is Liquid");
      } else {
        System.out.println("*** Error");
      }
    }
  }
}