package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        if(ageOne > 19 || ageOne < 13){
            if(ageTwo > 19 || ageTwo < 13){
                if(ageThree > 19 || ageThree < 13){
                    System.out.println(false);
                    return false;
                }
                System.out.println(true);
                return true;
            }
            System.out.println(true);
            return true;
        }
        System.out.println(true);
        return true;
    }

    public static boolean isTeen(int age){
        if(age > 19 || age < 13){
            System.out.println(false);
            return false;
        }
        return true;
    }
}
