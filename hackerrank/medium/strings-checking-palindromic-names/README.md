# Strings - Checking Palindromic Names

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a security firm, a system was developed to check if names on employee badges appear the same when reflected in a mirror. The company wants to ensure that certain employee names read the same forwards and backwards, as this symmetric property enhances security by allowing names to be recognized even if seen in a mirror. Your task is to write a program that checks if a given name is a palindrome. If it is a palindrome, return 1; otherwise, return 0.

 **Problem Statement** 

Write a program that reads a name (or any single word) and checks if it’s a palindrome. If it is a palindrome, the output should be 1; if not, the output should be 0.

 **Note** 

A string is said to be a palindrome if the reverse of the string is the same as string. For example, “abba” is a palindrome, but “abbc” is not a palindrome.

 **Input Format** 

Input consists of a single string representing the employee's name.

 **Constraints** 

NA

 **Output Format** 

Output 1 if the name is a palindrome, and 0 otherwise.

 **Sample Input 0** 

```
level

```

 **Sample Output 0** 

```
1

```

 **Explanation 0** 

The reverse of string “level” is “level”. As they are the same hence the string is a palindrome.

 **Sample Input 1** 

```
abcd

```

 **Sample Output 1** 

```
0

```

 **Explanation 1** 

The reverse of string “abcd” is “dcba”. As they are not the same hence the string is not a palindrome.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:28:50.684Z  

```java
import java.io.*;
public class Solution {
 public static void main(String[] args) throws Exception {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s=br.readLine(); if(s==null)s="";
  String r=new StringBuilder(s.trim()).reverse().toString();
  System.out.print(s.trim().equals(r)?1:0);
 }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-checking-palindromic-names/problem)