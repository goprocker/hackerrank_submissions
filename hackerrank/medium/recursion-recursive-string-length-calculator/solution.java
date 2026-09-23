import java.io.*;
public class Solution {
 static int len(String s,int i){return i==s.length()?0:1+len(s,i+1);}
 public static void main(String[] args)throws Exception{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));String s=br.readLine();if(s==null)s="";System.out.print(len(s,0));}
}
