package lab;
//Java program to Demonstrate on FileOutputStream.

//importing required packages.
import java.io.FileOutputStream;  

class FileOutputStreamExample
{  
  public static void main(String args[])
  {    
  //Try block to check if exception occurs
  try
  {  
  //Creating an output stream object to create a file
  FileOutputStream fout=new FileOutputStream("D://OM File.txt");
         
  //Writing into the file
  String s="Python is an integrated language"; 
           
  //converting string into byte array
  byte b[]=s.getBytes();    
  fout.write(b);    
  fout.close();    
  System.out.println("Data entered Sucessfully");    
  }
        
  //Catch block to handle if error is occurs
  catch(Exception e)
  {
      	 
  //Printing the Exception
  System.out.println(e);
  }    
  }    
}