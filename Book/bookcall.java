package Book;
import java.util.Scanner;

public class bookcall {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        Book book1 = new Book("2 States", "cb", "ISBN12345");
	        Book book2 = new Book("half girl friend", "cb", "ISBN6789");

	      
	        book1.displayDetails();
	        book2.displayDetails();

	       
	        book1.borrowBook();
	        book1.displayDetails();

	       
	        book1.returnBook();
	        book1.displayDetails();

	        System.out.println("\nEnter new book details:");
	        System.out.print("Title: ");
	        String title = scanner.nextLine();
	        System.out.print("Author: ");
	        String author = scanner.nextLine();
	        System.out.print("ISBN: ");
	        String ISBN = scanner.nextLine();

	        Book book3 = new Book(title, author, ISBN);
	        book3.displayDetails();

	        scanner.close();
	    }
	}


