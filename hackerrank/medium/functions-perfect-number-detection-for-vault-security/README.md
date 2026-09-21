# Functions - Perfect Number Detection for Vault Security

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a high-security vault, the system checks the integrity of access codes to ensure they are "perfect" codes. A "perfect" code is a special access code where the sum of its proper divisors (excluding the code itself) equals the code number. If the code is perfect, the system grants access; otherwise, it returns the sum of its proper divisors to indicate the code's validity. Your task is to write a program that determines if a given code is perfect or returns the sum of its proper divisors.

Write a function that accepts an integer n representing the access code and:

Returns 1 if the number is a perfect number. Otherwise, returns the sum of the proper divisors of the number.

 **Function Signature** 

int detectPerfectNumber(int n)

 **Input Format** 

The input consists of a single integer n.

 **Constraints** 

NA

 **Output Format** 

The output is either 1 (if n is a perfect number) or the sum of the proper divisors of n.

 **Sample Input 0** 

```
22

```

 **Sample Output 0** 

```
14

```

 **Explanation 0** 

The proper divisors of 22 are 1, 2, and 11. The sum of these divisors is 14, which is not equal to 22. Hence, the code is not perfect, and the sum of proper divisors 14 is returned.

 **Sample Input 1** 

```
6

```

 **Sample Output 1** 

```
1

```

 **Explanation 1** 

The proper divisors of 6 are 1, 2, and 3. The sum of these divisors is 6, which is equal to the number itself. Hence, the number 6 is a perfect number, and the output is 1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:32:48.682Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static int detectPerfectNumber(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) sum += other;
            }
        }
        return sum == n ? 1 : sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(detectPerfectNumber(n));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-perfect-number-detection-for-vault-security/problem)