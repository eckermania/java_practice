package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count < 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;

        // while(true) is an infinite loop unless there is a break like below
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        //do while loop ensures loop will run at least once
        // below wouldn't work as intended if count was set at 6 since while check isn't happen until after do
        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        } while (count < 6);

        int number = 4;
        int finishNumber = 20;

        //"continue" directs to back to start of while loop
        //"break" will exit the loop
        count = 0;
        while(number <= finishNumber && count < 5){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
        }
    }

    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

}
