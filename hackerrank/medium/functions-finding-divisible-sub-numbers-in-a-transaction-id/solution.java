import java.io.*;
public class Solution {
 public static void main(String[] args)throws Exception{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));String s=br.readLine().trim();long count=0;for(int i=0;i<s.length();i++){int rem=0;for(int j=i;j<s.length();j++){rem=(rem*10+s.charAt(j)-'0')%11;if(rem==0)count++;}}System.out.print(count);}
}
