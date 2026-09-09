import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature > 0) {
            System.out.println("Safe for outdoor activities ");
        } else {
            System.out.println("Too cold for outdoor activities ");
        }
        
        scanner.close();
    }
}
