# Functions - Matrix Update for Weather Forecast Analysis

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you're working for a weather forecasting company that monitors the temperature across different regions. They use a matrix to represent the temperature readings of various cities in a square grid (with rows and columns representing different cities). The system wants to update the temperature values on the diagonal (cities where the row number equals the column number) by calculating the sum of the surrounding cities' temperatures. This helps to smooth out any extreme temperature fluctuations along the diagonal that might be outliers. Your task is to write a function to modify the diagonal temperatures based on the sum of the surrounding temperatures.

 **Problem Statement** 

You are given an m x m matrix where each element represents the temperature in a specific city. The matrix has m rows and m columns. You need to replace the temperature of the diagonal elements (where the row number i equals the column number j) with the sum of the surrounding elements. The surrounding elements of a diagonal element include:

- Top, Bottom, Left, Right
- Diagonal elements (top-left, top-right, bottom-left, bottom-right)
- Function Description

public static int[][] ReplaceDiagonal(int[][] mat, int m)

The updated matrix should be returned, and if the matrix is empty, return the matrix unchanged.

 **Input Format** 

- The first line contains an integer m, the size of the matrix.
- The next m lines contain m integers, representing the matrix.

 **Constraints** 

- m is an integer such that 1 <= m <= 1000.
- The matrix is m x m, and each element is an integer within the range of standard integer limits.

 **Output Format** 

Output the matrix with updated diagonal elements.

 **Sample Input 0** 

```
3
1 2 3
4 5 6
7 8 9

```

 **Sample Output 0** 

```
11 2 3
4 50 6
7 8 64

```

 **Explanation 0** 

The diagonal elements are: 1, 5, 9

- For 1, the surrounding elements are: 2, 4, 5 → Sum = 11
- For 5, the surrounding elements are: 11, 2, 3, 4, 6, 7, 8, 9 → Sum = 50
- For 9, the surrounding elements are: 50, 6, 8 → Sum = 64

 **Sample Input 1** 

```
2
12 20
10 22

```

 **Sample Output 1** 

```
52 20
10 82

```

 **Explanation 1** 

The diagonal elements are: 12, 22

- For 12, the surrounding elements are: 20, 10, 22 → Sum = 52
- For 22, the surrounding elements are: 52, 20, 10 → Sum = 82

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T04:03:30.431Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextLong();
            }
        }
        
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int r = Math.max(0, i - 1); r <= Math.min(n - 1, i + 1); r++) {
                for (int c = Math.max(0, i - 1); c <= Math.min(n - 1, i + 1); c++) {
                    if (r != i || c != i) {
                        sum += a[r][c];
                    }
                }
            }
            a[i][i] = sum;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a[i][j]);
            }
            if (i + 1 < n) {
                System.out.println();
            }
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-matrix-update-for-weather-forecast-analysis/problem)