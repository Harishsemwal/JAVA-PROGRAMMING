import java.util.Scanner;

public class BankAccount {
    private String name;
    private String accountType;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, String accountType, int accountNumber) {
        this.name = name;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            this.balance -= amount;
        }
    }

    public void display() {
        System.out.println("***********************************");
        System.out.println("Name of Depositor: " + this.name);
        // System.out.println("Account Type: " + this.accountType);
        // System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance Amount: " + this.balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of depositor: ");
        String name = input.nextLine();

        System.out.print("Enter account type: ");
        String accountType = input.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        BankAccount account = new BankAccount(name, accountType, accountNumber);

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        account.deposit(amount);

        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        account.withdraw(amount);

        account.display();

        input.close();
    }
}
