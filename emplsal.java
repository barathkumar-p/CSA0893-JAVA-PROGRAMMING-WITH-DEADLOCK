import java.util.Scanner;
public class emplsal {
    int employeeNumber;
    String name;
    double basicPay;
    }

    public double Grosssalary() {
        double hra = 0.10 * basicPay;  
        double da = 0.15 * basicPay;    
        double ta = 0.20 * basicPay; 
        return basicPay + hra + da + ta;
    }
    public double Netsalary(){
        double hra = 0.10 * basicPay;  
        double da = 0.15 * basicPay;    
        double ta = 0.20 * basicPay; 
        double pf = 0.10 * basicPay;
        double lic = 0.20* basicPay;
        return basicPay + hra + da + ta - pf - lic;
    }
    public double Deductions(){
          double pf = 0.10 * basicPay;
          double lic = 0.20* basicPay;
          return pf+lic;
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
        EmployeeSalary employee = new EmployeeSalary(employeeNumber, name, basicPay);
        double salary = employee.calculateSalary();
        double Grosssalary = employee.Grosssalary();
        double Netsalary = employee.Netsalary();
        double Deductions = employee.Deductions();
        System.out.println("Basic Pay" + basicPay);
        System.out.println("Gross Salary: " + Grosssalary);
        System.out.println("Net Salary: " + Netsalary);
        System.out.println("Deductions: " + Deductions);
    }
}
