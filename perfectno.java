import java.util.*;
public class perfectno {
    public static boolean isPerfectNum(int num) {
        int sum=0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum =sum + i;
                } 
            }
        return sum == num;
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        if (isPerfectNum(num)) {
            System.out.println(num + " is a perfect number.");
        }
         else 
        {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
