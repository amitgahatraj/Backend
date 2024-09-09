package AssignmentDay2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        isCelsiusToFahrenheit();
    }
    public static void isCelsiusToFahrenheit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;


        if (fahrenheit >= -459) { // absolute zero
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid temperature! The temperature cannot be below absolute zero (-459°F).");
        }
        sc.close();
    }
}
