package academy.learnprogramming;

import java.util.Scanner;

public class MinAndMaxInput {

    public static void printMinAndMax()
    {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        while(true)
        {
            System.out.println("Enter a number");

            boolean inputIsInt = scanner.hasNextInt();

            if(inputIsInt)
            {
                int input = scanner.nextInt();

                if(input < min) min = input;
                if(input > max) max = input;

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min number entered was: " + min + "and max number entered was: " + max);

        scanner.close();
    }
}
