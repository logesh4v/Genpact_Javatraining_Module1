package Collection1;

import java.util.*;
 

public class ShoppingCart3 {
    private static final Product newProd = null;

   
    private Map<Integer, Product> cart1 = new HashMap<>();
    private Map<Integer, Product> cart2 = new LinkedHashMap<>();
    private Map<Integer, Product> cart3 = new TreeMap<>();

    private Scanner sc = new Scanner(System.in);

   
    public void addProduct() {
        System.out.println("Enter product id: ");
        int id = sc.nextInt();
        System.out.println("Enter product name: ");
        String name = sc.next();
        System.out.println("Enter product price: ");
        double price = sc.nextDouble();
        System.out.println("Enter product category: ");
        String category = sc.next();

     
        Product newProd = new Product(id, name, price, category);

      
        cart1.put(id, newProd);
        cart2.put(id, newProd);
        cart3.put(id, newProd);

        System.out.println("Product added to all carts");
    }

    
    public void removeProduct() {
        System.out.println("Enter Product Id to Remove Product: ");
        int id = sc.nextInt();

        // Remove product from all carts
        Product removed1 = cart1.remove(id);
        Product removed2 = cart2.remove(id);
        Product removed3 = cart3.remove(id);

        if (removed1 != null || removed2 != null || removed3 != null) {
            System.out.println("Product with id " + id + " removed from all carts");
        } else {
            System.out.println("Product with id " + id + " not found in any cart");
        }
    }

   
    public void searchProduct() {
        System.out.println("Enter product name to search: ");
        String name = sc.next();

        boolean found = false;
        for (Product product : cart1.values()) {
            if (product.getProdName().equalsIgnoreCase(name)) {
                System.out.println("Product with name " + name + " found in cart1");
                found = true;
                break;
            }
        }
        for (Product product : cart2.values()) {
            if (product.getProdName().equalsIgnoreCase(name)) {
                System.out.println("Product with name " + name + " found in cart2");
                found = true;
                break;
            }
        }
        for (Product product : cart3.values()) {
            if (product.getProdName().equalsIgnoreCase(name)) {
                System.out.println("Product with name " + name + " found in cart3");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in any cart");
        }
    }

    
    public void checkOut() {
        double totalPrice = 0.0; // total bill
        double totalToBePaid = 0.0;

        while (!cart1.isEmpty()) {
            Product p = cart1.values().iterator().next();
            cart1.values().remove(p);
            totalToBePaid += afterDiscount(p);
            totalPrice += p.getProdPrice();
        }
        System.out.println("-------------------");
        System.out.println("Total price before discount: " + totalPrice);
        System.out.println("Total price to be paid: " + totalToBePaid);
        System.out.println("Checkout complete. Cart1 is empty");
        System.out.println("-------------------");
    }

   
    public double afterDiscount(Product product) { 
        if (product.getProdCategory().equalsIgnoreCase("electronics")) {
            double discount = 0.2 * product.getProdPrice();
            double newPrice = product.getProdPrice() - discount;
            return newPrice;
        } else if (product.getProdCategory().equalsIgnoreCase("grocery")) {
            double discount2 = 0.5 * product.getProdPrice();
            double newPrice = product.getProdPrice() - discount2;
            return newPrice;
        } else if (product.getProdCategory().equalsIgnoreCase("footwear")) {
            double discount2 = 0.0 * product.getProdPrice();
            double newPrice = product.getProdPrice() - discount2;
            return newPrice;
        } else if (product.getProdCategory().equalsIgnoreCase("apparel")) {
            double discount2 = 0.0 * product.getProdPrice();
            double newPrice = product.getProdPrice() - discount2;
            return newPrice;
        }
        return product.getProdPrice();
    }

    
    public void displayCart(Map<Integer, Product> cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (Product product : cart.values()) {
                System.out.println("----------------------");
                System.out.println(product);
                System.out.println("New product price: " + afterDiscount(product));
                System.out.println("----------------------");
            }
        }
    }

  
    public void cartComparison() {
        System.out.println("Kindly select your cart");
        System.out.println("Press 1 : Cart1 (HashMap)");
        System.out.println("Press 2 : Cart2 (LinkedHashMap)");
        System.out.println("Press 3 : Cart3 (TreeMap)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayCart(cart1);
                break;
            case 2:
                displayCart(cart2);
                break;
            case 3:
                displayCart(cart3);
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
                    cartComparison();
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
        ShoppingCart3 cart = new ShoppingCart3();
        cart.menu();
    }
}
