# Strings - Caesar Cipher

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Caesar Cipher Encryption is done by replacing each letter with the letter at 3 positions to the left.

e.g. 'a' is replaced with 'x','b' with 'y',...,'d' with 'a' and so on.

Given a ciphertext encrypted with Caesar cipher as input string find the corresponding plaintext and return the plaintext as output strings.

 **Note** 

All the characters are in lower case for input and output strings.

 **Input Format** 

The ciphertext.

 **Constraints** 

NA

 **Output Format** 

Return the corresponding plaintext.

 **Sample Input 0** 

```
nrfzh

```

 **Sample Output 0** 

```
quick

```

 **Explanation 0** 

- Since encryption is done by replacing each letter with the letter at 3 positions to the left, therefore to decrypt, we need to find letters at 3 positions to the right.
- The alphabet at 3 positions to the right of 'n' is 'q'.
- Similarly, the alphabets at 3 positions to the right of 'r', 'f', 'z' and 'h' are 'u', 'i', 'c' and 'k' respectively.
- Therefore, "nrfzh" is decrypted as "quick".

 **Sample Input 1** 

```
phqgh

```

 **Sample Output 1** 

```
sktjk

```

 **Explanation 1** 

- Since encryption is done by replacing each letter with the letter at 3 positions to the left, therefore to decrypt we need to find letters at 3 positions to the right.
- The alphabet at 3 positions to the right of 'p' is 's'
- Similarly the alphabets at 3 positions to the right of 'h', 'q', 'g' and 'h' are 'k', 't', 'j' and 'k' respectively.
- Therefore, 'phqgh' is decrypted as 'sktjk'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:29:34.677Z  

```java
import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String s=br.readLine(); StringBuilder out=new StringBuilder();
  for(char c:s.trim().toCharArray()) out.append((char)('a'+(c-'a'+3)%26));
  System.out.print(out);
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-caesar-cipher/problem)