import java.io.*;
import java.util.*;
public class Solution {
    static long sum(int n) { return n <= 0 ? 0 : n + sum(n - 1); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(sum(n)); }
}
