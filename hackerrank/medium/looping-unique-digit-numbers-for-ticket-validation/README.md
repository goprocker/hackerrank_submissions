# Looping - Unique-Digit Numbers for Ticket Validation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine that a theme park is issuing tickets with unique serial numbers. For a special promotion, the park wants to count how many tickets between two given serial numbers have no repeated digits. The theme park administration wants to automate this process to ensure accurate counts and streamline operations.

Your task is to write a program to determine the total number of tickets (or integers) between two given serial numbers n1 and n2 (both inclusive) that have all unique digits.

 **Input Format** 

- The first line contains a non-negative integer n1.
- The second line contains a non-negative integer n2 such that n1

 **Constraints** 

NA

 **Output Format** 

The output should be an integer representing the count of numbers between n1 and n2 that have no repeated digits.

 **Sample Input 0** 

```
10  
50  

```

 **Sample Output 0** 

```
37

```

 **Explanation 0** 

- The numbers between 10 and 50 that have no repeated digits are: 10, 12, 13,..., 49, 50.
- There are 37 such numbers.

 **Sample Input 1** 

```
123  
130  

```

 **Sample Output 1** 

```
8

```

 **Explanation 1** 

- The numbers between 123 and 130 that have no repeated digits are: 123, 124, 125, 126, 127, 128.
- The number 129 and 130 are not counted because 129 has unique digits, but 130 has a repeated '0'.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T15:41:25.205Z  

```java
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long low = sc.nextLong(), high = sc.nextLong(), count = 0;
        for (long n = low; n <= high; n++) {
            long x = n;
            int mask = 0;
            boolean unique = true;
            do {
                int digit = (int)(x % 10);
                if ((mask & (1 << digit)) != 0) { unique = false; break; }
                mask |= 1 << digit;
                x /= 10;
            } while (x > 0);
            if (unique) count++;
            if (n == high) break;
        }
        System.out.println(count);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-unique-digit-numbers-for-ticket-validation/problem)