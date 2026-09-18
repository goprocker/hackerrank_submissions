# Strings - Seat Allocation Check for Graduation Ceremony

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

During the annual graduation ceremony, the organizers have arranged 26 seats, labeled from A to Z, for special guests. Each seat should ideally be placed in the order of the English alphabet, corresponding to the ordinal number of the letter (i.e., A at position 1, B at position 2, and so on up to Z at position 26). Due to a last-minute shuffle, the seats have been arranged randomly, and the organizer needs your help to check how many seats are correctly positioned.

Write a program that takes a string of randomly arranged seat labels and determines how many of these seats are in the correct alphabetical position.

 **Input Format** 

A single string representing the current arrangement of seat labels.

 **Constraints** 

- The string contains only uppercase or lowercase English letters.
- Length of the string≤26\text{Length of the string} \leq 26Length of the string≤26
- The same alphabetical positions apply for both uppercase and lowercase letters.

 **Output Format** 

A single integer representing the number of seats that are correctly positioned.

 **Sample Input 0** 

```
abcxyzgh

```

 **Sample Output 0** 

```
5

```

 **Explanation 0** 

In this input:

- Letters a, b, c, g, and h are correctly positioned at 1, 2, 3, 7, and 8 respectively.
- The rest of the letters are not in their correct positions.

 **Sample Input 1** 

```
abcxyz

```

 **Sample Output 1** 

```
3

```

 **Explanation 1** 

In this input:

- Letters a, b, and c are correctly positioned at positions 1, 2, and 3, respectively.
- The other letters x, y, and z are not in their correct positions.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T09:04:26.697Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.next();
            int correctCount = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                int expectedCharNum = i + 1; // 1-based index (1 for 'a', 2 for 'b', etc.)
                int actualCharNum = c - 'a' + 1;

                if (actualCharNum == expectedCharNum) {
                    correctCount++;
                }
            }

            System.out.println(correctCount);
        }
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-seat-allocation-check-for-graduation-ceremony/problem)