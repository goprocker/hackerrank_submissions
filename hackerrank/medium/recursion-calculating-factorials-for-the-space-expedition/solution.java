import java.io.*;
import java.util.*;
public class Solution {
    static long factorial(int n) { return n <= 1 ? 1 : n * factorial(n - 1); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(factorial(n)); }
}
