package lab;
//Java program to create a file in Java using Exception Handling

import java.io.FileOutputStream;

public class ExceptionHandling
{
 public static void main(String args[])
	{ 
	   //Try block to check if exception occurs
		try
		{ 
	    
		//Creating an output stream object to create a file
		FileOutputStream fout=new FileOutputStream("D://Tesla.txt");
		
		//Writing into the file
		String s = "Nikola Tesla a legend";
		
		//convert string into bytes
		byte b[]= s.getBytes(); 
		
		//Writes bytes into the file
		fout.write(b);
		
		//Closes the file
		fout.close(); 
		
		//Display message for Successful Execution of the pgm on console
		System.out.println("success..."); 
		}
		//Catch block to handle if error is occurs
		catch(Exception e) 
		{
			//Printing the Exception
			System.out.println(e);
	    } 
	}

}

