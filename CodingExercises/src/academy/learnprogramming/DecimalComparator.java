package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        double convertedNumOne = numOne * 1000;
        System.out.println("NumOne is now " + convertedNumOne);
        double convertedNumTwo = numTwo * 1000;
        System.out.println("NumTwo is now " + convertedNumTwo);
        if((int) convertedNumOne == (int) convertedNumTwo){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
