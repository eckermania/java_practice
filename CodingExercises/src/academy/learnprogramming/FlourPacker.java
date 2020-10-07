package academy.learnprogramming;

public class FlourPacker {

    // bigCount = 5 kg, smallCount = 1 kg, goal = # of kg needed
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int bigKGs = bigCount*5;
        int totalKGs = bigKGs + smallCount;

        if(totalKGs == goal) return true;
        else if(totalKGs < goal) return false;

        int smallBagsNeeded = 0;

        if(bigKGs < goal)
        {
            smallBagsNeeded = goal - bigKGs;

        } else {
            int bigBagsUsed = goal / 5;
            smallBagsNeeded = goal - (bigBagsUsed*5);
        }

        if(smallBagsNeeded > smallCount) return false;
        else return true;
    }
}
