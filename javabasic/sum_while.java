package javabasic;


import java.util.*;

class sum_while{

	public static void main(String[] args)
	{
		int n = 10, sum = 0, i = 1;

		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum is " + sum);
	}
}
