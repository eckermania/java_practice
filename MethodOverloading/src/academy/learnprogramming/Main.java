package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	 int newScore = calculateScore("Erin", 500);
	 System.out.println("New score is " + newScore);
	 calculateScore(75);

	 double cm = calcFeetAndInchesToCentimeters(5, 7);
	 System.out.println("I am " + cm + " cm tall.");
	 double secondCm = calcFeetAndInchesToCentimeters(100);
	 System.out.println("I am " + secondCm + " cm tall.");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    //overloaded method - same method except diff # of args.  what makes it unique/gives the method its signature is the datatype of the args and the # of args.
    //changing the datatype of the return will not overload a method
    // overloading allows for greater flexibility and readability

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name - no cookie for you");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0 || inches < 0 || inches >= 12){
            return -1;
        }
        return ((feet * 12) + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0){
            return -1;
        }
        int feet = inches/12;
        int remainingInches = inches % 12;
        double cm = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return cm;
    }


}
