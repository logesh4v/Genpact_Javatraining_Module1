package Colle2;

import java.util.Comparator;

public class CompCategorydiscount implements Comparator<Product2>{
	 
	public int compare(Product2 p1, Product2 p2) {
		// TODO Auto-generated method stub
		// make comparision by discount
				int categoryComparision =p1.category.compareTo(p2.category);
				if(categoryComparision ==0) {
					return Double.compare(p1.prodid,p2.prodid);
				}
				return categoryComparision;
	}
}