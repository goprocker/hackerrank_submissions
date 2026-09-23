import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String s=br.readLine(); StringBuilder out=new StringBuilder();
  for(char c:s.trim().toCharArray()) out.append((char)('a'+(c-'a'+3)%26));
  System.out.print(out);
 }
}
