package Array;
// Java program to take input from user
// To print single dimensional array
import java.util.*;

class ScannerSingleDimensionalArray {

	public static void main(String[] args) {
      
		// length of array
		int len;
		Scanner sc = new Scanner(System.in);
		
		// Printing array
		System.out.println("enter array length:");
        len = sc.nextInt();
	
	    int a[]=new int[len];
	    System.out.println("enter " + len + " element to store in array \n:");
	
	    for(int i=0; i<len; i++) {
	    	a[i]=sc.nextInt();
	    }	
	    System.out.println("Elements in array are \n");
	    for(int i=0; i<len; i++) {
	    	System.out.print(a[i]+" ");
	    }
	    }
	}


