# Strings - Clock Mechanics

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are working on a smart clock application that provides insights into the angles formed by the clock hands at any given time. This feature can be used in clock-based puzzles or educational tools to help students learn about how time correlates with angles. The task is to compute the smallest angle between the hour and minute hands when a time is given in a 12-hour format.

You are given a string time in the format 'AB', where:

- AB represents the hours, ranging from 00 to 12.
- CD represents the minutes, ranging from 00 to 59.

Your task is to calculate the smallest angle between the hour hand and the minute hand of a clock at the given time. Return the angle up to one decimal place.

 **Input Format** 

The input consists of a single line containing a string time in the 12-hour format.

 **Constraints** 

1 <= len(time) <= 10^5

 **Output Format** 

Print a float number representing the smallest angle (in degrees) between the hour and minute hands, up to one decimal place.

 **Sample Input 0** 

```
09:06

```

 **Sample Output 0** 

```
123.0

```

 **Explanation 0** 

At 09:06, the smallest angle between the hour and minute hands is 123.0 degrees.

 **Sample Input 1** 

```
01:56

```

 **Sample Output 1** 

```
82.0

```

 **Explanation 1** 

At 01:56, the smallest angle between the hour and minute hands is 82.0 degrees.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T06:47:18.044Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String[] t = sc.next().split(":");
        double h = Double.parseDouble(t[0]) % 12;
        double m = Double.parseDouble(t[1]);
        double ha = h * 30 + m * 0.5;
        double ma = m * 6;
        double diff = Math.abs(ha - ma);
        double angle = Math.min(diff, 360 - diff);
        System.out.printf(Locale.US, "%.1f\n", angle);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-clock-mechanics/problem)