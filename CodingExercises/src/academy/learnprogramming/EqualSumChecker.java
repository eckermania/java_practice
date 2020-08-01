package academy.learnprogramming;

public class EqualSumChecker {
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree){
        if(numOne + numTwo == numThree){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
