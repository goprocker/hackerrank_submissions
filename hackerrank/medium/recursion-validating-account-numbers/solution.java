import java.io.*;
public class Solution {
 static int digits(String s,int i){return i==s.length()?0:1+digits(s,i+1);}
 public static void main(String[] args)throws Exception{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));String s=br.readLine().trim();if(s.charAt(0)=='-'||s.charAt(0)=='+')s=s.substring(1);System.out.print(digits(s,0));}
}
