import java.io.*;
import java.util.*;
public class Solution {
    static int gcd(int a,int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int a=sc.nextInt(), b=sc.nextInt(); System.out.print(gcd(a,b)); }
}
