package javabasic;
import java.util.Scanner;  
	  
public class fact_while { 
	
	public static void main(String[] args) 
	{  
	          
	        int fact = 1;  
	        int i = 1;
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter a number");  
	        int num = sc.nextInt();
	        
	        while( i <= num ){  
	            fact = fact * i;   
	            i++;  
	        }     
	 
	        System.out.println("Factorial= "+ fact);  
	        sc.close();
	    }  
	}  
          
	          
	  
	  
