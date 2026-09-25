# Recursion - Recursive String Length Calculator

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a digital document management system, each document is represented as a string. As part of the system's features, you need to determine the length of a string using a recursive approach. This feature is essential for efficient document analysis without relying on built-in methods.

Your task is to write a program that calculates the length of a given string using recursion.

 **Input Format** 

A single string S representing the content of the document.

 **Constraints** 

NA

 **Output Format** 

An integer representing the length of the string.

 **Sample Input 0** 

```
hello

```

 **Sample Output 0** 

```
5

```

 **Explanation 0** 

The string "hello" has 5 characters, so the output is 5.

 **Sample Input 1** 

```
recursion

```

 **Sample Output 1** 

```
9

```

 **Explanation 1** 

The string "recursion" has 9 characters, so the output is 9.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T08:31:42.760Z  

```java
import java.io.*;

public class Solution {
    
    static int len(String s, int i) {
        return i == s.length() ? 0 : 1 + len(s, i + 1);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s == null) {
            s = "";
        }
        
        System.out.print(len(s, 0));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-recursive-string-length-calculator/problem)