package Colle2;

import java.util.Comparator;

public class ComparingCategoryPrice implements Comparator<Product2>{
	 
	@Override
	public int compare(Product2 p1, Product2 p2) {
		// TODO Auto-generated method stub
		//first make comparision by category
		int categoryComparision =p1.category.compareTo(p2.category);
		if(categoryComparision ==0) {
			return Double.compare(p1.productPrice,p2.productPrice);
		}
		return categoryComparision;
	}
}