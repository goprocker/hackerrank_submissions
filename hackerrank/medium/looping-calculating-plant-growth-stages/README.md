# Looping - Calculating Plant Growth Stages

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A biologist is studying the growth patterns of a rare plant species, which follows a unique pattern similar to the Fibonacci sequence. The plant's growth stages, in terms of the number of branches, can be predicted using this sequence: 0, 1, 1, 2, 3, 5, 8, 13, and so on. Given the number of months, the biologist wants to know how many branches the plant will have.

Your task is to write a program that, given the number of months N, computes the number of branches the plant will have using the Fibonacci sequence. The biologist needs this information to understand the plant's future growth and to plan the necessary resources.

 **Input Format** 

An integer N representing the number of months.

 **Constraints** 

NA

 **Output Format** 

Print the number of branches as an integer.

 **Sample Input 0** 

```
6

```

 **Sample Output 0** 

```
0 1 1 2 3 5 8

```

 **Explanation 0** 

- The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8...
- The 6th term in the Fibonacci sequence is 8, so after 6 months, the plant will have 8 branches.

 **Sample Input 1** 

```
9

```

 **Sample Output 1** 

```
0 1 1 2 3 5 8 13 21 34

```

 **Explanation 1** 

- The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
- The 9th term in the Fibonacci sequence is 34, so after 9 months, the plant will have 34 branches

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T15:42:20.268Z  

```java
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i > 0) result.append(" ");
            result.append(a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        System.out.println(result);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-calculating-plant-growth-stages/problem)