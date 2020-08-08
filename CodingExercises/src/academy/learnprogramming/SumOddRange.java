package academy.learnprogramming;

public class SumOddRange {
    private static boolean isOdd(int number){
        if(number <= 0 || (number % 2 == 0)){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start <0) return -1;
        for(int i=start; i<= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }

        return sum;
    }
}
