import java.util.Scanner;

public class main EmplSal {
    private int employeeNumber;
    private String name;
    private double basicPay;

    public EmplSal(int employeeNumber, String name, double basicPay) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.basicPay = basicPay;
    }

    public double grossSalary() {
        double hra = 0.10 * basicPay;
        double da = 0.15 * basicPay;
        double ta = 0.20 * basicPay;
        return basicPay + hra + da + ta;
    }

    public double netSalary() {
        double hra = 0.10 * basicPay;
        double da = 0.15 * basicPay;
        double ta = 0.20 * basicPay;
        double pf = 0.10 * basicPay;
        double lic = 0.20 * basicPay;
        return basicPay + hra + da + ta - pf - lic;
    }

    public double deductions() {
        double pf = 0.10 * basicPay;
        double lic = 0.20 * basicPay;
        return pf + lic;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int employeeNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter basic pay: ");
        double basicPay = scanner.nextDouble();
        EmplSal employee = new EmplSal(employeeNumber, name, basicPay);
        double grossSalary = employee.grossSalary();
        double netSalary = employee.netSalary();
        double deductions = employee.deductions();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Deductions: " + deductions);
    }
}
