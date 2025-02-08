package Colle2;
import java.util.*;
 
/*public class Shoppingcart2 {
	//try with vector
	//product class -> category ->(electronics, apparel, grocery, footwear)
	//add discount() ->based on category  electronics ->10%. groceries -> 5%
	//change display() -> toString
	//checkout()-> add it after discount
	//cart -> collection -> ArrayList -> adding objects of product type
	//private Vector<Product> cart = new Vector<>();
	private TreeSet<Product2> cart = new TreeSet<>(new  ComparingCP());
	private TreeSet<Product2> cart2 = new TreeSet<>(new  CompCategorydiscount());
	private TreeSet<Product2> cart3 = new TreeSet<>(new  ComparingCategoryPrice());

	
	
 
	//private LinkedList<Product> cart = new LinkedList<>();
	//private ArrayList<Product> cart = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	
	//private TreeSet<Product2> cart2;
	
	
	
	
	//add a product
	private void addProduct() {
	System.out.println("Enter Product Id") ;
	int id = scanner.nextInt();
	System.out.println("Enter Product Name") ;
	String name = scanner.next();
	System.out.println("Enter Product price") ;
	double price = scanner.nextDouble();
	System.out.println("Enter Product category") ;
	String category = scanner.next();
	//add -> add() methods associated with arrayList	
	cart.add(new Product2(id, name, price, category));
	//cart.
	System.out.println("Product " + name+"add to cart");
}
	//remove product
	public void removeProduct() {
		System.out.println("Enter Product Id to remove product");
		int id = scanner.nextInt();
		//id -> true -> product present, false -> product not there
		//cart -> remove()
		//product.id == id
		boolean removed = cart.removeIf(product -> product.prodid == id);
		if(removed ==true) {
			   System.out.println("Product with Id:"+ id+"removed from cart");
 
		}
		else {
			   System.out.println("Product with Id:"+ id+"not found");
 
		}
	}  
	public void searchProduct() {
		System.out.println("Enter Product Id to search for product");
		String name = scanner.next();
		for(Product2 product : cart) {
			if(product.prodName.equalsIgnoreCase(name)){
				System.out.println("Product :"+name+"found");
				return;
			}
		}
		System.out.println("Product : "+ name + " not found");
	}
		//id -> true -> product present, false -> product not there
		//cart -> remove()
		//product.id == id
	public double discount(String category) {
		if(category.equalsIgnoreCase("grocery")) {
			return 0.05;
		}
		if(category.equalsIgnoreCase("electronics")) {
			return 0.10;
		}
		if(category.equalsIgnoreCase("apparel")) {
			return 0.25;
		}
		if(category.equalsIgnoreCase("footwear")) {
			return 0.15;
		}
		return 0;
	}


	public void checkOut() {
		double totalBill =0;
		for(Product2 product : cart) {
			double dp=discount(product.category);
			totalBill += product.productPrice;
			totalBill -= (product.productPrice*dp);
		}
		System.out.println("Total Price to be paid: INR" + totalBill);
		cart.clear();
		System.out.println("Checkout Complete. Cart is empty.");
	}  
	//display
	//if cart -> empty -> No products in cart -> cart.isEmpty()
	//not empty -> for loop to display all prods
	public void display() {
		if(cart.isEmpty()){
			System.out.println("Cart is Empty");
		}
		else {
			for(Product2 product :cart) {
				System.out.println("Product Name-"+product.prodName);
				System.out.println("Product Id-"+product.prodid);
				System.out.println("Product Price-"+product.productPrice);
			}
		}
	}
	//menu
	public void menu() {
		while(true) {
			System.out.println("Press 1: Add Product-");
			System.out.println("Press 2: Remove Product");
			System.out.println("Press 3: Search Product");
			System.out.println("Press 4: CheckOut");
			System.out.println("Press 5: Display");
			System.out.println("Press 6: choice");
			System.out.println("Press 7: Exit");
 
 
			int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    checkOut();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                	choice();
                	break;
                	
                case 7:
                    System.out.println("Exiting from system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Enter a number from 1 to 5");
            }
			//read choice
			//switch case ->
		}
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Shoppingcart2 cart = new Shoppingcart2();
	       Shoppingcart2 cart2 = new Shoppingcart2();
	       Shoppingcart2 cart3 = new Shoppingcart2();
	       
	    		System.out.println("Enter your comparision choice");
	    		int choice1=scanner.nextInt();
	    		switch (choice1) {
	    		case 1:
	    			System.out.println("Compare by category and Price");
	    		    cart = new TreeSet<>(new ComparingCategoryPrice());
	    			break;
	    		case 2:
	    			System.out.println("Compare by category and Id");
	    		    cart2 = new TreeSet<>(new CompCategorydiscount());
	    			break;
	    		case 3:
	    			System.out.println("Compare by Name and Price");
	    			cart3 = new TreeSet<>(new ComparingCP());
	    			break;
	    		default:
	    			System.out.println("Invalid Choice");
	    		}	
	    	}
	       cart.menu();
	       cart2.menu();
	       cart3.menu();
	       
	       //menu ->

	}
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;
 
public class Shoppingcart2 {
	//cart->collections -> Arraylist ->adding objects of product type
	//try with vector
	//product class-> category->electronics,apparel,grocery,footware->constructor,toString
	//modify addProduct()->category
	//add one more method->discount()->based on category-> e->10%,gr->5%
	//change display()->toString,don't use print statements
	//checkOut() -> after discount
	//private TreeSet<Product> cart=new TreeSet<>(new ComparingCategoryId());
	private Scanner sc=new Scanner(System.in);
	private static TreeSet<Product2> cart2;
	//ask from user-switch case
	//1,2,3
	//1-> cart=new TreeSet<>(new ComparingCategoryPrice())
	//modify addProduct()->category
	public void addProduct() {
		System.out.println("enter product id:");
		int id=sc.nextInt();
		System.out.println("enter product name:");
		String name=sc.next();
		SZ/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////ystem.out.println("enter product price:");
		double price=sc.nextDouble();
		System.out.println("enter product category:");
		String category=sc.next();
		//add -> add() methods associated with arraylist
		cart2.add(new Product2(id,name,price,category));
		//cart.
		//cart.
		System.out.println("product :"+name+"added to cart");	
	}
	//remove a cart
	public void removeProduct() {
		System.out.println("enter product id to remove product:");
		int id=sc.nextInt();
		//id->true->product present,false->product not there
		//cart->remove()
		//product.id==id
		boolean removed = cart2.removeIf(product->product.prodid==id); //concise way of writing smaller function
		if(removed==true) {
			System.out.println("product with id"+id+"removed from cart");
		}
		else {
			System.out.println("product with id"+id+"not found");
		}
	}
	//search product
	public void searchProduct() {
		System.out.println("enter product name to search product:");
		String name=sc.next();
		for(Product2 product:cart2) {
			if(product.prodName.equalsIgnoreCase(name)) { //first occurence of the product
				System.out.println("product:"+name+"found");
				return;
			}
		}
		System.out.println("product :"+name+"found");
	}
	 public double discount(String category) {
			if(category.equalsIgnoreCase("Grocery")) {
				return 0.05;
			}
			if(category.equalsIgnoreCase("electronics")) {
				return 0.10;
			}
			return 0;
		}
	//checkout->cart how many items are there->total amount->display->after empty the cart
	public void checkOut() {
		double totalBill=0;
		for(Product2 product:cart2) {
			double dp=discount(product.category);
			totalBill += product.productPrice;
			totalBill -= (product.productPrice*dp);
		}
		System.out.println("total price to be paid : INR "+totalBill);
		cart2.clear();
		System.out.println("checked complete.cart is empty. ");
	}
	//change display()->toString,don't use print statements
	public void display() {
		if(cart2.isEmpty()) {
			System.out.println("No products in the cart");
		}
		else {
			for(Product2 product:cart2) {
				System.out.println(product);
				System.out.println("Product Price"+product.productPrice);
			}
		}
	}
//	
	//display 
	//if cart-> empty->display no products in cart->cart.isEmpty()
	//not empty->for loop to display all products
	//create menu method
	public void menu() {
		while(true) {
			System.out.println("1.Add product");
			System.out.println("2.search product");
			System.out.println("3.remove product");
			System.out.println("4.display the products");
			System.out.println("5.checkout product");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addProduct();
				break;
		    case 2:
			     searchProduct();
			     break;
		    case 3:
				   removeProduct();
				   break; 
		    case 4:
				   display();
				   break;
		    case 5:
				   checkOut();
				   break;
		    default:
		    	System.out.println("Enter valid choice (1-6)");
		}
			//read choice
			//switch case ->
		}
	}
	public static void main(String[] args) {
		Shoppingcart2 cart=new Shoppingcart2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of comparator");
		System.out.println("Press 1: Comparing Category and Price");
		System.out.println("Press 2: Comparing Name and Price");
		System.out.println("Press 3: Comparing Category and Id");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			cart2 = new TreeSet<>(new ComparingCategoryPrice());
			break;
		case 2:
			cart2 = new TreeSet<>(new ComparingCategoryPrice());
			break;
		case 3:
			cart2  = new TreeSet<>(new ComparingCP());
			break;
		default:
			System.out.println("Enter valid choice!");
		}
		cart.menu();
		// create menu ->
	}
}



	
	
	
	
	 
	
	 
	