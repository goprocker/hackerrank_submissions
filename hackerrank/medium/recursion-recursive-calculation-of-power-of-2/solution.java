import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    
    // Recursive function to calculate 2^n
    static BigInteger calculatePowerOfTwo(int n) {
        // Base case: 2^0 is 1
        if (n == 0) {
            return BigInteger.ONE;
        }
        
        // Recursive step: 2 * (2^(n-1))
        return BigInteger.TWO.multiply(calculatePowerOfTwo(n - 1));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.print(calculatePowerOfTwo(n));
        }
        
        scanner.close();
    }
}
