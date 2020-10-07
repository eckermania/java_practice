package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int intCount = 0;

        while(true)
        {
            boolean isInt = scanner.hasNextInt();

            if(!isInt) break;

            double numberInput = scanner.nextDouble();
            sum += numberInput;
            intCount ++;

            scanner.nextLine();
        }

        int intSum = (int)sum;
        double average = sum/intCount;

        System.out.println("SUM = " + intSum + " AVG = " + Math.round(average));
        scanner.close();
    }
}
