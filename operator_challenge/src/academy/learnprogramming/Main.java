package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Create a double var with a value of 20.00
        double firstVal = 20.00;
        // Create a second double var with a value of 80.00
        double secondVal = 80.00;
        // Add both numbers together and multiply by 100.00
        double result = (firstVal + secondVal) * 100.00;
        //Use the remainder operator to figure out what the result remainder is if divided by 40.00
        double remainderResult = result % 40.00;
        //Create a boolean var that assigns the value true if the remainder is 0
        boolean isRemainderZero = remainderResult == 0;
        //Output boolean value
        System.out.println("isRemainderZero is " + isRemainderZero);
        //Write an if/then statement that displays "Get some remainder if boolean is false
        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }

    }
}
