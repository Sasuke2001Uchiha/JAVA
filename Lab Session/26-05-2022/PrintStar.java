package lab;
//Java Program To Print Right Angle Star Triangle Pattern

import java.util.*;

 class PrintStar   
	{   
		public static void main(String args[])   
		{ 
			//i for rows and j for columns
			int i, j;      
			
			//row denotes the number of rows you want to print
			int Row;  
			
			System.out.print("Enter A Number Of Rows: ");   
			
			// Creating A Scanner Class Object
			Scanner sc = new Scanner(System.in); 
			
			Row = sc.nextInt();
			System.out.println();
			
			//outer loop for rows  
				for(i=0; i<Row; i++)   
					{   
					//inner loop for columns  
						for(j=0; j<=i; j++)   
							{   
							//prints stars
								System.out.print("* ");      
							}   
						//throws the cursor in a new line after printing each line  
								System.out.println();   
					}   
		}   
	}  
