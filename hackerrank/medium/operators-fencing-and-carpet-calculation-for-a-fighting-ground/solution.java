import java.io.*;
import java.util.*;


public class FightingGround {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        int perimeter = 2 * (length + breadth);
        int area = length * breadth;

        
        System.out.println("The required length is " + perimeter + " m");
        System.out.println("The required area of carpet is " + area + " sqm");

        scanner.close();
    }
}
