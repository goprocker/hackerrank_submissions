# Recursion - Finding the Greatest Common Divisor in Ancient Math

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In the year 3000 BC, in the ancient city of Mesopotamia, mathematicians were discovering the wonders of numbers. Among their many studies, they found the need to simplify fractions, which led to the exploration of the Greatest Common Divisor (GCD). The GCD of two numbers is the largest positive integer that divides both numbers without leaving a remainder.

To help the young mathematicians master this concept, their wise teacher has assigned them a project to calculate the GCD of two positive integers using a recursive method. This task not only enhances their understanding of numbers but also builds their problem-solving skills.

Write a program that takes two positive integers as input and returns their GCD using recursion.

 **Input Format** 

The input consists of two positive integers, a and b.

 **Constraints** 

1≤a,b≤10^6

 **Output Format** 

Print the GCD of the two integers.

 **Sample Input 0** 

```
48 18

```

 **Sample Output 0** 

```
6

```

 **Explanation 0** 

The GCD of 48 and 18 is 6, as 6 is the largest number that divides both 48 and 18 without leaving a remainder.

 **Sample Input 1** 

```
56 98

```

 **Sample Output 1** 

```
14

```

 **Explanation 1** 

The GCD of 56 and 98 is 14, as 14 is the largest number that divides both 56 and 98 without leaving a remainder

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:53:10.561Z  

```java
import java.io.*;
import java.util.*;
public class Solution {
    static int gcd(int a,int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int a=sc.nextInt(), b=sc.nextInt(); System.out.print(gcd(a,b)); }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-finding-the-greatest-common-divisor-in-ancient-math/problem)