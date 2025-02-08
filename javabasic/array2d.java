package javabasic;

public class array2d {
	public static void main (String[] args)
	{
	
	int[][]arr= {{2,4,5},{5,7,6},{8,9,0}};
	System.out.println(arr[1][1]);
	 //for (int i=0;i<arr.length;i++)
	 //{
		// for(int j=0;j<arr[i].length;j++) {
		//	 System.out.print(arr[i][j]+" ");
			 
		// }
		// System.out.println();
		 
		 
		 for(int[]row:arr)
		 {
		 	for(int num:row)
		 	{
		 		System.out.print(num+" ");
		 	}
		 	System.out.println();
		 	
	 }
	
		
}
}
