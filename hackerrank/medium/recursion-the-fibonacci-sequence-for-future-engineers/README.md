# Recursion - The Fibonacci Sequence for Future Engineers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In the year 2150, a group of engineering students at the Galactic Institute of Technology is studying algorithms and their applications in computational design. As part of their curriculum, they are learning about recursive functions and their power in solving complex problems.

To enhance their understanding, the instructor has assigned a project where students must calculate Fibonacci numbers using recursion. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The task is to write a program that computes the n-th Fibonacci number using a recursive approach.

Write a program that takes a non-negative integer nnn as input and returns the n-th Fibonacci number using recursion.

 **Input Format** 

The input consists of a single non-negative integer n.

 **Constraints** 

0≤n≤30

 **Output Format** 

Print the n-th Fibonacci number.

 **Sample Input 0** 

```
5

```

 **Sample Output 0** 

```
5

```

 **Explanation 0** 

The Fibonacci sequence up to the 5th term is:

0,1,1,2,3,5

Thus, the 5th Fibonacci number is 5.

 **Sample Input 1** 

```
10

```

 **Sample Output 1** 

```
55

```

 **Explanation 1** 

The Fibonacci sequence up to the 10th term is:

0,1,1,2,3,5,8,13,21,34,55

Thus, the 10th Fibonacci number is 55.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:52:57.245Z  

```java
import java.io.*;
import java.util.*;
public class Solution {
    static long fib(int n) { return n <= 1 ? n : fib(n - 1) + fib(n - 2); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(fib(n)); }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-the-fibonacci-sequence-for-future-engineers/problem)