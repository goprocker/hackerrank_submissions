# Recursion - Validating Account Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A banking application requires users to enter their account numbers for authentication. The system needs to validate the length of the entered account number. If the user provides an incorrect number of digits, the system should prompt the user to try again. The application uses recursion to count the number of digits in the entered account number. By recursively counting each digit, the application ensures the correct length for valid account numbers.

 **Input Format** 

A positive integer n.

 **Constraints** 

NA

 **Output Format** 

The number of digits in the number.

 **Sample Input 0** 

```
12345

```

 **Sample Output 0** 

```
5

```

 **Sample Input 1** 

```
9

```

 **Sample Output 1** 

```
1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:33:03.169Z  

```java
import java.io.*;
public class Solution {
 static int digits(String s,int i){return i==s.length()?0:1+digits(s,i+1);}
 public static void main(String[] args)throws Exception{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));String s=br.readLine().trim();if(s.charAt(0)=='-'||s.charAt(0)=='+')s=s.substring(1);System.out.print(digits(s,0));}
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-validating-account-numbers/problem)