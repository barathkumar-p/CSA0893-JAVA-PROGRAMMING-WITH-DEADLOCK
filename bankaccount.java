public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. A $5 penalty will be charged.");
            balance -= 5;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void computeInterest(double interestRate) {
        double interest = balance * interestRate;
        balance += interest;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create an account with an initial balance of $100
        Account myAccount = new Account(100);

        // Deposit $50 into the account
        myAccount.deposit(50);

        // Inquire the current balance
        System.out.println("Current balance: $" + myAccount.getBalance());  // Output: Current balance: $150.0

        // Withdraw $200 (more than available balance)
        myAccount.withdraw(200);
        System.out.println("Current balance: $" + myAccount.getBalance());  // Output: Current balance: $145.0

        // Compute interest on the current balance at an interest rate of 0.05 (5%)
        myAccount.computeInterest(0.05);
        System.out.println("Current balance: $" + myAccount.getBalance());  // Output: Current balance: $152.25
    }
}