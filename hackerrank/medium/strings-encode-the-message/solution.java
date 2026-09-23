import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String s=br.readLine(); long n=Long.parseLong(br.readLine().trim()),sum=0;
  for(char c:s.toCharArray())sum+=c; int end=s.length(); while(end>0&&sum>n)sum-=s.charAt(--end); System.out.print(s.substring(0,end));
 }
}
