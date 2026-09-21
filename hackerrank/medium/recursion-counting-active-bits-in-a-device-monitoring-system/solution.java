import java.io.*;
import java.util.*;
public class Solution {
    static int countSetBits(int number) { return number == 0 ? 0 : (number & 1) + countSetBits(number >>> 1); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(countSetBits(n)); }
}
