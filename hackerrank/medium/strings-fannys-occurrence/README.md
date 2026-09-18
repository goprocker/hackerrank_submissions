# Strings - Fannys occurrence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Fanny is given a string along with the string which contains single character x. She has to remove the character x from the given string. Help her write a function to remove all occurrences of x character from the given string.

 **Input Format** 

- Input string s
- String containing any character x

 **Constraints** 

NA

 **Output Format** 

String without the occurrence of character x

 **Sample Input 0** 

```
welcome to mettl
l

```

 **Sample Output 0** 

```
wecome to mett

```

 **Explanation 0** 

As l is the character which is required to be removed, therefore all the occurrences of l are removed, keeping all other characters.

 **Sample Input 1** 

```
Lord out of Rings
o

```

 **Sample Output 1** 

```
Lrd ut f Rings

```

 **Explanation 1** 

As o is the character which is required to be removed, therefore all the occurrences of o are removed, keeping all other characters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T08:08:18.339Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        String xStr = scanner.nextLine();
        char x = xStr.charAt(0);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != x) {
                result.append(ch);
            }
        }
        
        System.out.println(result.toString());
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-fannys-occurrence/problem)