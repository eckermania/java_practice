package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree)
    {
        if (!isValid(numOne) || !isValid(numTwo) || !isValid(numThree))
        {
            return false;
        } else if (numOne % 10 == numTwo % 10 || numOne % 10 == numThree % 10 || numTwo % 10 == numThree % 10)
        {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number)
    {
        if(number < 10 || number > 1000) return false;
        return true;
    }
}
