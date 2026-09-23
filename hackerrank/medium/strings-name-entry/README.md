# Strings - Name Entry

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Your friend has made entry of a name in the form first name F and last name L in your contact list. But some letters are in uppercase while others are in lowercase Your task is to find and return a string representing the names such that the first name of your contact is in lowercase, and the last name of your contact is in uppercase.

 **Input Format** 

- A string F, representing the first name.
- A string L, representing the last name.

 **Constraints** 

NA

 **Output Format** 

Return a string representing the names such that the first name of your contact is in lowercase, and the last name of your contact is in uppercase.

 **Sample Input 0** 

```
Lily
Johnson

```

 **Sample Output 0** 

```
lily JOHNSON

```

 **Explanation 0** 

Here the First Name is "Lily" and Last Name is "Johnson". On converting first name in lower case we get "lily" and on converting last name in uppercase we get "JOHNSON". Therefore, "lily JOHNSON" is returned as the output.

 **Sample Input 1** 

```
ADAM
clarke

```

 **Sample Output 1** 

```
adam CLARKE

```

 **Explanation 1** 

Here the First Name is "ADAM" and Last Name is "clarke". On converting first name in lower case we get "adam" and on converting last name in uppercase we get "CLARKE". Therefore, "adam CLARKE" is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:30:59.112Z  

```java
import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); String f=br.readLine(),l=br.readLine(); System.out.print(f.toLowerCase(Locale.ROOT)+" "+l.toUpperCase(Locale.ROOT));
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-name-entry/problem)