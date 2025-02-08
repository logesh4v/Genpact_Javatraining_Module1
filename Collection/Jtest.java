package Collection;
 
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
 
public class Jtest {
 
	
	//cart -> collection -> Arraylist ->add obj of prod type
	//try vector 
	//product - category
	//private ArrayList<Product> cart = new ArrayList<>(); //array
	
	//remove  product
	public void removeProduct() {
		System.out.println("Enter product Id to remove Product");
		int id=Scanner.nextInt();
		//id ->true -> product present
		//product.id ==id
		boolean removed = cart.removeIf(product ->product.prodID ==id);
		if(removed ==true) {
			System.out.println("Product with Id:"+id+"remove from cart");
	    }
		else {
			System.out.println("Product with Id:"+id+"not found");
		}
	}	
	public void searchProduct() {
		System.out.println("Enter prod name to search");
		String name = scanner.next();
		for(Product product : cart) {
			if(product.prodName.equalsIgnoreCase(name)) {
				System.out.println("Product : "+name +"found");
				return;
			}
			System.out.println("Product :"+name+"not found");
		}
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
    //checkout
    public void checkout() {
	double totalBill=0;
	for(Product product:cart) {
		double dp=discount(product.Category);
		totalBill += product.productprice;
		totalBill -= (product.productprice*dp);
	}
	System.out.println("total price to be paid : INR "+totalBill);
	cart.clear();
	System.out.println("checked complete.cart is empty. ");
}
 
	//display
	//if empty -> no prod -cart.isEmpty()
	//not empty ->for loop display all prod
	public void display() {
		if(cart.isEmpty()){
			System.out.println("Cart is Empty");
		}
		else {
		for(Product product :shoppingcart) {
			System.out.println("Product Name"+product.prodName);
			System.out.println("Product Id"+product.prodID);
			System.out.println("Product Price"+product.productprice);
			//product.toString();
		}
		}
	}
	public void menu() {
		while(true) {
			System.out.println("1.Add Product");
			System.out.println("2.Remove Product");
			System.out.println("3.Search Product");
			System.out.println("4.Check Out Product");
			System.out.println("5.Display Product");
			System.out.println("Press 6 - Exit ");
			int choice=scanner.nextInt();
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
		    	 checkout();
				break;		
			case 5:
				display();
				break;
			case 6:
				System.out.println("Application Exit");
				scanner.close();
				return;
			default:
				System.out.println("Enter valid option");
			}
			//read choice
			//switch case
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Jtest cart = new Jtest();
		cart.menu();
	}
 
}
