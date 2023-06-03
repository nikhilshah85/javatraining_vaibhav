package pkg_banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
	
		
		
		
		System.out.println("Welcome to Banking System - Accounts Management Module");
		
		System.out.println("1. Create New Account");
		System.out.print("2. View Account Details");
		
		Scanner choice = new Scanner(System.in);
		
		int userChoice = choice.nextInt();
		Accounts accObj = new Accounts();
		switch (userChoice) {
		case 1: {
			
			System.out.println("Please Enter Account Name");
			String name = choice.next();
			

			System.out.println("Please Enter Account Type");
			String type = choice.next();
			

			System.out.println("Please Enter Account Balance");
			int bal = choice.nextInt();
			
			accObj = new Accounts(name, type, bal);
			accObj.CreateNewAccount(name, type, bal);
			System.out.print("Congratulations Account Created");
			break;
		}
		case 2:
		{
			
			System.out.println("Please Enter Account Name");
			String name = choice.next();
			
			accObj.ReadAccountDetails(name);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + userChoice);
		}
		
		
		
	  
	 
		
		
	 
	
		

	}
}

	
	
	
	
	
	
	












