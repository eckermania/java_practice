package academy.learnprogramming;

public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year){
        if(month <1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        boolean leapYear = isLeapYear(year);

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(leapYear) return 29;
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;

        }
    }
}
