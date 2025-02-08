import java.util.*;

import Collection.ShoppingCart;

public class testtttttttttttttt {
	    private Queue<Product2> cart = new PriorityQueue<>(Collections.reverseOrder());
	    private Scanner sc = new Scanner(System.in);

	    public void addProduct() {
	        System.out.println("Enter product id:");
	        int id = sc.nextInt();
	        System.out.println("Enter product name:");
	        String name = sc.next();
	        System.out.println("Enter product price:");
	        double price = sc.nextDouble();
	        System.out.println("Enter product category:");
	        String category = sc.next();
	        cart.add(new Product2(id, name, price, category));
	        System.out.println("Product " + name + " added to cart");
	    }

	    public void removeProduct() {
	        System.out.println("Enter product id to remove product:");
	        int id = sc.nextInt();
	        boolean removed = cart.removeIf(product -> product.prodid == id);
	        if (removed) {
	            System.out.println("Product with id " + id + " removed from cart");
	        } else {
	            System.out.println("Product with id " + id + " not found");
	        }
	    }

	    public void searchProduct() {
	        System.out.println("Enter product name to search product:");
	        String name = sc.next();
	        for (Product2 product : cart) {
	            if (product.prodName.equalsIgnoreCase(name)) {
	                System.out.println("Product: " + name + " found");
	                return;
	            }
	        }
	        System.out.println("Product: " + name + " not found");
	    }

	    public double discount(String category) {
	        if (category.equalsIgnoreCase("Grocery")) {
	            return 0.05;
	        }
	        if (category.equalsIgnoreCase("electronics")) {
	            return 0.10;
	        }
	        return 0;
	    }

	    public void checkOut() {
	        double totalBill = 0;
	        for (Product2 product : cart) {
	            double dp = discount(product.category);
	            totalBill += product.productPrice;
	            totalBill -= (product.productPrice * dp);
	        }
	        System.out.println("Total price to be paid: INR " + totalBill);
	        cart.clear();
	        System.out.println("Checked out complete. Cart is empty.");
	    }

	    public void display() {
	        if (cart.isEmpty()) {
	            System.out.println("No products in the cart");
	        } else {
	            for (Product2 product : cart) {
	                System.out.println(product);
	                System.out.println("Product Price: " + product.productPrice);
	            }
	        }
	    }

	    public void menu() {
	        while (true) {
	            System.out.println("1. Add product");
	            System.out.println("2. Search product");
	            System.out.println("3. Remove product");
	            System.out.println("4. Display the products");
	            System.out.println("5. Checkout product");
	            int choice = sc.nextInt();
	            switch (choice) {
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
	                    System.out.println("Enter valid choice (1-5)");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();
	        cart.menu();
	    }
	}

	class Product2 implements Comparable<Product2> {
	    int prodid;
	    String prodName;
	    double productPrice;
	    String category;

	    public Product2(int prodid, String prodName, double productPrice, String category) {
	        this.prodid = prodid;
	        this.prodName = prodName;
	        this.productPrice = productPrice;
	        this.category = category;
	    }

	    @Override
	    public int compareTo(Product2 o) {
	        return Integer.compare(this.prodid, o.prodid);
	    }

	    @Override
	    public String toString() {
	        return "Product2{" +
	                "prodid=" + prodid +
	                ", prodName='" + prodName + '\'' +
	                ", productPrice=" + productPrice +
	                ", category='" + category + '\'' +
	                '}';
	    }
	}

	
