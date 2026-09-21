import java.io.*;
import java.util.*;
public class Solution {
    static long fib(int n) { return n <= 1 ? n : fib(n - 1) + fib(n - 2); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(fib(n)); }
}
