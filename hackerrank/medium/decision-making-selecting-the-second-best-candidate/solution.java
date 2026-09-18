import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int[] scores = new int[3];
            scores[0] = scanner.nextInt();
            scores[1] = scanner.nextInt();
            scores[2] = scanner.nextInt();
            
            
            Arrays.sort(scores);
            
           
            System.out.println(scores[1]);
        }
        scanner.close();
    }
}
