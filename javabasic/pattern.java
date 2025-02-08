package javabasic;

public class pattern {
			public static void main(String[] args) {
		    int rows = 8, k = 0;

		    for (int i = 1; i <= rows; ++i, k = 0) {
		      for (int value = 1; value <= rows - i; value++) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		    }
		  }
		}
