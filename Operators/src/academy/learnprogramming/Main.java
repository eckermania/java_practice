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


    }
}