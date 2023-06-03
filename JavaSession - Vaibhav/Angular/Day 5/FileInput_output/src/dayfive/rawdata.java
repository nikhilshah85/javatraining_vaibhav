package dayfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class rawdata {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to file IO demo");
		
//		File myFile = new File("intro.txt");
//		
//		
//		try {
//
//			FileWriter pen = new FileWriter(myFile);
//			
//			
//			pen.write("Hello My Name is Nikhil, I am from Mumbai and this if my first file useing Java Applicatio \n");
//			pen.write("I am a Programmer \n");
//			pen.write("I Work on Cloud APPs \n");
//			pen.write("This is fun \n");
//			pen.write("Thank you I will let you know more about myself \n");
//			
//			pen.close();
//			
//			System.out.print("Data written to File");
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		File myFile = new File("intro.txt");
//		try {
//			Scanner readData = new Scanner(myFile);
//			
//			while(readData.hasNextLine())
//			{
//				System.out.println(readData.nextLine());
//			
//			}
//			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		file_usecase useCaseObj  = new file_usecase();
		useCaseObj.PlayWithNumber();
				
		
		

	}

}

















