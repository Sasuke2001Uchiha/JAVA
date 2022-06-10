package lab;
//Java program to Demonstrate on FileInputStream.

//Importing required packages.
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample 
{
 public static void main(String args[]) throws IOException
 {
    //Creating a FileInputStream object
    FileInputStream inputStrm = new FileInputStream("D://IBM.txt");
    DataInputStream inst = new DataInputStream(inputStrm);  
    int count = inputStrm.available();  
    
    //Creating a byte array
    byte[] ary = new byte[count];  
   
    //Reading data into the byte array
    int numByte = inputStrm.read(ary );
    inst.read(ary);  
    for (byte b : ary) {  
        char a = (char) b;
    
        //Printing the content of the created file
        System.out.print(a);  
      }  
    }  
  }  