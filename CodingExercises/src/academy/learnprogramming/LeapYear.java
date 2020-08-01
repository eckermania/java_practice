package academy.learnprogramming;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year % 4 == 0 && year > 0 && year < 9999){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    result = true;
                }
                return result;
            }
            result = true;
        }
        System.out.println(result);
        return result;
    }
}
