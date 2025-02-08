package Collection;

import java.util.Objects;
/*

public class Product {;
int prodID;
String prodName;
double productprice;
String electronics;
String footwear;
String grocery;
String apparel;
String category;


//public Product (int prodID,String prodName,double productprice)
//{
	
//}
 
/*public Product(String electronics,String footwear,String grocery,String apparel)
{
	super();
	this.electronics=electronics;
	this.footwear=footwear;
	this.grocery=grocery;
	this.apparel=apparel;
	
	



public Product(int prodID, String prodName, double productprice, String category ) 
{
	super();
	this.prodID=prodID;
	this.prodName=prodName;
	this.productprice=productprice;
	this.category = category;
}
/*

@Override
public String toString() {
	return "Product [prodID=" + prodID + ", prodName=" + prodName + ", productprice=" + productprice + "]";
}


@Override
public int hashCode() {
	return Objects.hash(prodID, prodName, productprice);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return prodID == other.prodID && Objects.equals(prodName, other.prodName)
			&& Double.doubleToLongBits(productprice) == Double.doubleToLongBits(other.productprice);
}





@Override
public int hashCode() {
    return Objects.hash(prodID, prodName, productprice, category);
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Product other = (Product) obj;
    return prodID == other.prodID;
}

}
*/
 
public class Product {
 
	int prodid;
	String prodName;
	double productPrice;
	String category;
	public Product(int prodid, String prodName, double productPrice, String category) {
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
		Product other = (Product) obj;
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

}
