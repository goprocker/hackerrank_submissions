# Strings - Data Compression for Server Log Optimization

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a large IT company, server logs are generated continuously. To save storage space, these logs need to be compressed efficiently. One common method is to replace multiple consecutive occurrences of the same character with a single occurrence. Additionally, since logs are often analyzed in reverse chronological order, the compressed logs must be presented in reverse order.

Your task is to write a program that takes a server log string, compresses it by removing consecutive duplicates, and then outputs the compressed string in reverse order.

 **Input Format** 

A string S representing the server log, with a maximum length of 50 characters.

 **Constraints** 

NA

 **Output Format** 

Print the compressed string in reverse order.

 **Sample Input 0** 

```
aaabbccddeffggg

```

 **Sample Output 0** 

```
gfedcba

```

 **Explanation 0** 

- The input string aaabbccddeffggg is first compressed to abcdefg by replacing multiple consecutive occurrences of each character with a single occurrence.
- The compressed string is then reversed to give gfedcba.

 **Sample Input 1** 

```
xxxyyyzzzppqqqrrrss

```

 **Sample Output 1** 

```
srqpzyx

```

 **Explanation 1** 

- The input string xxxyyyzzzppqqqrrrss is first compressed to sqrpzyx.
- The compressed string is then reversed to give srqpzyx.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T09:09:26.894Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.next();
            StringBuilder compressed = new StringBuilder();
            
            if (s.length() > 0) {
                compressed.append(s.charAt(0));
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) != s.charAt(i - 1)) {
                        compressed.append(s.charAt(i));
                    }
                }
            }
            System.out.println(compressed.reverse().toString());
        }
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-data-compression-for-server-log-optimization/problem)