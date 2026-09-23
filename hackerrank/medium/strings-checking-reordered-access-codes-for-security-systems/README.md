# Strings - Checking Reordered Access Codes for Security Systems

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are developing a security system for a company that requires access codes for employees to unlock various secure locations. For security purposes, access codes are jumbled up but should contain the same characters in any order.

When employees input their access code, the system must verify if it matches the stored access code (ignoring order). Write a program that will check if two access codes, when rearranged, can match each other.

This program will help you develop an understanding of string manipulations and validation in a security context.

Write a program that:

- Takes two strings as input: accessCodeInput (entered by the employee) and storedAccessCode (the original code).
- Checks if the characters in accessCodeInput can be rearranged to match storedAccessCode.
- Outputs "yes" if the codes can be rearranged to match, otherwise outputs "no".

 **Input Format** 

- accessCodeInput: A string representing the access code entered by the employee.
- storedAccessCode: A string representing the stored access code.

 **Constraints** 

NA

 **Output Format** 

A single line with either "yes" or "no" based on whether the rearrangement is possible.

 **Sample Input 0** 

```
zbk
zkb

```

 **Sample Output 0** 

```
yes

```

 **Explanation 0** 

You can rearrange zbk ti be zkb (by switching the k and the b). Hence the output is “Yes”.

 **Sample Input 1** 

```
Mettl
Coding

```

 **Sample Output 1** 

```
no

```

 **Explanation 1** 

As “Mettl” cannot be formed from rearranging “Coding”. Hence the output is “No”

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:29:14.149Z  

```java
import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String a=br.readLine(), b=br.readLine();
  if(a==null||b==null||a.length()!=b.length()){System.out.print("no");return;}
  char[] x=a.toCharArray(), y=b.toCharArray(); Arrays.sort(x); Arrays.sort(y);
  System.out.print(Arrays.equals(x,y)?"yes":"no");
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-checking-reordered-access-codes-for-security-systems/problem)