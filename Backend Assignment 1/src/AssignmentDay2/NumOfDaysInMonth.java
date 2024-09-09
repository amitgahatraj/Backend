package AssignmentDay2;

import java.util.Scanner;

public class NumOfDaysInMonth {
    public static void main(String[] args) {
        numOfDaysInMonth();
    }
    public static void numOfDaysInMonth(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days;

        // If-else block to determine the number of days in the month
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
            System.out.println("Number of days: " + days);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
            System.out.println("Number of days: " + days);
        } else if (month == 2) {
            // Check for leap year in case of February
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
                System.out.println("February (Leap Year) has " + days + " days.");
            } else {
                days = 28;
                System.out.println("February has " + days + " days.");
            }
        } else {
            // Invalid month input
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
    }

