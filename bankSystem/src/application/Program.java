package application;

import java.util.Locale;
import java.util.Scanner;

import properties.account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		account account;
		
		
		System.out.println("Enter account numer:");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder:");
		sc.nextLine();
		String userName = sc.nextLine();
		
		System.out.println("Is there an initial deposit? (Y/N)");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account = new account (accountNumber, userName, initialValue);
		}
		else {
			account = new account (accountNumber, userName);
		}
		

		
		System.out.println();
		System.out.println("Updated account data: " + account);
		
		System.out.println("Enter deposit value:");
		account.addDeposit(sc.nextDouble());
		
		System.out.println("Updated account data: " + account);
		
		System.out.println("Enter withdraw value:");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: " + account);
		
		
		
		sc.close();
	}

}
