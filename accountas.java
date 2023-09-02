import java.util.Scanner;

class Person {
    String name;
    int age;
}

class Account extends Person {
    int accountNumber;
}

class Admin extends Person {
    int adminId;
}

class Master extends Account {
    int adminId;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter admin ID: ");
        int adminId = scanner.nextInt();

        Master masterObj = new Master();
        masterObj.name = name;
        masterObj.age = age;
        masterObj.accountNumber = accountNumber;
        masterObj.adminId = adminId;

        System.out.println("\nMaster Object Created:");
        System.out.println("Name: " + masterObj.name);
        System.out.println("Age: " + masterObj.age);
        System.out.println("Account Number: " + masterObj.accountNumber);
        System.out.println("Admin ID: " + masterObj.adminId);

        scanner.close();
    }
}