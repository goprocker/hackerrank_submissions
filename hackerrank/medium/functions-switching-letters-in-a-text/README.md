# Functions - Switching Letters in a Text

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string representing a name of a product, and you need to perform a modification based on customer feedback. Some customers have complained that two characters in the product name are often confusing and they want the characters swapped. You are tasked with writing a function that swaps two characters in the product name wherever they occur.

 **Function Description** 

String replaceCharacter(String str, int n, char ch1, char ch2)

The function accepts three arguments:

- str[]: A string str of length n containing only lowercase alphabets.
- n: The length of the string str[].
- ch1: The character to be replaced by ch2.
- ch2: The character to be replaced by ch1.

The function modifies the string in place by swapping every occurrence of ch1 with ch2 and vice versa.

 **Note** 

If the string is empty, return null (None, in case of Python). If both characters ch1 and ch2 do not exist in the string or are the same, return the original string unchanged.

 **Input Format** 

- A string str[] of lowercase alphabetical letters.
- Two characters ch1 and ch2.

 **Constraints** 

NA

 **Output Format** 

The modified string with ch1 and ch2 swapped wherever they occur.

 **Sample Input 0** 

```
apples
a
p

```

 **Sample Output 0** 

```
paales

```

 **Explanation 0** 

In the string "apples", every occurrence of 'a' is replaced with 'p', and every occurrence of 'p' is replaced with 'a', resulting in "paales".

 **Sample Input 1** 

```
bluecoloure
l
o

```

 **Sample Output 1** 

```
boueclolure

```

 **Explanation 1** 

In the string "bluecoloure", the character 'l' is replaced with 'o', and the character 'o' is replaced with 'l', resulting in "boueClolure".

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:35:18.922Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static String replaceCharacter(String str, int n, char ch1, char ch2) {
        if (str == null || str.length() == 0) return null;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch1) chars[i] = ch2;
            else if (chars[i] == ch2) chars[i] = ch1;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.hasNext() ? sc.next() : "";
        char ch1 = sc.hasNext() ? sc.next().charAt(0) : '\0';
        char ch2 = sc.hasNext() ? sc.next().charAt(0) : '\0';
        String ans = replaceCharacter(str, str.length(), ch1, ch2);
        if (ans != null) System.out.print(ans);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-switching-letters-in-a-text/problem)