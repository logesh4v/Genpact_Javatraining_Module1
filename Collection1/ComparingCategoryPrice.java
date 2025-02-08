package Collection1;

import java.util.Comparator;

public class ComparingCategoryPrice implements Comparator <Product>
{
 
	@Override
//	public int compare(Product p1, Product p2) {
//		// TODO Auto-generated method stub
//		
//		int categoryComparison = p1.prodCategory.compareTo(p2.prodCategory); //result is 0 if strings are equal
//		
//		if(categoryComparison == 0) { 
//			return Double.compare(p2.prodPrice, p1.prodPrice);
//		}
//		return categoryComparison;
//	}
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return Double.compare(p2.prodPrice, p1.prodPrice);
	}
 
	
}