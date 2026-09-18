# Strings - Lower Case Count

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Lewis is given a string S of length N. He likes lowercase letters more than the upper case letters and wants to find their count. Your task is to help him find and return a string representing the lowercase letters and the total count.

 **Input Format** 

- A string
- An integer representing the length of string

 **Constraints** 

NA

 **Output Format** 

Return a string representing the lowercase letters and the total count.

 **Sample Input 0** 

```
HelloWorld
10

```

 **Sample Output 0** 

```
elloorld 8

```

 **Sample Input 1** 

```
JavaProgramming
15

```

 **Sample Output 1** 

```
avarogramming 13

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T07:02:22.042Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        StringBuilder lowerCaseStr = new StringBuilder();
        int count = 0;
        for (int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowerCaseStr.append(ch);
                count++;
                
            }
        }
        System.out.println(lowerCaseStr.toString() + " " + count);
       scanner.close(); 
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-lower-case-count/problem)