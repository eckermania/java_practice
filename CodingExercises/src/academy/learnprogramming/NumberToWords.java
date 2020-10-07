package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords (int number)
    {
        String message = "";
        if (number < 0) message = "Invalid Value";

        int reversedNumber = reverse(number);

        while (reversedNumber > 0)
        {
            int digit = reversedNumber % 10;

            switch(digit)
            {
                case 0:
                    message += "Zero ";
                    break;
                case 1:
                    message += "One ";
                    break;
                case 2:
                    message += "Two ";
                    break;
                case 3:
                    message += "Three ";
                    break;
                case 4:
                    message += "Four ";
                    break;
                case 5:
                    message += "Five ";
                    break;
                case 6:
                    message += "Six ";
                    break;
                case 7:
                    message += "Seven ";
                    break;
                case 8:
                    message += "Eight ";
                    break;
                case 9:
                    message += "Nine ";
                    break;
            }

            reversedNumber = reversedNumber/10;
        }

        System.out.println(message.trim());

    }

    public static int reverse (int number)
    {
        int reversedNumber = 0;
        while (number > 0)
        {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber;
    }
}
