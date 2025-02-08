package Collection;


import java.util.*;

class Product {
    int prodID;
    String prodName;
    double productprice;
    String category;

    public Product(int prodID, String prodName, double productprice, String category) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.productprice = productprice;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + prodID + ", Name: " + prodName + ", Price: " + productprice + ", Category: " + category;
    }
}

public class test {

    private ArrayList<Product> cart = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addproducts() {
        System.out.println("Enter the product ID:");
        int id = scanner.nextInt();

        System.out.println("Enter the product Name:");
        String name = scanner.next();

        System.out.println("Enter the product Price:");
        double price = scanner.nextDouble();

        System.out.println("Enter the product Category (electronics, apparel, grocery, footwear):");
        String category = scanner.next();

        cart.add(new Product(id, name, price, category));
        System.out.println("Product " + name + " added to the cart.");
    }

    public void removeProduct() {
        System.out.println("Enter product ID to remove product:");
        int id = scanner.nextInt();
        boolean removed = cart.removeIf(product -> product.prodID == id);

        if (removed) {
            System.out.println("Product with ID " + id + " removed.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void searchProduct() {
        System.out.println("Enter product Name to search:");
        String name = scanner.next();

        for (Product product : cart) {
            if (product.prodName.equalsIgnoreCase(name)) {
                System.out.println("Product " + name + " found: " + product);
                return;
            }
        }
        System.out.println("Product " + name + " not found.");
    }

    public void applyDiscount() {
        for (Product product : cart) {
            if (product.category.equalsIgnoreCase("electronics")) {
                product.productprice *= 0.90; // 10% discount
            } else if (product.category.equalsIgnoreCase("grocery")) {
                product.productprice *= 0.95; // 5% discount
            }
        }
    }

    public void checkout() {
        applyDiscount();
        double totalBill = 0;
        for (Product product : cart) {
            totalBill += product.productprice;
        }
        System.out.println("Total price to be paid: INR " + totalBill);
        cart.clear();
        System.out.println("Checkout complete. Cart is empty.");
    }

    public void display() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product product : cart) {
                System.out.println(product);
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Shopping Menu");
            System.out.println("Press 1 - Add Product");
            System.out.println("Press 2 - Remove Product");
            System.out.println("Press 3 - Search Product");
            System.out.println("Press 4 - Checkout");
            System.out.println("Press 5 - Display Products in Cart");
            System.out.println("Press 6 - Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addproducts();
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
                    System.out.println("You exited successfully.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        test cart = new test();
        cart.menu();
    }
}