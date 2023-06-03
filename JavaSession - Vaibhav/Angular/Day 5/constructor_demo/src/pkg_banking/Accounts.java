package pkg_banking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Accounts implements Serializable {

	
	int accNo;
	String accName;
	String accType;
	int accBalance;
	
	
	public Accounts()
	{
	
	}
	
	public Accounts(String name, String type, int balance)
	{
		//we will read the number here and give it to accNo
		//Increment the number by 1 and store it back to file
		accName = name;
		accType = type;
		accBalance = 4000;
		
	}
			
	public void CreateNewAccount(String name, String type, int balance)
	{
 //Serialize
		
		Accounts accObj = new Accounts(name,type,balance);
		
		 
	  try {
		FileOutputStream myFile = new FileOutputStream(accObj.accName + ".txt");
		try {
			ObjectOutputStream saveObj = new ObjectOutputStream(myFile);
			saveObj.writeObject(accObj);
		System.out.print("Object Written to File");
		
		saveObj.flush();
		saveObj.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		
	}
	
	public void ReadAccountDetails(String name)
	{
		 try {
				FileInputStream myFile = new FileInputStream(name + ".txt");
				try {
					ObjectInputStream inputStream = new ObjectInputStream(myFile);
					
					try {
						Accounts acc =(Accounts)inputStream.readObject();
						
						System.out.println(acc.accName);
						System.out.println(acc.accType);
						System.out.println(acc.accBalance);
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		
	}
}
