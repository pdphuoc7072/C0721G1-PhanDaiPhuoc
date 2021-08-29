package ss8_clean_code_va_refactoring.bai_tap.refactoring;

import java.util.Scanner;

public class TennisGame {
    public static final int MINUS_ONE_SCORE = -1;
    public static final int ZERO_SCORE = 0;
    public static final int ONE_SCORE = 1;
    public static final int TWO_SCORE = 2;
    public static final int THREE_SCORE = 3;
    public static final int FOUR_SCORE = 4;
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isDraw = player1Score == player2Score;
        boolean isEnd = player1Score >= FOUR_SCORE || player2Score >= FOUR_SCORE;
        if (isDraw) {
            return getGameDrawCalledScore(player1Score);
        }
        if (isEnd) {
            return getGameEndCalledScore(player1Score, player2Score);
        }

        String calledScore = getPlayerCalledScore(player1Score) + " - " + getPlayerCalledScore(player2Score);
        return calledScore;
    }
    public static String getGameDrawCalledScore(int drawScore) {
        switch (drawScore) {
            case ZERO_SCORE:
                return "Love-All";
            case ONE_SCORE:
                return "Fifteen-All";
            case TWO_SCORE:
                return "Thirty-All";
            case THREE_SCORE:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }
    public static String getGameEndCalledScore(int player1Score, int player2Score) {
        int minusScore = player1Score - player2Score;

        if (minusScore == ONE_SCORE) {
            return "Advantage player1";
        }
        if (minusScore == MINUS_ONE_SCORE) {
            return "Advantage player2";
        }
        if (minusScore >= TWO_SCORE) {
            return "Win for player1";
        }
        return "Win for player2";
    }
    public static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case ZERO_SCORE:
                return "Love";
            case ONE_SCORE:
                return "Fifteen";
            case TWO_SCORE:
                return "Thirty";
            default:
                return "Forty";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player1's score: ");
        int play1Score = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter player2's score: ");
        int play2Score = Integer.parseInt(scanner.nextLine());
        System.out.println("Game's result = " + getScore("Tom", "Jerry", play1Score, play2Score));
    }
}
