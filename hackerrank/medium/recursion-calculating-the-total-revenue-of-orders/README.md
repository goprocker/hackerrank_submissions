# Recursion - Calculating the Total Revenue of Orders

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In an e-commerce platform, you are tasked with calculating the total revenue generated from the first n orders. Each order is associated with a price that corresponds to its order number (i.e., the first order costs 1 unit, the second order costs 2 units, and so on). The company wants to implement a feature where the total revenue from the first n orders is computed using recursion.

 **Problem** 

You are given a positive integer n which represents the number of orders. You need to calculate the total revenue generated from the first n orders using recursion.

 **Input Format** 

The input consists of a single integer n (1 ≤ n ≤ 1000), representing the number of orders.

 **Constraints** 

NA

 **Output Format** 

The output should be a single integer representing the total revenue generated from the first n orders.

 **Sample Input 0** 

```
5

```

 **Sample Output 0** 

```
15

```

 **Explanation 0** 

The total revenue from the first 5 orders can be calculated as the sum of natural numbers from 1 to 5:

Revenue = 1 + 2 + 3 + 4 + 5 = 15

 **Sample Input 1** 

```
3

```

 **Sample Output 1** 

```
6

```

 **Explanation 1** 

The total revenue from the first 3 orders is:

Revenue = 1 + 2 + 3 = 6

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:52:42.825Z  

```java
import java.io.*;
import java.util.*;
public class Solution {
    static long sum(int n) { return n <= 0 ? 0 : n + sum(n - 1); }
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); int n=sc.nextInt(); System.out.print(sum(n)); }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-calculating-the-total-revenue-of-orders/problem)