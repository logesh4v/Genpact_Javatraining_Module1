package Colle2;

public class Product2 implements Comparable<Product2> {
	 
	int prodid;
	String prodName;
	double productPrice;
	String category;
	public Product2(int prodid, String prodName, double productPrice, String category) {
		super();
		this.prodid = prodid;
		this.prodName = prodName;
		this.productPrice = productPrice;
		this.category = category;
	}
/*	public double calulateDiscount() {
		double discount =0.0;
		switch(category.toLowercase()) {
		case "electronics":
			discount = productPrice* 0.10;
			break;
		case "apparel":
			discount = productPrice* 0.25;
			break;
		case "grocery":
			discount = productPrice* 0.05;
			break;
		case "footwear":
			discount = productPrice* 0.15;
			break;
		default:
			discount =0.0;
		}
		return discount;
	}
*/
	@Override
	public int hashCode() {
		//return Objects.hash(category, prodName, prodid, productPrice);
		return Integer.hashCode(prodid);
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product2 other = (Product2) obj;
		return prodid == other.prodid; // ensuring uniqueness based on id 
	//	return Objects.equals(category, other.category) && Objects.equals(prodName, other.prodName)
	//			&& prodid == other.prodid
	//			&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice);
	}
 
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodName=" + prodName + ", productPrice=" + productPrice + ",category=" + category+ "]";
	}
	//,discount ="+ calulateDiscount() +" 
	@Override
	public int compareTo(Product2 other) {
		return this.prodName.compareTo(other.prodName);
	//public int compareTo(Product2 other) {
		// TODO Auto-generated method stub
		//return Double.compare(productPrice, other.productPrice);
	}


}

