package pkg_Accounts;

public class Accounts {

	String firstName = "Nikhil";
	String lastName = "Shah";
	int accBalance = 5000; 
	

	public String GetAccountholderName()
	{
		return firstName + " " + lastName;
	}
	
	public int widraw(int w_amount)
	{
		accBalance = accBalance - w_amount;
		return accBalance;
	}
	
	public int deposit(int d_amount)
	{
		accBalance = accBalance + d_amount;
		return accBalance;
	}
	
	public int GetBalance()
	{
		return accBalance;
	}
	
	
	
}
