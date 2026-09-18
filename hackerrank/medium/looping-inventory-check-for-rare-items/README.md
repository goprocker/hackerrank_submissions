# Looping - Inventory Check for Rare Items

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a warehouse management system, rare items are considered special if their item ID is a Strong Number. A Strong Number is a number in which the sum of the factorial of each digit is equal to the number itself. Your task is to create a program that checks whether the given item ID is a Strong Number or not.

Imagine a warehouse manager who needs to quickly identify rare items for cataloging. If an item ID is a Strong Number, it should be flagged as "Rare Item," otherwise, it should be marked as "Common Item."

 **Input Format** 

The first line of input contains an integer N, which represents the item ID.

 **Constraints** 

NA

 **Output Format** 

Print "Rare Item" if the item ID is a Strong Number. Print "Common Item" if the item ID is not a Strong Number.

 **Sample Input 0** 

```
145

```

 **Sample Output 0** 

```
Rare Item

```

 **Explanation 0** 

- The digits of 145 are 1, 4, and 5.
- The factorial of 1 is 1, the factorial of 4 is 24, and the factorial of 5 is 120.
- The sum of factorials: 1 + 24 + 120 = 145, which is equal to the item ID.
- Hence, the item ID 145 is a Strong Number, so the output is "Rare Item."

 **Sample Input 1** 

```
123

```

 **Sample Output 1** 

```
Common Item

```

 **Explanation 1** 

- The digits of 123 are 1, 2, and 3.
- The factorial of 1 is 1, the factorial of 2 is 2, and the factorial of 3 is 6.
- The sum of factorials: 1 + 2 + 6 = 9, which is not equal to the item ID.
- Hence, the item ID 123 is not a Strong Number, so the output is "Common Item."

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T09:07:24.292Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int original = n;
            int sumOfFactorials = 0;

            while (n > 0) {
                int digit = n % 10;
                sumOfFactorials += factorial(digit);
                n /= 10;
            }

            if (sumOfFactorials == original) {
                System.out.println("Rare Item");
            } else {
                System.out.println("Common Item");
            }
        }
        scanner.close();
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-inventory-check-for-rare-items/problem)