# Looping - Next Leap Year

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are an app developer, and your company wants you to develop a new feature to engage more users by showing the next nearest leap year for a given year, represented by an integer value N. Your task is to find and return an integer value representing the next nearest leap year for the given year. If the given year itself is a leap year, then return that.

 **Input Format** 

An integer value N representing the given year.

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the next nearest leap year for a given year.

 **Sample Input 0** 

```
2021

```

 **Sample Output 0** 

```
2024

```

 **Explanation 0** 

Here, the given year is 2021 and the next upcoming leap year would be 2024. Therefore, 2024 is returned as the output.

 **Sample Input 1** 

```
2008

```

 **Sample Output 1** 

```
2008

```

 **Explanation 1** 

Here, the given year is 2008, which is itself a leap year. Therefore 2008 is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T09:26:22.808Z  

```java
import java.io.*;
import java.util.*;

public class NearestLeapYear {
    // Helper method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to find the next nearest leap year
    public static int getNextLeapYear(int n) {
        int currentYear = n;
        while (true) {
            if (isLeapYear(currentYear)) {
                return currentYear;
            }
            currentYear++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int result = getNextLeapYear(n);
            System.out.println(result);
        }
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/looping-next-leap-year/problem)