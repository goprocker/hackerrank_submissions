# Recursion - Recursive Calculation of Power of 2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a software development project, the system needs to calculate powers of 2 recursively for an application that performs bitwise operations. Your task is to write a program that calculates the power of 2 raised to an integer n (i.e., 2^n) using recursion. This functionality will be integrated into the system to handle mathematical operations dynamically.

 **Input Format** 

A single integer n representing the exponent.

 **Constraints** 

NA

 **Output Format** 

A single integer representing the value of 2^n.

 **Sample Input 0** 

```
3

```

 **Sample Output 0** 

```
8

```

 **Explanation 0** 

The value of 2^3=8.

 **Sample Input 1** 

```
5

```

 **Sample Output 1** 

```
32

```

 **Explanation 1** 

The value of 2^5=32.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:32:44.528Z  

```java
import java.util.*;
import java.math.*;
public class Solution {
 static BigInteger pow(int n){return n==0?BigInteger.ONE:BigInteger.TWO.multiply(pow(n-1));}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);System.out.print(pow(sc.nextInt()));}
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-recursive-calculation-of-power-of-2/problem)