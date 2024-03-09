/*Define the class BankAccount to represent an account we open with bank. Define the subclasses SavingAccount and FixedDepositAccount. Implement the operations like openAccount(), deposit(), checkBalance(), withdraw() and calInterest() for these classes. */
import java.util.*;

class BankAccount {
    private int accId;
    private String name;
    private float balance;
    Private int age;

    void openAccount(Scanner se) {
        System.out.println("Enter detail of customer(account id, name, balance, age): ");
        this.accId = se.nextInt();
        se.nextLine();
        this.name = se.nextLine();
        this.balance = se.nextFloat();
	this.age = se.nextInt();
    }

    void deposit(float amount) {
        this.balance += amount;
    }

    float checkBalance() {
        return this.balance;
    }

    void withdraw(float amount) {
        this.balance -= amount;
        System.out.println("after withdraw balance is: " + this.balance);
    }

    void calInterest() {}
}

class SavingAccount extends BankAccount {
    static float interestRate = 0.04f;

    SavingAccount(Scanner se) {
        super.openAccount(se);
        /*
	if (interestRate == 0f) {
            System.out.print("Enter Interest rate for Saving Account: ");
            interestRate = se.nextFloat();
        }
	*/
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
        super.deposit(interest);
    }

    void withdraw(float amount) {
        float minBalance = 100.0f;

        if (checkBalance() - amount <= minBalance) {
            System.err.println("\nNot sufficient balance.");
            return;
        }

        super.withdraw(amount);
    }
}

class FixedDepositAccount extends BankAccount {
    static float interestRate = 0f;
    private int depositTime;

    FixedDepositAccount(Scanner se) {
        super.openAccount(se);
	System.out.print("How many year you want to deposite money: ");	
	this.depositTime = se.nextInt();

	if(this.depositTime < 1)
		this.interestRate = 0.06;
	else if(this.depositTime >= 1 && this.depositTime < 5)
		this.interestRate = 0.07;
	else if(this.depositTime >= 5)
		this.interestRate = 0.075;

	if(age >= 60)
		this.interestRate++;
	/*
        if (interestRate == 0f) {
            System.out.print("Enter Interest rate for Fixed Deposit Account: ");
            interestRate = se.nextFloat();
        }
	*/
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
        super.deposit(interest);
    }

    void withdraw(float amount) {
        if (this.balance < amount) {
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