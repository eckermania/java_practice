package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Dont need to cast the long below because value is within int range
        byte sampleByte = 100;
        short sampleShort = 30000;
        int sampleInt = 2000000;
        long doingMathThings = (500000L + (10L * (sampleByte + sampleShort + sampleInt)));
        System.out.println(doingMathThings);


        double pounds = 170d;
        double kilos = pounds * 0.45359237d;
        System.out.println("I weigh this in kilograms: " + kilos);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        
    }
}
