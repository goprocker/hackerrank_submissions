# Strings - Forbidden forest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Harry was moving through the forbidden forest. A spirit crossed his path and told him that he has to answer her question correctly or she would kill him. She told him to give her a reversed string such that each word is in its original position and the words which remain same after reversing should be enclosed within $. Harry being a wizard, has no knowledge of Muggle technology and asks for your help.

Help Harry in finding out the required string.

 **Input Format** 

Input string

 **Constraints** 

NA

 **Output Format** 

Return the reversed string

 **Sample Input 0** 

```
zebra bat ball

```

 **Sample Output 0** 

```
arbez tab llab

```

 **Explanation 0** 

In example 1, the word “zebra” when rotated gives “arbez” and so on.

 **Sample Input 1** 

```
aba

```

 **Sample Output 1** 

```
$aba$

```

 **Explanation 1** 

In example 2, the word “aba” is a palindrome and hence gives “”.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:29:24.639Z  

```java
import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String line=br.readLine(); if(line==null){return;}
  String[] w=line.trim().split("\\s+"); StringBuilder out=new StringBuilder();
  for(int i=0;i<w.length;i++){String r=new StringBuilder(w[i]).reverse().toString(); if(i>0)out.append(' '); if(w[i].equals(r))out.append('$').append(w[i]).append('$'); else out.append(r);}
  System.out.print(out);
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-forbidden-forest/problem)