import java.io.*; 
import java.util.*; 

public class Solution { 
    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in); 
        
        if (scanner.hasNext()) { 
            String input = scanner.next(); 
            char ch = input.charAt(0); 
            
            if (Character.isLetter(ch)) { 
                char lowerCh = Character.toLowerCase(ch); 
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') { 
                    System.out.println("Vowel"); 
                } else { 
                    System.out.println("Consonant"); 
                } 
            } else { 
                System.out.println("Not an alphabet"); 
            } 
        } 
        scanner.close(); 
    } 
}
