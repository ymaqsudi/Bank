import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		Bank myBank = new Bank();
		
		myBank.setNewName();
		myBank.setPin();
		while (true) {
			
			System.out.println("Type 1 if you want to make a deposit. \n"
								+ "Type 2 if you want to make a withdrawal. \n"
								+ "Type 3 if you want to see the pin you created. \n"
								+ "Type 4 if you want to check your current balance.");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1: myBank.deposit();
			break;
			case 2: myBank.withdraw();
			break;
			case 3: myBank.displayPin();
			break;
			case 4: myBank.displayCurrentBalance();
			break;
			default: System.out.println("That is not currently a function at this bank.");
			}
		}

	}

}

// hi