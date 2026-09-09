import java.io.*; 
import java.util.*; 

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 
    
        int product = X * Y; 
        
        int ans = product % 12;
        if (ans == 0) {
            ans = 12;
        }
        
        System.out.println(ans); 
        
        scanner.close(); 
    } 
}
