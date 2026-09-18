# Looping - Optimizing Energy Division for Maximum Efficiency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A renewable energy company wants to distribute a given amount of energy, represented by an integer N, into smaller segments to maximize the total output. Each segment represents a unit that, when combined with others, maximizes the efficiency and overall power output.

The company’s research indicates that splitting the energy into certain parts will yield a higher product (efficiency). For instance, if N is split into 2 and 3, or multiple 3’s, it yields the highest efficiency. Your task is to help the company determine the best way to split the energy N into smaller segments to maximize the product.

Write a program that accepts a non-negative integer N and outputs the maximum possible product when N is split optimally.

 **Input Format** 

A single non-negative integer N.

 **Constraints** 

1≤N≤100

 **Output Format** 

A single positive integer representing the maximum product of the energy segments.

 **Sample Input 0** 

```
4

```

 **Sample Output 0** 

```
4

```

 **Explanation 0** 

When N = 4, the best split is 4 = 2 + 2, resulting in a product of 2×2=4

 **Sample Input 1** 

```
6

```

 **Sample Output 1** 

```
9

```

 **Explanation 1** 

When N = 6, the best split is 6 = 3 + 3, resulting in a product of 3×3=9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T09:11:14.982Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 2) {
                System.out.println(1);
            } else if (n == 3) {
                System.out.println(2);
            } else {
                long product = 1;
                while (n > 4) {
                    product *= 3;
                    n -= 3;
                }
                product *= n;
                System.out.println(product);
            }
        }
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-optimizing-energy-division-for-maximum-efficiency/problem)