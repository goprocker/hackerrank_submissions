# Strings - Character Count

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string S of length N. Your friend wants to know the number of times his favorite letter C occurs in the string. Your task is to help your friend find and return an integer value representing the number of times a character occurs in a particular string.

 **Note** 

All the characters in the strings are in lowercase.

 **Input Format** 

- A string S
- An integer N, representing the length of string
- A character C

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the number of times a character occurs in a particular string

 **Sample Input 0** 

```
helloworld
10
l

```

 **Sample Output 0** 

```
3

```

 **Explanation 0** 

Here the given string is "helloworld" and the length of the string is 10 and the character whose count is to be found is "I". The number of times "I" occurs in the string is 3. Therefore, 3 is returned as the output.

 **Sample Input 1** 

```
mercermettl
11
t

```

 **Sample Output 1** 

```
2

```

 **Explanation 1** 

Here the given string is "mercermettl" and the length of the string is 11 and the AOS character whose count is to be found is "t". The number of times "t" occurs in the string is 2. Therefore, 2 is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T06:37:07.626Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read string S
        String s = scanner.next();
        
        // Read integer N (length of string)
        int n = scanner.nextInt();
        
        // Read character C
        char c = scanner.next().charAt(0);
        
        int count = 0;
        
        // Count occurrences of character c in string s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        
        // Print the final count
        System.out.println(count);
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-character-count/problem)