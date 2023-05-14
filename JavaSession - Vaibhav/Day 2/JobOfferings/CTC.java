import java.util.Scanner;
public class CTC {

	public static void main(String[] args) {
	System.out.print("Hello");
	
	System.out.print("WElcome to Job Portal");
	Scanner read = new Scanner(System.in);
	
	String name = "";
	String education = "";
	int years = 0;
	String gender = "";
	float basic = 0;
	float HRA = 0;
	float FoodAllowance = 0;
	float travelAllowance = 0;
	float grossSalary = 0;
	float tax = 0;
	float netSalary = 0;
	float CTC = 0;
	System.out.print("\n Please Enter Your Name : ");
	name = read.next();
	
	System.out.print("\n Please Enter Your Education : ");
	education = read.next();
	
	System.out.print("\n Please Enter Your Years of expereince : ");
	years = read.nextInt();
	
	System.out.print("\n Please Enter Your Gender : ");
	 gender = read.next();
	
	
		if((education.equals("Graduate") != true) && (education.equals("PG") != true) && (education.equals("Masters") != true)) 
		{
			System.out.print("You Do not qualify");
		}
		else
		{
			System.out.print("Calculating CTC for " + education);
		
			
			years = years - 1;
			
			if((education.equals("Graduate") == true))
			{
				
				basic = 5000 + (5000 * years / 10);
				HRA = basic * 15 / 100;
				FoodAllowance = 2000;
				travelAllowance = 2000;
				
			}
			else if((education.equals("PG") == true))
			{
				basic = 8000 + (8000 * years / 10);
				HRA = basic * 20 / 100;
				FoodAllowance = 2500;
				travelAllowance = 2500; 	
			}
			else if((education.equals("Masters") == true))
			{
				basic = 10000 + (10000 * years / 10);
				HRA = basic * 25 / 100;
				FoodAllowance = 3500;
				travelAllowance = 3500; 	
			}
			
			grossSalary = basic + HRA + FoodAllowance + travelAllowance;
			
			if(gender.equals("Male") == true)
			{
				tax = grossSalary * 15 / 100;
			}
			else
			{
				tax = grossSalary * 10 / 100;
			}
			
			netSalary = grossSalary - tax;
			CTC = netSalary * 12;
		
			System.out.print("CTC offered : " + CTC);
		}
		
			
	}

}










