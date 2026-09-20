import java.io.*;
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    if(s==null||s.trim().isEmpty()){System.out.println(0);return;}
    int hard=0,easy=0;
    for(String w:s.trim().split("\\s+")){
      int v=0,c=0,run=0; boolean three=false;
      for(char ch:w.toCharArray()){
        if("aeiou".indexOf(ch)>=0){v++;run=0;} else {c++;run++;if(run>=3)three=true;}
      }
      if(c>v||three)hard++; else easy++;
    }
    System.out.println(5*hard-2*easy);
  }
}
