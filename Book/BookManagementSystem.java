package Book;

import java.util.Scanner;

class Books {
    private String title;
    private String author;
    private int stock;

    public Books(String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public void issueBook() {
        if (stock > 0) {
            stock--;
            System.out.println("Issued: " + title);
        } else {
            System.out.println("Out of stock: " + title);
        }
    }

    public void returnBook() {
        stock++;
        System.out.println("Returned: " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Stock: " + stock);
    }

    public int getStock() {
        return stock;             //getter
    }
}

// Child class;PhysicalBook
class PhysicalBooks extends Books {
    private String shelfLocation;

    public PhysicalBooks(String title, String author, int stock, String shelfLocation) {
        super(title, author, stock);
        this.shelfLocation = shelfLocation;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shelf Location: " + shelfLocation);
    }
}

// Child class: EBook
class EBooks extends Books {
    private double fileSize; // in MB

    public EBooks(String title, String author, int stock, double fileSize) {
        super(title, author, stock);
        this.fileSize = fileSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + "MB");
    }
}

public class BookManagementSystem
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Physical Book Details:");
        System.out.print("Title: ");
        String pTitle = scanner.nextLine();
        System.out.print("Author: ");
        String pAuthor = scanner.nextLine();
        System.out.print("Stock: ");
        int pStock = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Shelf Location: ");
        String pShelf = scanner.nextLine();

        PhysicalBook physicalBook = new PhysicalBook(pTitle, pAuthor, pStock, pShelf);

       
        System.out.println("\nEnter E-Book Details:");
        System.out.print("Title: ");
        String eTitle = scanner.nextLine();
        System.out.print("Author: ");
        String eAuthor = scanner.nextLine();
        System.out.print("Stock: ");
        int eStock = scanner.nextInt();
        System.out.print("File Size (MB): ");
        double eFileSize = scanner.nextDouble();

        EBook ebook = new EBook(eTitle, eAuthor, eStock, eFileSize);

        // Display book details
        System.out.println("\nBook Information:");
        physicalBook.displayInfo();
        ebook.displayInfo();

        /* 
        System.out.println("\nIssuing a Physical Book...");
        physicalBook.issueBook();
        System.out.println("Returning a Physical Book...");
        physicalBook.returnBook();*/

        System.out.println("\nIssuing an E-Book...");
        ebook.issueBook();

        // Display updated stock
        System.out.println("\nUpdated Stock:");
        physicalBook.displayInfo();
        ebook.displayInfo();

        scanner.close();
    }
}