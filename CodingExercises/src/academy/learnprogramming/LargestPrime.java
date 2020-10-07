package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        if(number <= 1) return -1;

        int copyOfNumber = number;
        int i;

        for (i = 2; i <= copyOfNumber; i++)
        {
            if(copyOfNumber % i == 0)
            {
                copyOfNumber/= i;
                i--;
            }
        }
        return i;
    }
}
