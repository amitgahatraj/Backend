package AssignmentDay2;

import java.util.Scanner;

public class CelsusToFahrenheit {
    public static void main(String[] args) {
        isCelsiusToFahrenheit();
    }
    public static void isCelsiusToFahrenheit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        if (celsius >= -273.15) {
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid temperature! The temperature cannot be below absolute zero (-273.15°C).");
        }
        sc.close();
    }
}
