package javabasic2;
import java.io.DataInputStream;
import java.io.IOException;

public class Test_2d {
	public static void main (String[]args) throws IOException
	{
		DataInputStream dis =new DataInputStream (System.in);
		int stu =4;
		int sub=3;
		int i ;
		
		int[][]mark=new int[stu][sub];
		
		for (i=0;i<stu;i++)
		{
			System.out.println("Enter marks for students"+(i+1));
			
			for(int j=0;j<sub;j++)
			{
				System.out.print("Subjects"+(j+1));
				mark[i][j]=Integer.parseInt(dis.readLine());
				
			}
		}
		System.out.println("Students percentage");
		
		for (i=0;i<stu;i++)
		{
			int total=0;
			for (int j=0;j<sub;j++)
			{
				total+=mark[i][j];
			}
			double percent =total/sub;
		}
		System.out.println("Student"+(i + 1)+"Percentage-"+ percent );
		
	}

	}
	
	
