package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        //Int has width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;


        //Byte has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        //Short has width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("short minimum value = " + myMinShortValue);
        System.out.println("short maximum value = " + myMaxShortValue);

        //Long has a width of 64. Put "L" at end of number to indicate it is a long.  If it is small enough to be an int, it won't throw an error
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647234L;

        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //Cast to different type to avoid error
        byte myNewByteValue = (byte) (myMinByteValue / 2 );
        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
