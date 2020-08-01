package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// symbols that perform operations on 1-3 operands (variables or values) and return result
        // expression is formed by combining vars, literals, method return values, and operators

       int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 -1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20/5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // remainder of 4 / 3 - (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // operator shortcuts
        result ++; // shortcut to increment by 1
        result --; // shortcut to decrement by 1
        result += 2; // shortcut to increment by x
        result -= 2; // you know what this does
        result *= 10;
        result /= 5;
        result %= 3;


        boolean isAlien = true;
        if (isAlien == false) {
         System.out.println("It is not an alien!");
         System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore >= 100){
           System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
          System.out.println("Greater than second top score and less than 100.");
        }

        // single | is a bitwise operator
        if ((topScore > 90) || (secondTopScore <= 90)){
         System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if(newValue == 50){
         System.out.println("This is true.");
        }

        boolean isCar = false;
        if(isCar){
          System.out.println("This isn't supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
         System.out.println("wasCar is true");
        }

        // Summary of operators on docs.oracle.com & cs.bilkent.edu.tr has table on java operator precedence

    }
}
