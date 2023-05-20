package banking;

import java.util.Scanner;

import pkg_Accounts.Accounts;

public class Bank {

	public static void main(String[] args) {

		System.out.println("welcome to banking app");
		
		Accounts accObj = new Accounts();
		System.out.print(accObj.GetAccountholderName());
		
		
		
		Scanner read = new Scanner(System.in);
	
		
		
		Boolean continueOperation = true;
		
		while(continueOperation)
		{
			System.out.println("please select option");
			System.out.println("1. Check balance");
			System.out.println("2. Widraw ");
			System.out.println("3. Deposit balance");
			System.out.println("4. Exit");
			int choice = read.nextInt();
		switch (choice) {
		case 1: {
			
			System.out.println(" Available balance : " + accObj.GetBalance());
			
			continueOperation = continueOpertations(read, continueOperation);
			break;
		}
		case 2: {
			System.out.println("enter the amount you want to widraw");
			int amount = read.nextInt();
			
			accObj.widraw(amount);
			System.out.println(" Available balance : " + accObj.GetBalance());
			
			continueOperation = continueOpertations(read, continueOperation);
			break;
		}
		case 3: {
			System.out.println("enter the amount you want to deposit");
			int amount = read.nextInt();
			
			accObj.deposit(amount); //this may be 10 lines of code
			System.out.println(" Available balance : " + accObj.GetBalance());	
			
			continueOperation = continueOpertations(read, continueOperation);
			break;
	
		}
		case 4: {
			System.out.println("Thank you for banking with us, see you soon again");
			break;
		}
		default:
			System.out.println("Sorry incorrect choice");
			break;
		}
		}
		

	}

	private static Boolean continueOpertations(Scanner read, Boolean continueOperation) {
		System.out.println("Do you wish to do more operation ? ");
		System.out.println("1. yes");
		System.out.println("2. No");
		
		String continueChoice = read.next();
		System.out.print(continueChoice);
		if(continueChoice.equals("No"))
		{
			
			continueOperation = false;
			System.out.println("Thank you for banking with us, see you soon again");
		}		
		return continueOperation;
	}

}
