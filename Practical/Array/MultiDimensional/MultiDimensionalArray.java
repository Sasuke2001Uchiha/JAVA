package Array;
// Java program for multi dimensonal array

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		// declaring and initialising multi dimensional array
		int x[][]={{2,7,9},{5,8,6},{1,4,3}};

		// printing array
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
				System.out.print(x[i][j]+" ");
		
			System.out.println();
			
			}
		}
	}