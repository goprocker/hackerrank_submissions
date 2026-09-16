import java.io.*;
import java.util.*;

public class NearestLeapYear {
    // Helper method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to find the next nearest leap year
    public static int getNextLeapYear(int n) {
        int currentYear = n;
        while (true) {
            if (isLeapYear(currentYear)) {
                return currentYear;
            }
            currentYear++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int result = getNextLeapYear(n);
            System.out.println(result);
        }
        
        scanner.close();
    }
}
