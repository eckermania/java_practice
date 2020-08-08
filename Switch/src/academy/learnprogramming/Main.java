package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;

        //if statement is more flexible than switch
        //can group cases (see 3/4/5 below)
        //break takes you out to the next line of code outside the switch block
        //if you forget the break, it will also hit the default (feels similar to return)
        //could take out the break after the default but. . . that's sloppytown.
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        //switch is case sensitive so good to use the toLowerCase method (on the String class)
        String switchChar = "E";

        switch(switchChar.toLowerCase()){
            case "a":
                System.out.println("Found the A!");
                break;
            case "b":
                System.out.println("Found the B!");
                break;
            case "c":
                System.out.println("Found the C!");
                break;
            case "d":
                System.out.println("Found the D! lol");
                break;
            case "e":
                System.out.println("Found the E!");
                break;
            default:
                System.out.println("Didn't find nuthin");
                break;
        }
        System.out.println("Ya done");
    }
}
