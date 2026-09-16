# Decision Making - Rock, Paper, Scissors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two players A and B, are playing the game of Rock, Paper, Scissors. Player A chooses a move represented by a string value M: and the move can be one of the following: ‘rock’, ‘paper’, or 'scissors' where,

- rock beats scissors
- scissors beats paper
- paper beats rock

Your task is to find and return a string value representing the winning move for Player B.

 **Note**  The output is case sensitive

 **Input Format** 

A string value M representing the move chosen by Player A

 **Constraints** 

NA

 **Output Format** 

Return a string representing the winning move for Player B.

 **Sample Input 0** 

```
rock

```

 **Sample Output 0** 

```
Paper

```

 **Explanation 0** 

Here, Player A chooses rock. The winning move for Player B is 'paper, as 'paper' beats 'rock' in the game of Rock, Paper, Scissors Hence, paper is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T09:23:39.519Z  

```java
import java.io.*;
import java.util.*;

public class RockPaperScissors {
    public static String getWinningMove(String move) {
        // Convert to lowercase to handle potential case variations in input
        move = move.toLowerCase();
        
        switch (move) {
            case "rock":
                return "Paper";
            case "paper":
                return "Scissors";
            case "scissors":
                return "Rock";
            default:
                return "Invalid Move";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String playerAMove = scanner.next();
            String playerBWinningMove = getWinningMove(playerAMove);
            System.out.println(playerBWinningMove);
        }
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/decision-making-rock-paper-scissors/problem)