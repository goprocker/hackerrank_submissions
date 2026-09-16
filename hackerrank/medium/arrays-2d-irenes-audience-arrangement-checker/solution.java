import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // i > j represents elements below the main diagonal
                if(i > j && a[i][j] != 0) {
                    System.out.println("Not an Upper triangular matrix");
                    return;
                }
            }
        }
        System.out.println("Upper triangular matrix");
    }
}
