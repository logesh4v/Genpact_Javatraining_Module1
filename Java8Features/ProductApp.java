package Java8Features;
import java.util.*;
import java.util.stream.Collectors;

public class ProductApp {
	public static void main (String args[])
	{
		List<Product> products=List.of(
           new Product("Laptop","Electronis",40000.00),
           new Product("Headphone","Electronis",2000.00),
           new Product("iphone","Electronis",50000.00),
           new Product("Shoe","Footwear",4500.00));
		
		
		products.forEach(product -> product.setName(product.getName().toUpperCase()));
           
           
		List<Product> filteredProducts=products.stream().filter(product->product.getPrice()>5000.00 && product.getPrice<=5000).collect(Collectors.toList());
		
		List<Product> sortedProducts=products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
		
		System.out.println(filteredProducts);
		sortedProducts.forEach(product->System.out.println(product));
		
		
		
		
		
		double averagePrice = products.stream().collect(Collectors.averagingDouble(Product::getPrice));

		
		 System.out.println("\nAverage Price: " + averagePrice);
    
		
		
	
		
				
				
				
				
		
	}

}
