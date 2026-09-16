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
