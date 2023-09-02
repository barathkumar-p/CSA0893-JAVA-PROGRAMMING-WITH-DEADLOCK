import java.util.*;

public class interstprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        
        double rate;
        if (age < 60) {
            rate = 12.0;
        } else {
            rate = 10.0;
        }
        
        System.out.print("Enter the number of years: ");
        double time = scanner.nextDouble();
        
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
        
        scanner.close();
    }
}
