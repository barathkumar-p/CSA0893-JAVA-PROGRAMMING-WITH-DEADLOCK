import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the grade (A or B) of the employee: ");
        String grade = scanner.next().toUpperCase();

        double bonusPercentage;
        if (salary < 10000) {
            bonusPercentage = 0.12; // 10% for grade B + 2% extra bonus for salary < $10,000
        } else {
            if (grade.equals("A")) {
                bonusPercentage = 0.05;
            } else if (grade.equals("B")) {
                bonusPercentage = 0.10;
            } else {
                System.out.println("Invalid grade entered.");
                return;
            }
        }

        double bonus = salary * bonusPercentage;
        double finalSalary = salary + bonus;
        System.out.printf("The salary with bonus is: $%.2f%n", finalSalary);
    }
}