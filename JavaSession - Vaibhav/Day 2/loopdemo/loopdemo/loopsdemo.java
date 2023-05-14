package loopdemo;

import java.util.Scanner;

public class loopsdemo {

	public static void main(String[] args) {
		//2 types of loops
		//a. while loop - use this when you do not know how many times to iterate
		//b. for loop - use this when you know number of times of iteration 
		
		Scanner read = new Scanner(System.in);
		System.out.print("Keep Entering  number, enter 0 when done ");
			
		int evenNumbers = 0;
		int oddNumbers = 0;
		int total = 0;
		int negatives = 0;
		int count = 0;
		
		int favNumber = read.nextInt();
		
		while(favNumber != 0)
		{
			
			count = count + 1;
			total = total + favNumber;
			
			
			if(favNumber % 2 == 0)
			{
				evenNumbers = evenNumbers + 1;
			}
			else
			{
				oddNumbers = oddNumbers + 1;
			}
			if(favNumber < 0)
			{
				negatives = negatives + 1;
			}
			System.out.print("Enter Fav number");
			
			favNumber = read.nextInt();	
					
		}
		System.out.print("Thank you for  numbers, below is the summary");
		
		System.out.println("Total Numbers you entered : " + count );
		System.out.println("Sum of Numbers you entered : " + total );
		System.out.println("Total Even Numbers you entered : " + evenNumbers );
		System.out.println("Total Odd Numbers you entered : " + oddNumbers );
		System.out.println("Total Negative Numbers you entered : " + negatives );
	}

}
