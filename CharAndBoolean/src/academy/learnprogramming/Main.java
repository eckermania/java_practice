package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // char only allows for a single character - most commonly used to hold most recently entered char by the user. Width of 16 (not just 1) because it allows you to store unicode.
        // unicode uses a combination of two bytes that a char takes up in memory and it can represent one of 65535 diff types of characters: unicode-table.com
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // boolean only allows for true or false (yes/no, 1/0, t/f won't work).  Commonly name boolean var name as a question (e.g. isCustomerOverTwentyOne)
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
