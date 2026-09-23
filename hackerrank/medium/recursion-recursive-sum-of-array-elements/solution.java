import java.util.*;
public class Solution {
 static long sum(long[] a,int n){return n==0?0:a[n-1]+sum(a,n-1);}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();long[] a=new long[n];for(int i=0;i<n;i++)a[i]=sc.nextLong();System.out.print(sum(a,n));}
}
