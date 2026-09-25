# Functions - Water Tank Filling Time Calculation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a project manager at a construction site, tasked with designing the plumbing system for a new water reservoir. The rectangular tank needs to be filled using a high-efficiency pump with a known filling rate. You need to calculate how much time it will take to completely fill the water tank. The tank’s dimensions (length, breadth, and height) and the pump's filling rate are provided, and you are expected to compute the time required to fill the tank.

You are given the dimensions of a rectangular tank (length, breadth, and height) and the rate at which a pump fills the tank. You need to calculate the time required to fill the tank using the formula:

Time required = Volume of the rectangular tank / Rate at which the pipe fills the tank Where:

- Volume of the rectangular tank = Length × Breadth × Height
- Rate at which pipe fills the tank is given as an integer.

You need to implement the function to return the computed time in integer form (ignoring fractional time values).

 **Function Signature** 

int TimeToFill(int l, int b, int h, int r);

 **Input Format** 

- l (1 ≤ l ≤ 1000) — Length of the rectangular tank.
- b (1 ≤ b ≤ 1000) — Breadth of the rectangular tank.
- h (1 ≤ h ≤ 1000) — Height of the rectangular tank.
- r (1 ≤ r ≤ 1000) — Rate at which the pipe fills the tank.

 **Constraints** 

NA

 **Output Format** 

Returns the time required (in integer form) to fill the rectangular tank.

 **Sample Input 0** 

```
20
50
70
350

```

 **Sample Output 0** 

```
200

```

 **Explanation 0** 

- Volume of the rectangular tank = Length × Breadth × Height = 20 × 50 × 70 = 70000 cubic units
- Time required = Volume of the rectangular tank / Rate = 70000 / 350 = 200 Thus, the time required to fill the tank is 200 units.

 **Sample Input 1** 

```
27
81
28
63

```

 **Sample Output 1** 

```
972

```

 **Explanation 1** 

- Volume of the rectangular tank = 27 × 81 × 28 = 51096 cubic units
- Time required = Volume / Rate = 51096 / 63 = 972 Thus, the time required to fill the tank is 972 units.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T06:07:42.559Z  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long b = sc.nextLong();
        long h = sc.nextLong();
        long r = sc.nextLong();

        long result = (l * b * h) / r;

        System.out.println(result);

        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-water-tank-filling-time-calculation/problem)