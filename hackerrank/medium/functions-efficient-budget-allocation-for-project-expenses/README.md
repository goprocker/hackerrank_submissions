# Functions - Efficient Budget Allocation for Project Expenses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are working in a project management company responsible for handling budgets for various projects. Each project involves allocating funds to either odd-numbered or even-numbered categories. For instance, categories numbered with an even digit might represent equipment expenses, while odd-digit categories represent employee wages. The goal is to maximize the efficiency of your budget by allocating it to the category (either odd or even) that has a greater total sum.

Your task is to implement a function that calculates the sum of all odd-digit expenses and the sum of all even-digit expenses from a given project budget number. The program should then output the higher sum to aid in efficient budget allocation.

 **Function Description** 

int OddEvenSum(int num)

The function OddEvenSum accepts a non-negative integer num representing the project budget. The function should find the sum of all odd digits and the sum of all even digits in num and return the greater sum. If both sums are equal, return either one.

 **Input Format** 

A single integer num representing the project budget.

 **Constraints** 

NA

 **Output Format** 

An integer representing the greater sum between the sum of odd digits and the sum of even digits.

 **Sample Input 0** 

```
98631

```

 **Sample Output 0** 

```
14

```

 **Explanation 0** 

- Sum of odd digits: 9 + 3 + 1 = 13
- Sum of even digits: 8 + 6 = 14
- Since the sum of even digits is greater, the output is 14.

 **Sample Input 1** 

```
274695

```

 **Sample Output 1** 

```
21

```

 **Explanation 1** 

- Sum of odd digits: 7 + 9 + 5 = 21
- Sum of even digits: 2 + 4 + 6 = 12
- Since the sum of odd digits is greater, the output is 21.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:35:06.169Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static int OddEvenSum(int num) {
        int odd = 0;
        int even = 0;
        if (num == 0) return 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) even += digit;
            else odd += digit;
            num /= 10;
        }
        return odd >= even ? odd : even;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(OddEvenSum(num));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-efficient-budget-allocation-for-project-expenses/problem)