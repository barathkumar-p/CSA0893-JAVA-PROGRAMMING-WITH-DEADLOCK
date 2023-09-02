import java.util.*;

public class pandn{

    public static void main (String [] args){
       int number;
        int positiveSum = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int negativeCount = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");

        do {
            number = s.nextInt();
        } while (number != -1);

        if (number > 0) {
            positiveSum += number;
            positiveCount++;
        } else if (number < 0) {
            negativeSum += number;
            negativeCount++;
        }
        double positiveAverage = positiveSum / positiveCount;
        double negativeAverage = negativeSum / negativeCount;
        System.out.println("this is the positive  average:" +positiveAverage );
        System.out.println("this is the negative  average:" +negativeAverage );

    }
}