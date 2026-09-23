import java.util.*;
public class Solution {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);long n=sc.nextLong();StringBuilder s=new StringBuilder();while(n>0){n--;s.append((char)('A'+n%26));n/=26;}System.out.print(s.reverse());}
}
