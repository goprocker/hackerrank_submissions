import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String a=br.readLine(), b=br.readLine();
  if(a==null||b==null||a.length()!=b.length()){System.out.print("no");return;}
  char[] x=a.toCharArray(), y=b.toCharArray(); Arrays.sort(x); Arrays.sort(y);
  System.out.print(Arrays.equals(x,y)?"yes":"no");
 }
}
