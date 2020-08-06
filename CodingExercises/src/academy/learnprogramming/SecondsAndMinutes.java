package academy.learnprogramming;

public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        String paddedHours = String.format("%02d", hours);
        String paddedMinutes = String.format("%02d", remainingMinutes);
        String paddedSeconds = String.format("%02d", seconds);
        return paddedHours + "h " + paddedMinutes + "m " + paddedSeconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        int calcMinutes = seconds/60;
        int remainingSeconds = seconds % 60;
        return getDurationString(calcMinutes, remainingSeconds);
    }

    //constants are vars that can't be changed - same as const - use "final" e.g. private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    //constants are typically written in all caps with underscore spacing
}
