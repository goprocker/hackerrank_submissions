import java.io.*;
import java.util.*;
public class Solution {
    static int max(int[] a,int i) { return i == a.length-1 ? a[i] : Math.max(a[i], max(a,i+1)); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] a=new int[n]; for(int i=0;i<n;i++) a[i]=sc.nextInt(); System.out.print(max(a,0)); }
}
