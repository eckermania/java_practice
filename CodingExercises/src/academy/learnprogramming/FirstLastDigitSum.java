package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number <0) return -1;

        int sum = 0;
        int lastDigit = 0;
        sum += number % 10;

        while(number != 0){
            lastDigit = number % 10;
            number /= 10;
        }

        sum += lastDigit;
        System.out.println("Sum is " + sum);
        return sum;
    }
}
