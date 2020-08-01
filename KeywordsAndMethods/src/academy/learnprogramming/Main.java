package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // 53 reserved words that are keywords in Java (e.g. all the datatypes, "public", "static", etc)
        // datatype is not part of expression - includes vars, values, and anything within brackets, and operators
        // statement is entire line/multi-lines incl. semicolon - can be assignment expressions, method calls
        // single statement doesn't require a code block
        // void method also known as procedure

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        displayHighScorePosition("Erin", 1500);
        displayHighScorePosition("Bogdan", 900);
        displayHighScorePosition("Alexis", 400);
        displayHighScorePosition("Wisam", 50);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = -1;
        if(gameOver){
            finalScore = score + (levelCompleted * bonus);
        }
        return finalScore;
    };

    public static void displayHighScorePosition(String playerName, int score){
        int position = calculateHighScorePosition(score);
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;
    }
}
