package javabasic2;
import java.io.DataInputStream;
import java.io.IOException;

public class Test_day2 {
	public static void main (String[] args) throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.print("Enter the number of employees-");
		int noe=Integer.parseInt(dis.readLine());
		
		String[] names=new String[noe];
		String[] add=new String[noe];
		double[][] salary=new double[noe][3];
		double[] ts=new double [noe];
		for (int i=0; i<noe ; i++)
		{
			System.out.print("Employee"+(i+1)+"Name- ");
			names[i]=dis.readLine();
			

			System.out.print("ADDRESS- ");
			add[i]=dis.readLine();
			double totalsalary=0;
			
			for(int month=0;month<3;month++)
			{
				System.out.println("Salary for month"+(month+1)+"-");
				salary[i][month]=Double.parseDouble(dis.readLine());
				totalsalary+=salary[i][month];
			}
			ts[i]=totalsalary;
		}
		System.out.println("Employee salary ");
		System.out.println("Name    Address    month 1    month 2    month 3    Total salary");
		
		
		for (int i=0;i<noe;i++)
		{
			System.out.println(names[i]+"    "+add[i]+"    "+salary[i][0]+"    "+salary[i][1]+"    "+salary[i][2]+"    "+ts[i]);
				
			}
			}
	}
	
	
