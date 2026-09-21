# Functions - Finding the Leaders in Sales Data

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are working in a sales department where you are analyzing sales data for a particular month. Each element in the array represents the total sales value for a given day of the month. You are tasked with identifying the leaders in the sales data, where a leader is defined as a sales value that is higher than all the sales values to its right. The rightmost sales value of the month is always a leader. Once you identify all the leaders, your task is to calculate their total sum.

 **Function Signature** 

int SumOfLeaders(int arr[], int n);

This function accepts an array arr[] of size n where each element in the array represents the sales for a specific day. It returns the sum of the leaders in the array.

 **Assumptions** 

- The sales values in the array are distinct integers.
- The array contains sales data for at least one day (i.e., n > 0).
- If the array is empty, return -1.

 **Note** 

If the array is empty or None (in case of Python), return -1.

 **Input Format** 

- The first input is an integer n, representing the number of days (length of the array).
- The second input is a space-separated list of integers representing the sales data for n days.

 **Constraints** 

NA

 **Output Format** 

The output should be an integer representing the sum of the leader elements in the array.

 **Sample Input 0** 

```
7
52 66 64 36 45 24 32

```

 **Sample Output 0** 

```
207

```

 **Explanation 0** 

The leaders in the array are:

- 66 (since it is greater than 64, 36, 45, 24, and 32)
- 64 (since it is greater than 36, 45, 24, and 32)
- 45 (since it is greater than 24 and 32)
- 32 (since it is the rightmost element)

The sum of the leaders is: 66 + 64 + 45 + 32 = 207.

 **Sample Input 1** 

```
4
33 7 28 14

```

 **Sample Output 1** 

```
75

```

 **Explanation 1** 

The leaders in the array are:

- 33 (since it is greater than 7, 28, and 14)
- 28 (since it is greater than 14)
- 14 (since it is the rightmost element)

The sum of the leaders is: 33 + 28 + 14 = 75.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:34:04.590Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static int SumOfLeaders(int[] arr, int n) {
        if (arr == null || n <= 0) return -1;
        int maxRight = arr[n - 1];
        int sum = maxRight;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                sum += arr[i];
                maxRight = arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print(SumOfLeaders(arr, n));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-finding-the-leaders-in-sales-data/problem)