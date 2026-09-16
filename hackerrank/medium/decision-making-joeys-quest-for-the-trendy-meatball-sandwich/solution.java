import java.io.*;
import java.util.*;

public class TrendyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Check if the number is a 3-digit number (between 100 and 999)
            if (n >= 100 && n <= 999) {
                // Extract the middle digit
                int middleDigit = (n / 10) % 10;
                
                // Check if the middle digit is divisible by 3
                if (middleDigit % 3 == 0) {
                    System.out.println("Trendy Number");
                } else {
                    System.out.println("Not a Trendy Number");
                }
            } else {
                System.out.println("Invalid Number");
            }
        }
        
        scanner.close();
    }
}
