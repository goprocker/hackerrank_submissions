# Decision Making - Selecting the Second Best Candidate

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A university is organizing an annual awards ceremony to honor the top students in a prestigious academic competition. After evaluating the scores of the top three finalists, the committee wants to determine the student who secured the second-highest score. Your task is to write a program that, given the scores of the three students, identifies the second-highest score to ensure fair recognition of the top achievers.

 **Input Format** 

Three integers, score1, score2, and score3, representing the scores of the three students

 **Constraints** 

NA

 **Output Format** 

Print the second-highest score as an integer.

 **Sample Input 0** 

```
85 92 78

```

 **Sample Output 0** 

```
85

```

 **Explanation 0** 

The scores are 85, 92, and 78. The second-highest score is 85.

 **Sample Input 1** 

```
67 67 89

```

 **Sample Output 1** 

```
67

```

 **Explanation 1** 

The scores are 67, 67, and 89. The second-highest score is 67.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T10:35:58.001Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int[] scores = new int[3];
            scores[0] = scanner.nextInt();
            scores[1] = scanner.nextInt();
            scores[2] = scanner.nextInt();
            
            
            Arrays.sort(scores);
            
           
            System.out.println(scores[1]);
        }
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/decision-making-selecting-the-second-best-candidate/problem)