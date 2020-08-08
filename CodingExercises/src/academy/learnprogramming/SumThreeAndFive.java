package academy.learnprogramming;

public class SumThreeAndFive {

    public static int addThreeAndFive(){
        int count = 0;
        int total = 0;
        for(int i = 1; i < 1001; i++){
            if(count == 5){
                break;
            } else if ((i % 3 == 0) && (i % 5 ==0)){
                count++;
                total += i;
            }
        }
        System.out.println(total);
        return total;
    }

}
