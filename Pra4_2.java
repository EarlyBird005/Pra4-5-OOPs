/*Define the class BankAccount to represent an account we open with bank. Define the subclasses SavingAccount and FixedDepositAccount. Implement the operations like openAccount(), deposit(), checkBalance(), withdraw() and calInterest() for these classes. */
import java.util.*;

class BankAccount {
    private int accId;
    private String name;
    private float balance;
    private int age;

    void openAccount(Scanner se) {
        System.out.println("Enter detail of customer(account id, name, balance, age): ");
        this.accId = se.nextInt();
        se.nextLine();
        this.name = se.nextLine();
        this.balance = se.nextFloat();
	this.age = se.nextInt();
    }

    void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("balance: %f\n", balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    float checkBalance() {
        return this.balance;
    }

    void withdraw(float amount) {
        this.balance -= amount;
        System.out.println("After withdraw balance is: %f\n", balance);
    }

    void calInterest() {}
	
    int getAge() {
	return this.age;
    }
}

class SavingAccount extends BankAccount {
    private static float interestRate = 0.04f;

    SavingAccount(Scanner se) {
        super.openAccount(se);
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
	System.out.print("After interest ");
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
    private static float interestRate = 0f;
    private int depositTime;

    FixedDepositAccount(Scanner se) {
        super.openAccount(se);
	System.out.print("How many year you want to deposite money: ");	
	this.depositTime = se.nextInt();

	if(this.depositTime < 1)
		this.interestRate = 0.06f;
	else if(this.depositTime >= 1 && this.depositTime < 5)
		this.interestRate = 0.07f;
	else if(this.depositTime >= 5)
		this.interestRate = 0.075f;

	if(getAge() >= 60)
		this.interestRate += 0.01f;
    }

    void calInterest() {
        float interest = checkBalance() * interestRate;
	System.out.print("After interest ");
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
