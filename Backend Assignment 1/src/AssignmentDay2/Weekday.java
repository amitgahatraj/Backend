package AssignmentDay2;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        isWeekday();
    }
    public static void isWeekday(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to represent the day of the week: ");
        int day = sc.nextInt();

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}
