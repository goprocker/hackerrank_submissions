import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String line=br.readLine(); if(line==null){return;}
  String[] w=line.trim().split("\\s+"); StringBuilder out=new StringBuilder();
  for(int i=0;i<w.length;i++){String r=new StringBuilder(w[i]).reverse().toString(); if(i>0)out.append(' '); if(w[i].equals(r))out.append('$').append(w[i]).append('$'); else out.append(r);}
  System.out.print(out);
 }
}
