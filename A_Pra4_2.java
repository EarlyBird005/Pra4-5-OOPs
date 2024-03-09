/*Define the class BankAccount to represent an account we open with bank. Define the subclasses SavingAccount and FixedDepositAccount. Implement the operations like openAccount(), deposit(), checkBalance(), withdraw() and calInterest() for these classes. */
import java.util.*;

class BankAccount {
    private int accId;
    private String name;
    private double balance;
    private int age;

    void openAccount(Scanner se) {
        System.out.println("Enter details of the customer(account id, name, balance, age): ");
        this.accId = se.nextInt();
        se.nextLine();
        this.name = se.nextLine();
        this.balance = se.nextDouble();
        this.age = se.nextInt();
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("balance: %f\n", balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    double checkBalance() {
        return this.balance;
    }

    void withdraw(double amount) {
        this.balance -= amount;
        System.out.printf("After withdrawal balance is: %f\n", balance);
    }

    void calInterest() {}

    int getAge() {
        return this.age;
    }
}

class SavingAccount extends BankAccount {
    private static double interestRate = 0.04;

    SavingAccount(Scanner se) {
        super.openAccount(se);
    }

    void calInterest() {
        double interest = checkBalance() * interestRate;
        System.out.print("After interest ");
        super.deposit(interest);
    }

    void withdraw(double amount) {
        double minBalance = 100.0;

        if (checkBalance() - amount <= minBalance) {
            System.err.println("\nNot sufficient balance.");
            return;
        }
        super.withdraw(amount);
    }
}

class FixedDepositAccount extends BankAccount {
    private static double interestRate = 0;
    private double depositTime;

    FixedDepositAccount(Scanner se) {
        super.openAccount(se);
        System.out.print("How many years do you want to deposit money: ");
        this.depositTime = se.nextDouble();

        if (this.depositTime < 1)
            this.interestRate = 0.06;
        else if (this.depositTime >= 1 && this.depositTime < 5)
            this.interestRate = 0.07;
        else if (this.depositTime >= 5)
            this.interestRate = 0.075;

        if (getAge() >= 60)
            this.interestRate += 0.01;
    }

    void calInterest() {
        double interest = checkBalance() * interestRate;
        System.out.print("After interest ");
        super.deposit(interest);
    }

    void withdraw(double amount) {
        if (checkBalance() < amount) {
            System.err.println("\nNot sufficient balance.");
            return;
        }
        super.withdraw(amount);
    }
}

public class Pra4_2 {
    public static void main(String[] args) {
        System.out.println("Name: Nanecha Dipak Kishorbhai\t Enrollment NO.: 220170116023");
        Date t = new Date();
        System.out.println(t + "\n");
        Scanner se = new Scanner(System.in);

        se.close();
    }
}
