import java.io.*;
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    if(s==null||s.isEmpty()){System.out.println(-1);return;}
    int count=0;
    for(char ch:s.toCharArray()) if(Character.isLetterOrDigit(ch)) count++;
    System.out.println(count);
  }
}
