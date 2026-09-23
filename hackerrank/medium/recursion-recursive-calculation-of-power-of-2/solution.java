import java.util.*;
import java.math.*;
public class Solution {
 static BigInteger pow(int n){return n==0?BigInteger.ONE:BigInteger.TWO.multiply(pow(n-1));}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);System.out.print(pow(sc.nextInt()));}
}
