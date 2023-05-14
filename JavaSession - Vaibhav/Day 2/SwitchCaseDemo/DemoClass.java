import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.print("Hello Switch");
			
			Scanner read = new Scanner(System.in);
			
//			
//			System.out.print("Enter Your Account Type ");
//			String accType = read.next();
//			
//			String LoanOffer = "";
//			
//			switch (accType){
//			case "Savings": {
//				System.out.print("You have a Home Loan offer");				
//				break;
//			}
//			case "Current":{
//				System.out.print("You have a Bussiness loan offer");
//				break;
//			}
//			case "PF":{
//				System.out.print("You have a Health Insurance offer ");
//				break;
//			}
//			default:
//				throw new IllegalArgumentException("Sorry No Loan offer for you");
//			}
//			
//			
//			
			
			
			System.out.print("                       !!~~~~~~~~~~~ CITI Bank ~~~~~~~~~~~~~~~~~~~~~~!!            ");
			System.out.print("Please Slect Option to start Banking");
			
			System.out.println("1. Create New Account");
			System.out.println("2. Widraw Funds ");
			System.out.println("3. Deposit Funds");
			System.out.println("4. Check Balance");
			System.out.println("5. Get Mini Statement - (last 5 transactions)");
			System.out.println("6. Exit");
			
			
			int option = read.nextInt();
			int availableBalance = 5000;
			
			switch (option) {
			case 1: {
				System.out.print("Opening New Account for you, we will take all the information");
				break;
			}
			case 2: {
				System.out.print("Please Enter amount you wish to withdraw");
				int w_amount = read.nextInt();
				availableBalance = availableBalance - w_amount;
				System.out.print("Balance After Widrawal : " + availableBalance + " Rs.");
				break;
			}
			case 3: {
				System.out.print("Please Enter amount you wish to Deposit");
				int d_amount = read.nextInt();
				availableBalance = availableBalance + d_amount;
				System.out.print("Balance After Deposit : " + availableBalance);
				break;
			}
			case 4: {
				System.out.print("Available Balance : " + availableBalance);
				break;
			}
			case 5: {
				System.out.print("last 5 transaciotns are as below : ");
			break;
			}
			case 6: {
				System.out.print("Thank you for banking with us, see you soon again : ");
				break;
			}
			default:
				System.out.print("Sorry wrong option selected ");
			}
	}

}



























