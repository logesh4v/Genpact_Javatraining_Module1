package Collection;

import java.util.*;



public class ShoppingCart {

	
	//try with vector 
	//product class--category --electronics,apparel,grocery,footwear)-->constrctor ,to string
	//modify add product to ask for cateogy
	//add once more method --discount() based on the eletrics with 10 percent of offer and groccery of 5 percent
	//checkout price after discount
	
	
private ArrayList<Product> cart= cart=new ArrayList<>();
private Scanner scanner=new Scanner(System.in);



public void addproducts(Scanner scanner2)
{
	
	
	
	
	System.out.println("Press 1: Eletronics");
	System.out.println("Press 2: Apparel");
	System.out.println("Press 3: Grocery");
	System.out.println("Press 4: FootWear");
	int choice = scanner.nextInt();
	switch (choice) {
	case 1: 
		add(scanner2);
		applyDiscount();
			break;
	case 2:
		add(scanner2);
		applyDiscount();
			break;
	case 3:
		add(scanner2);
		applyDiscount();
			break;
	case 4: 
		add(scanner2);
		applyDiscount();
			break;
	default:
			System.out.println("Invalid Choice. Enter no. from 1 to 4");
	}
	
	
}

public void add(Scanner scanner2)

{
	System.out.println("Enter the product ID");
	int id =scanner.nextInt();
	
	System.out.println("Enter the product Name");
	String name =scanner.next();
	
	System.out.println("Enter the product Price");
	double price =scanner.nextDouble();
	
	
	cart.add(new Product(id,name,price, name));
	System.out.println("Product-"+name+"Added to the cart");
	}


public void removeProduct(Scanner scanner2)
{
	System.out.println("Enter product ID to remove product:");
	int id=scanner.nextInt();
	boolean removed=cart.removeIf(product->product.prodid==id);
	


if(removed==true)
{
	System.out.println("Product with ID"+id+"Removed");
	
}

else
{
	System.out.println("product with ID"+id+"not found");
	}
}


public void searchProduct(Scanner scanner2)
{
	System.out.println("Enter product Name to search-");
	String name=scanner.next();
	
	for (Product product:cart)
	{
		if(product.prodName.equalsIgnoreCase(name))
		{
			System.out.println("Products--"+name+"Found");
			return;
		}
		System.out.println("Product-"+name+"Not found");
	}
	}
	
	
	public void checkout()
	{
		
		double totalBill=0;
		for(Product product:cart)
		{
			totalBill+=product.productPrice;
		}
		System.out.println("Total price to be paid:INR"+totalBill);
		cart.clear();
		System.out.print("Checkout complete.cart is empty");
		

	}
	
	
	 public void applyDiscount() {
	        for (Product product : cart) {
	            if (product.category.equalsIgnoreCase("electronics")) {
	                product.productPrice *= 0.90; // 10% discount
	            } else if (product.category.equalsIgnoreCase("grocery")) {
	                product.productPrice *= 0.95; // 5% discount
	            }
	        }
	    }

	
	
	
	public void display() {
		if(cart.isEmpty()){
			System.out.println("Cart is Empty");
		}
		else {
		for(Product product :cart) {
			System.out.println("Product Name"+product.prodName);
			System.out.println("Product Id"+product.prodid);
			System.out.println("Product Price"+product.productPrice);
		}
		}
	}
	
	//display 
	//id cart empty no products in cart-cart.isempty()
	//Nonempty--for loop to display all products
	
	
	//create the menu 
	public void menu()
	{
	
		while(true)
		{System.out.println("Shopping Menu");
		System.out.println("Press 1 -Add Poduct ");
		System.out.println("Press 2 - Remove Poduct");
		System.out.println("Press 3 - Search Product");
		System.out.println("Press 4 -  Check out");
		System.out.println("Press 5 -To display products in stock");
		System.out.println("Press 6 - Exit");				
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			 addproducts(scanner);
			break;
		case 2:
			removeProduct(scanner);
			break;
		case 3:
			searchProduct(scanner);
			break;
		case 4:
			checkout();
			break;
		case 5:
			display();
			break;
			
		case 6:
			System.out.println("You exited successfully");
			scanner.close();
			return;
		default:
			System.out.println("Enter valid option");
		}
	}
}
			
			
			
			

	
	
	public static void main(String[] args)
	{
		ShoppingCart cart=new ShoppingCart();
		cart.menu();
		
		
		
		
	}







}
