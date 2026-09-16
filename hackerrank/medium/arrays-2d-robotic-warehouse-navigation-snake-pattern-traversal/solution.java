import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            // Even rows (0, 2, 4...) go left to right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    result.append(matrix[i][j]).append(" ");
                }
            } 
            // Odd rows (1, 3, 5...) go right to left
            else {
                for (int j = n - 1; j >= 0; j--) {
                    result.append(matrix[i][j]).append(" ");
                }
            }
        }
        
        // Print the final result trimming the trailing space
        System.out.println(result.toString().trim());
        scanner.close();
    }
}
