package javabasic2;

import java.io.IOException;

public class arr3d {
	public static void main (String[]args) throws IOException
	{
		int i1;
		int[][][] arr3d = {
	             {
	              {1,2,3,4},
                 {5,6,7,8},
                 {1,3,5,7} 			                  
	             } ,
	             {
	               {1,2,3,4},
	               {5,6,7,8},
	               {1,3,5,7}
	             }
	             
              };
		
		
		
		for (i1=0; i1<arr3d.length; i1++) { 
	
		
		for(int j=0; j < arr3d[i1].length ; j++) {
			
			for(int k=0; k <arr3d[i1][j].length ; k++) {
				
				System.out.print(arr3d[i1][j][k]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}

	



for(int[] row : arr) {
	for(int num : row ) {
		System.out.print(num + " ");
	}
	System.out.println();
}
	}
}
	
