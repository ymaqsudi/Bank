import java.util.Scanner;
public class Bank {
	String Name;
	int Pin;
	double currentBalence;
	Scanner scanner;
	int Withdraw;
	int Deposit;
	int currentBalance = 100;
	int Choice;
	
	public Bank() {
		scanner = new Scanner(System.in);
	}
	
	// Pascal syntax = Bank
	// Hello world - Yaseen
	
	public void setNewName() {
		System.out.println("Insert name here: ");
		Name = scanner.nextLine();
		System.out.println("Welcome to your bank account, " + Name +". You already have $100 dollars in this account.");
	}
	
	public void setPin() {
		System.out.println("Insert your pin number. It should be a 4 digit number.");
		Pin = scanner.nextInt();
	}
	
	public void deposit() {
		System.out.println("How much money would you like to deposit.");
		Deposit = scanner.nextInt();
		currentBalance = currentBalance + Deposit;
		System.out.println(Deposit + " dollars have been added to your bank account. You current total is $" + currentBalance);
	}
	
	public void withdraw() {
		System.out.println("How much money would you like to withdraw?");
		Withdraw = scanner.nextInt();
		currentBalance = currentBalance - Withdraw;
		if(Withdraw > (currentBalance + Deposit)) {
			System.out.println("The amount you are trying to withdraw exceeds the amount you have in your account.");
		} else {
		
			System.out.println("You have withdrawn $" + Withdraw + " from your bank account. Your current total is $" + currentBalance );
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Your current balance is $" + currentBalance);
	}
	
	public void displayPin() {
		System.out.println("Your pin number is " + Pin);
	}
}
