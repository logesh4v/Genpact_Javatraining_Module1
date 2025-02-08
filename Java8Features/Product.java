package Java8Features;

public class Product {
	public static final int getPrice = 0;
	String name;
	String category;
	Double price;
	
	public Product(String name,String category,Double price)
	{
	     super();
		this.name=name;
		this.category=category;
		this.price=price;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product_ [name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}
