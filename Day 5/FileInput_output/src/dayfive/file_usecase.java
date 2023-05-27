package dayfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_usecase {
	
	
	int number = 0;
	
	public void PlayWithNumber()
	{
		File myFile = new File("favNumber.txt");
		
		FileReader readMyNumber;
		try {
			
			readMyNumber = new FileReader(myFile);
			try {
				number = readMyNumber.read();
				System.out.print("Read Number : " + number + "\n");
				readMyNumber.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter pen = new FileWriter(myFile);
			number = number + 1;
			pen.write(number);
			
			pen.close();
			
			System.out.println("Written Number is : " + number + "\n");
			
			
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}

}
