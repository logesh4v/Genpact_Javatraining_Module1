package Collection1;

import java.util.*;
 
 
 
public class ShoppingCart {
	private static final Product newProd = null;
	//cart: collection -> ArrayList -> adding object of Product type
//	private ArrayList<Product> cart = new ArrayList<>();
//	private PriorityQueue<Product> cartt = new PriorityQueue<>(Collections.reverseOrder());
//	private TreeSet<Product> cart = new TreeSet<>(new ComparingCategoryPrice());	
//	private TreeSet<Product> cart2 = new TreeSet<>(new ComparingNamePrice());
//	private TreeSet<Product> cart3 = new TreeSet<>(new ComparingCategoryId());
	private ArrayDeque<Product> cart = new ArrayDeque<>();	
	private Map<Integer,Product>cart2 =new HashMap<>();
	
//	private PriorityQueue<Product> cart2 = new PriorityQueue<>(Collections.reverseOrder());
//	private PriorityQueue<Product> cart3 = new PriorityQueue<>(Collections.reverseOrder());
	private Scanner sc = new Scanner(System.in);

	//add product Method
	public void addProduct() {
		System.out.println("Enter product id: ");
		int id = sc.nextInt();
		System.out.println("Enter product name: ");
		String name = sc.next();
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println("Enter product category: ");
		String category = sc.next();
		//adding product to cart: predefined add() method
		cart.add(new Product(id, name, price, category));
		
		cart2.put(id, newProd);
		for(Product Product:cart2.values()
				) {
			
		}
		System.out.println("Product added to cart");
	}
	//remove product Method
		public void removeProduct() {
			System.out.println("Enter Product Id to Remove Product: ");
			int id = sc.nextInt();
			//removing product from cart: removeIf method
			boolean removed = cart.removeIf(product -> product.prodId == id ); // concise way of writing smaller function
			if(removed) {
				System.out.println("Product with id" + id + " removed from cart");
			}
			else {
				System.out.println("Product with id " + id + " not found");
			}
		}

		//search product
		public void searchProduct() {
			System.out.println("Enter product name to search: ");
			String name = sc.next();
			for(Product product: cart) {
				if(product.prodName.equalsIgnoreCase(name)) {
					System.out.println("Product with name " + name + " found");
					return;
				}
			}
			System.out.println("Product not found");
		}

		//checkout 
		public void checkOut() {
			double totalPrice = 0.0; //totalbill
			double totalToBePaid = 0.0;
//			double discount = 0;
//			for(Product product: cart) {
//				totalPrice += product.prodPrice;
//				totalToBePaid += afterDiscount(product);
//			}
//			
			while(!cart.isEmpty()) {
				Product p = cart.poll();
				totalToBePaid += afterDiscount(p);
				totalPrice += p.prodPrice;
//				System.out.println("Discount applied on " + p.prodName + " is :" + discount);
			}
			System.out.println("-------------------");
			System.out.println("Total price before discount: " + totalPrice);
			System.out.println("Total price to be paid: " + totalToBePaid);
//			cart.clear();
			System.out.println("Checkout complete. Cart is empty");
			System.out.println("-------------------");
		}

		//discount
		public double afterDiscount(Product product) { //returns new price to be paid
				if(product.prodCategory.equalsIgnoreCase("electronics")) {
					double discount = 0.2 * product.prodPrice;
					double newPrice = product.prodPrice - discount;
					return newPrice;
				}
				else if(product.prodCategory.equalsIgnoreCase("grocery")) {
					double discount2 = 0.05 * product.prodPrice;
					double newPrice = product.prodPrice - discount2;
					return newPrice;				
				}
				else if(product.prodCategory.equalsIgnoreCase("footwear")) {
					double discount2 = 0.1 * product.prodPrice;
					double newPrice = product.prodPrice - discount2;
					return newPrice;				
				}
				else if(product.prodCategory.equalsIgnoreCase("apparel")) {
					double discount2 = 0.15 * product.prodPrice;
					double newPrice = product.prodPrice - discount2;
					return newPrice;				
				}
			return product.prodPrice;
		}

 
		//displayALL
		public void displayCart( ) {
			if(cart.isEmpty()) {
				System.out.println("Cart is empty");
			}
			else { 
				for(Product product: cart) {        //to use index: use cart.get().prodName
//					if(product.)
					System.out.println("----------------------");
//					System.out.println("Product Name: " + product.prodName);
//					System.out.println("Product Id: " + product.prodId);
//					System.out.println("Product Price: " + product.prodPrice);
					System.out.println(product);
					System.out.println("New product price: " + afterDiscount(product));
					System.out.println("----------------------");
				}
			}
		}

		public void cartComparison() {
			System.out.println("Kindly select your cart");
		    System.out.println("Press 1 : Cart1 (Compare CategoryPrice)");
		    System.out.println("Press 2 : Cart2 (Compare NamePrice)");
		    System.out.println("Press 3 : Cart3 (Compare CategoryId)");
 
		   
		    int choice = sc.nextInt();
 
		    switch (choice) {
		        case 1:
		        	ShoppingCart cart1 = new ShoppingCart();
		        	cart1.menu();
		            break;
		        case 2:
		        	ShoppingCart cart2 = new ShoppingCart();
		        	cart2.menu();
		            break;
		        case 3:
		        	ShoppingCart cart3 = new ShoppingCart();
		        	cart3.menu();
		            break;
		        default:
		            System.out.println("Invalid Choice. Enter from 1-3.");
		       }
 
		}

		public void menu() {
			while (true) {
				System.out.println("Ecommerce Application");
				System.out.println("Press 1: Add Product");
				System.out.println("Press 2: Remove Product");
				System.out.println("Press 3: Search Product");
				System.out.println("Press 4: Checkout");
				System.out.println("Press 5: Display Cart");
				System.out.println("Press 6: Exit");
				int choice = sc.nextInt();
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
						displayCart();
						break;
				case 6:
						System.out.println("Exiting from system!");
						sc.close();
						return;
				default:
						System.out.println("Invalid Choice. Enter no. from 1 to 6");
				}
			}
		}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		cart.menu();

//		cart.cartComparison();
 
	}
}
