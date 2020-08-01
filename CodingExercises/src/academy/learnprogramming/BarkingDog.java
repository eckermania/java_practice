package academy.learnprogramming;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay >= 0 && hourOfDay <= 23 && barking && (hourOfDay < 8 || hourOfDay > 22)) {
            result = true;
        }
        return result;
    }
}
