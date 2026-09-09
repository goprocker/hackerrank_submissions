import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int h = scanner.nextInt();
        
        double litre = (3.14 * r * r * h);
        
        long D = Math.round(litre);
        
        System.out.println(D);
        scanner.close();
    }
}
