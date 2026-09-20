# Looping - Teaching Digit Positions

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a mathematics class, a number system is being taught to students. Before teaching them 10's and 100's place, they will be taught the number positions. The positions will be starting from sequence number 1, and the direction will be from left to right.

So if I want to find the second position of a digit in the number 90876, it will be 0. If the Kth digit exceeds the number position return -1.

Write a program to find the Kth digit in a given number.

 **Input Format** 

- The first line of input contains an integer N
- The second line of input contains an integer K

 **Constraints** 

NA

 **Output Format** 

The output prints an integer denoting the Kth digit in a given number

 **Sample Input 0** 

```
956781
3

```

 **Sample Output 0** 

```
6

```

 **Explanation 0** 

The input by the user is 956781, where 9 is the first digit, 5 is the second digit, 6 is the third digit and so on. The user is asking for the third (3rd) digit in the given number, which is 6.

 **Sample Input 1** 

```
12345
6

```

 **Sample Output 1** 

```
-1

```

 **Explanation 1** 

The given number is 12345. The number has only 5 digits. Since the user is asking for the sixth digit, which does not exist, the output is -1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T15:40:32.532Z  

```java
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next().replaceFirst("^[+-]", "");
        int k = sc.nextInt();
        int answer = -1;
        for (int i = 0; i < n.length(); i++) {
            if (i + 1 == k) { answer = n.charAt(i) - '0'; break; }
        }
        System.out.println(answer);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-teaching-digit-positions/problem)