# Strings - Encode the message

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a secret agent on a mission, and need to decode various messages using the ASCII values of characters. Due to resource constraints, you can send only those messages with a total ASCII sum equal to or less than a specified threshold N. You need to remove characters from the end of the string to maintain the sum accordingly. Your task is to find and return the decoded string, or return an empty string, if it is not possible to meet the condition.

 **Input Format** 

- A string value S, representing the encoded message
- An integer value N, representing the threshold value

 **Constraints** 

NA

 **Output Format** 

Return a string value representing the decoded string, or an empty string if it is not possible to meet the condition.

 **Sample Input 0** 

```
AlohoMora
584

```

 **Sample Output 0** 

```
AlohoM

```

 **Explanation 0** 

- Here, the given string is “AlohoMora”. The ASCII sum of the characters is 65 + 108 + 111 + 104 + 111 + 77 + 111 + 114 + 97 = 898. Now we will remove the characters in the following manner.
- We will first remove the character ‘a’ and the sum will become 898 -97 = 801.
- Next we will remove the character ‘r’ and the sum will become 801 – 114 = 687.
- Then we will remove the character ‘o’ and the sum will become 687 – 111 = 576, which is less than 584.
- Therefore, AlohoM is returned as the output.

 **Sample Input 1** 

```
CleVer
221

```

 **Sample Output 1** 

```
Cl

```

 **Explanation 1** 

- Here the given string is “CleVer”, the ASCII sum of all the character is 67 + 108 + 101 + 86 + 101 + 114 = 577. Now we will remove the characters in the following manner.
- We will first remove the character ‘r’, and the sum will become 577 – 114 = 463.
- Next we will remove the character ‘e’ and the sum will become 463 – 101 = 362.
- Next we will remove the character ‘V’ and the sum will become 362 – 86 = 276
- Then we will remove the character ‘e’ and the sum will become 276 – 101 = 175, which is less than 221.
- Therefore, Cl is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T09:34:40.806Z  

```java
import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String s=br.readLine(); long n=Long.parseLong(br.readLine().trim()),sum=0;
  for(char c:s.toCharArray())sum+=c; int end=s.length(); while(end>0&&sum>n)sum-=s.charAt(--end); System.out.print(s.substring(0,end));
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-encode-the-message/problem)