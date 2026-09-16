# Arrays 2D - Robotic Warehouse Navigation - Snake Pattern Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a modern warehouse, a robot is tasked with scanning items in storage shelves arranged in a grid-like format. The robot moves in a snake-like pattern to ensure that all shelves are scanned efficiently. Specifically, the robot starts at the first row and scans from left to right, then moves to the next row and scans from right to left, and so on.

Write a program that outputs the order in which the robot scans the items in a given matrix in a snake pattern.

 **Input Format** 

- The first line contains two integers, m (number of rows) and n (number of columns).
- The next m lines contain n integers each, representing the item IDs on the storage shelves.

 **Constraints** 

- 1≤m,n≤1001 \leq m, n \leq 1001≤m,n≤100
- Item IDs are integers ranging from 111 to 100010001000.

 **Output Format** 

Print the item IDs in the order the robot scans them in a single line, separated by spaces.

 **Sample Input 0** 

```
3 4
1 2 3 4
5 6 7 8
9 10 11 12

```

 **Sample Output 0** 

```
1 2 3 4 8 7 6 5 9 10 11 12

```

 **Explanation 0** 

 **Input Matrix (Item IDs on Shelves)** 

1 2 3 4

5 6 7 8

9 10 11 12

The robot starts at the first row and moves left to right: 1 2 3 4 It then moves to the second row and scans from right to left: 8 7 6 5 Finally, it moves to the third row and scans from left to right: 9 10 11 12

 **Output** 

The order of item IDs in the snake pattern is 1 2 3 4 8 7 6 5 9 10 11 12.

 **Sample Input 1** 

```
2 3
1 2 3
4 5 6

```

 **Sample Output 1** 

```
1 2 3 6 5 4

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T10:57:19.155Z  

```java
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            // Even rows (0, 2, 4...) go left to right
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    result.append(matrix[i][j]).append(" ");
                }
            } 
            // Odd rows (1, 3, 5...) go right to left
            else {
                for (int j = n - 1; j >= 0; j--) {
                    result.append(matrix[i][j]).append(" ");
                }
            }
        }
        
        // Print the final result trimming the trailing space
        System.out.println(result.toString().trim());
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-2d-robotic-warehouse-navigation-snake-pattern-traversal/problem)