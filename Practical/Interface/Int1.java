package Interface;
//Java program to demonstrate working of
//interface

import java.io.*;

//A simple interface
interface Int1 {
 
 // public, static and final
 final int a = 10;

 // public and abstract
 void display();
}

//A class that implements the interface.
class TestClass implements Int1 {
 
 // Implementing the capabilities of
 // interface.
 public void display(){
 System.out.println("Onkar");
 }

 // main method
 public static void main(String[] args)
 {
     TestClass t = new TestClass();// Creating object of test class
     t.display();//calling display method using object
     System.out.println(a);
 }
}
