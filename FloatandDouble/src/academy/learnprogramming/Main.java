package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Precision refers to the format and amount of space occupied by the type - translates to number of digits after decimal.
        // Single precision has width of 32 and Double precision has 64 width. Double tends to be preferred by libraries and is the default floating point number
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        // double data type is accepted like default (like int). "f" after number acts like casting to float
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        


    }
}
