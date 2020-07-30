package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// 8 primitive data types: byte, short, int, long, float, double, char, and boolean.  Int, double, and boolean are most commonly used.
    // Creating a class is commensurate with creating a  new data type

        //String is a datatype (aka not a primitive type).  It is actually a class but Java makes it easier to use than other classes.
        //String is a sequence of characters - limited by memory or the MAX_VALUE of an int (2.14B)

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        //below shows how an int etc. getting appended on to a string gives a new String which consists of the previous value of lastString plus a text representation of the appended var (in this case an int)
        //old string is discarded when new string is created - i.e. Strings are immutable
        // appending values like this is inefficient - recommended to use StringBuffer instead because that can be changed
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);





    }
}
