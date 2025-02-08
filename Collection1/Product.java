package Collection1;

import java.util.Objects;

//public class Product implements Comparable<Product> {
public class Product {
	int prodId;
	String prodName;
	double prodPrice;
	String prodCategory;
	public Product(int prodId, String prodName, double prodPrice, String prodCategory) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodCategory = prodCategory;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodCategory="
				+ prodCategory + "]";
	}

	
	@Override
	public int hashCode() { //unique reference of object
		return Objects.hash(prodId, prodName);
	}

	@Override
	public boolean equals(Object obj) { //Object is super class
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //getClass() returns the runtime class of object
			return false;
		Product other = (Product) obj;
		return prodId == other.prodId && Objects.equals(prodName, other.prodName); //ensuring uniqueness based on id
	}


	
//	@Override
//	public int compareTo(Product other) {
//		
////		return Double.compare(prodPrice, other.prodPrice); //result is 0 if strings are equal
//		return this.prodName.compareTo(other.prodName);	
//	}


	  public int getProdId() {
	        return prodId;
	    }

	    public String getProdName() {
	        return prodName;
	    }

	    public double getProdPrice() {
	        return prodPrice;
	    }

	    public String getProdCategory() {
	        return prodCategory;
	    }

	    public String toString1() {
	        return "Product [ID=" + prodId + ", Name=" + prodName + ", Price=" + prodPrice + ", Category=" + prodCategory + "]";
	    }

	    public int compareTo(Product other) {
	        return Integer.compare(this.prodId, other.prodId);
	    }
	}

