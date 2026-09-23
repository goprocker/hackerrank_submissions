# Functions - Finding Divisible Sub-Numbers in a Transaction ID

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you work in a transaction processing system where each transaction is identified by a unique ID number. These transaction IDs are often used in audit processes to find patterns or checks, especially when verifying divisibility by certain values, such as 11. You are tasked with identifying all contiguous sub-transaction IDs (fragments) within a given transaction ID that are divisible by 11. These sub-transaction IDs represent various combinations of digits that could correspond to different parts of a larger transaction.

Your task is to implement a function that returns the count of contiguous integer fragments of a transaction ID that are divisible by 11. Each fragment is formed by considering consecutive digits in the transaction ID.

You are given an integer num, which represents a transaction ID. You need to count how many contiguous integer fragments of num are divisible by 11.

 **Function Signature** 

int divisibilityByEleven(int num);

 **Input Format** 

A positive integer num representing a transaction ID (1 ≤ num ≤ 10^9).

 **Constraints** 

NA

 **Output Format** 

Returns the number of contiguous integer fragments of num that are divisible by 11.

 **Sample Input 0** 

```
1215598

```

 **Sample Output 0** 

```
4

```

 **Explanation 0** 

The fragments divisible by 11 are:

- 55, 121, 12155, 15598 Thus, there are 4 such fragments.

 **Sample Input 1** 

```
55

```

 **Sample Output 1** 

```
1

```

 **Explanation 1** 

The integer fragments of 55 are:

- 5, 5, 55

Only the fragment 55 is divisible by 11. Thus, the output is 1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:31:36.518Z  

```java
import java.io.*;
public class Solution {
 public static void main(String[] args)throws Exception{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));String s=br.readLine().trim();long count=0;for(int i=0;i<s.length();i++){int rem=0;for(int j=i;j<s.length();j++){rem=(rem*10+s.charAt(j)-'0')%11;if(rem==0)count++;}}System.out.print(count);}
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-finding-divisible-sub-numbers-in-a-transaction-id/problem)