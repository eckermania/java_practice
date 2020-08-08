package academy.learnprogramming;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int savedNumber = number;
        while (number != 0){
            reverse *= 10;
            int digit = number % 10;
            reverse += digit;
            number /= 10;
        }
        return (reverse == savedNumber);
    }
}
