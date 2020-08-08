package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int numOne, int numTwo){
        if(numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) return false;
        int numOneLastDigit = numOne % 10;
        System.out.println(numOneLastDigit);
        int numOneFirstDigit = numOne /10;
        System.out.println(numOneFirstDigit);
        int numTwoLastDigit = numTwo % 10;
        System.out.println(numTwoLastDigit);
        int numTwoFirstDigit = numTwo /10;
        System.out.println(numTwoFirstDigit);

        if(numOneFirstDigit == numTwoFirstDigit || numOneFirstDigit == numTwoLastDigit || numOneLastDigit == numTwoLastDigit || numOneLastDigit == numTwoFirstDigit){
            return true;
        }
        return false;
    }
}
