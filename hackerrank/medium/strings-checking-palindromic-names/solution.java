import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s=br.readLine(); if(s==null)s="";
  String r=new StringBuilder(s.trim()).reverse().toString();
  System.out.print(s.trim().equals(r)?1:0);
 }
}
