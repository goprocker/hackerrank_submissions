# Functions - Generating Excel Column Labels

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a spreadsheet application like Excel, columns are labeled alphabetically in a specific pattern: "A", "B", "C",..., "Z", followed by "AA", "AB", "AC",..., "AZ", and so on. As a user of the application, you may want to know the corresponding label for a given numeric index of a column.

For example, if you want to know the label for the 956th column, the label would be "AJT". This problem simulates this requirement of converting a numeric index into the corresponding Excel column label.

Given a numeric index n, your task is to write a function to return the corresponding column label in Excel.

You are given an integer n which represents the 1-based index of a column.

 **Function Description** 

int FindExcelColumnName(int n)

 **Input Format** 

The input consists of a single integer n (1 ≤ n ≤ 2^31 - 1).

 **Constraints** 

NA

 **Output Format** 

The output should be a string containing the corresponding column label.

 **Sample Input 0** 

```
956

```

 **Sample Output 0** 

```
AJT

```

 **Explanation 0** 

The corresponding column label for the number 956 is "AJT".

Columns follow a pattern where:

- 1 = A, 2 = B,..., 26 = Z,
- 27 = AA, 28 = AB,..., 52 = AZ, 53 = BA, and so on.

For the number 956, following the pattern, the corresponding label is "AJT".

 **Sample Input 1** 

```
16383

```

 **Sample Output 1** 

```
XFC

```

 **Explanation 1** 

The number 16383 corresponds to the column label "XFC" in Excel.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T08:31:54.378Z  

```java
import java.util.*;
public class Solution {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);long n=sc.nextLong();StringBuilder s=new StringBuilder();while(n>0){n--;s.append((char)('A'+n%26));n/=26;}System.out.print(s.reverse());}
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-generating-excel-column-labels/problem)