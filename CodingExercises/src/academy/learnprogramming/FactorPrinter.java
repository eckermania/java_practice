package academy.learnprogramming;

public class FactorPrinter {
    public static void printFactors (int number)
    {
        String message = "";

        if(number < 1) message = "Invalid Value";

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                message += Integer.toString(i) + " ";
            }
        }
        System.out.println(message);
    }
}
