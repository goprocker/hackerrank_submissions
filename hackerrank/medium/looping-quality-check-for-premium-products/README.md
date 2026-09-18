# Looping - Quality Check for Premium Products

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a retail store, some products are considered "premium" if their product ID is a Prime Number. A Prime Number is a number greater than 1 that has no divisors other than 1 and itself. Your task is to create a program that checks whether the given product ID qualifies as "Premium" or not.

Imagine a store manager who needs to filter out premium products for special promotions. If a product ID is a Prime Number, it should be labeled as "Premium Product," otherwise, it should be labeled as "Regular Product."If the given product ID is 1 consider it as "Regular Product".

 **Input Format** 

The first line of input contains an integer N, which represents the product ID.

 **Constraints** 

NA

 **Output Format** 

- Print "Premium Product" if the product ID is a Prime Number.
- Print "Regular Product" if the product ID is not a Prime Number.

 **Sample Input 0** 

```
17

```

 **Sample Output 0** 

```
Premium Product

```

 **Explanation 0** 

- The number 17 is greater than 1 and has no divisors other than 1 and itself.
- Hence, the product ID 17 is a Prime Number, so the output is "Premium Product."

 **Sample Input 1** 

```
20

```

 **Sample Output 1** 

```
Regular Product

```

 **Explanation 1** 

- The number 20 is greater than 1 but has divisors other than 1 and itself (e.g., 2, 4, 5, 10).
- Hence, the product ID 20 is not a Prime Number, so the output is "Regular Product."

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T08:19:58.338Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (isPrime(n)) {
                System.out.println("Premium Product");
            } else {
                System.out.println("Regular Product");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-quality-check-for-premium-products/problem)