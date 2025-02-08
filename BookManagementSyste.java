

	class Book {
	    private String title;
	    private String author;
	    private int stock;

	    public Book(String title, String author, int stock) {
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
	        return stock;
	    }
	}

	// Child class: PhysicalBook (Extends Book)
	class PhysicalBook extends Book {
	    private String shelfLocation;

	    public PhysicalBook(String title, String author, int stock, String shelfLocation) {
	        super(title, author, stock);
	        this.shelfLocation = shelfLocation;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Shelf Location: " + shelfLocation);
	    }
	}

	// Child class: EBook (Extends Book)
	class EBook extends Book {
	    private double fileSize; // in MB

	    public EBook(String title, String author, int stock, double fileSize) {
	        super(title, author, stock);
	        this.fileSize = fileSize;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("File Size: " + fileSize + "MB");
	    }
	
}
	
	
public class BookManagementSyste {
    public static void main(String[] args) {
        PhysicalBook book1 = new PhysicalBook("Java Basics", "James Gosling", 3, "Aisle 5");
        EBook ebook1 = new EBook("Advanced Java", "John Doe", 5, 2.5);

        // Display book details
        book1.displayInfo();
        ebook1.displayInfo();

        // Issue & Return books
        book1.issueBook();
        book1.returnBook();
        ebook1.issueBook();

        // Display updated stock
        System.out.println("Updated Stock: " + book1.getStock());
    }
}
