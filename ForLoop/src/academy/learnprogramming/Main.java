package academy.learnprogramming;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	    System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));

        //for(init; termination condition; increment){}
        for (int i = 0; i < 5; i++){
            System.out.println("Loop "+ i + " hello!");
        }

        //String formatting below limits to hundredth decimal place
        for (int i = 2; i < 9; i++){
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i > 1; i--){
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        int primeNumberCount = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                primeNumberCount++;
                System.out.println("Number " + i + " is a prime number");
                if(primeNumberCount == 3){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n ==1){
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

}
