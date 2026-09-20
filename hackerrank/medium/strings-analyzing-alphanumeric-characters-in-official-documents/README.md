# Strings - Analyzing Alphanumeric Characters in Official Documents

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you're working as a software developer for a company that specializes in document management systems. One of the features requested by the clients is a tool to analyze official documents and reports. The tool should be able to count and display the total number of alphanumeric characters in a given document. This is especially useful for formatting and readability analysis or even to ensure compliance with character count limitations set by regulatory bodies.

Your task is to write a program that reads a string (representing the document content) and counts the total number of alphanumeric characters in it, including both letters and numbers. The system should handle the input efficiently and return meaningful results for content analysis.

 **Problem Statement** 

Write a program that takes a string as input and counts the total number of alphanumeric characters present in the string. If the input string is empty, return -1. Multiple occurrences of each alphanumeric character should be counted separately.

 **Input Format** 

The input consists of a single string str.

 **Constraints** 

NA

 **Output Format** 

- Output a single integer representing the total count of alphanumeric characters.
- If the input string is empty, output -1.

 **Sample Input 0** 

```
Ram scored 91.62% in class 12 Board Exams.

```

 **Sample Output 0** 

```
32

```

 **Explanation 0** 

- Total alphabetic characters: 26
- Total numeric characters: 6
- Total alphanumeric characters: 26 + 6 = 32

 **Sample Input 1** 

```
Happy New Year 2016!!

```

 **Sample Output 1** 

```
16

```

 **Explanation 1** 

- Total alphabetic characters: 14
- Total numeric characters: 2
- Total alphanumeric characters: 14 + 2 = 16

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T15:47:51.340Z  

```java
import java.io.*;
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    if(s==null||s.isEmpty()){System.out.println(-1);return;}
    int count=0;
    for(char ch:s.toCharArray()) if(Character.isLetterOrDigit(ch)) count++;
    System.out.println(count);
  }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-analyzing-alphanumeric-characters-in-official-documents/problem)