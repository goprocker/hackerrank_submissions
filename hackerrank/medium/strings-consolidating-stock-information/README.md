# Strings - Consolidating Stock Information

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In an inventory management system for a retail store, products are stored in a sequence where identical items are grouped together. To efficiently manage and track the inventory, the system needs to compress the product sequence by counting the consecutive occurrences of each item.

For instance, consider a stock record represented as a string of product codes: aaaabbccdee. Each letter represents a different product, and consecutive occurrences of the same letter indicate the quantity of that product in a row. Your task is to write a program that compresses this stock record into a concise format: a4b2c2d1e2.

 **Input Format** 

A string S representing the product codes, with a maximum length of 20 characters.

 **Constraints** 

NA

 **Output Format** 

Print the compressed string showing each character followed by the count of its consecutive occurrences.

 **Sample Input 0** 

```
aaaabbccdee

```

 **Sample Output 0** 

```
a4b2c2d1e2

```

 **Explanation 0** 

- The character a appears 4 times consecutively.
- The character b appears 2 times consecutively.
- The character c appears 2 times consecutively.
- The character d appears 1 time.
- The character e appears 2 times consecutively.
- The compressed output is a4b2c2d1e2.

 **Sample Input 1** 

```
aabbbaaa

```

 **Sample Output 1** 

```
a2b3a3

```

 **Explanation 1** 

- The character a appears 2 times consecutively.
- The character b appears 3 times consecutively.
- The character a appears 3 times consecutively.
- The compressed output is a2b3a3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:00:13.323Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        int n = s.length();
        for (int i = 0; i < n; ) {
            char c = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == c) {
                count++;
                i++;
            }
            System.out.print("" + c + count);
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-consolidating-stock-information/problem)