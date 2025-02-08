package Collection1;

import java.util.Comparator;

public class ComparingCategoryId implements Comparator <Product> {
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		int categoryComparison = p1.prodCategory.compareTo(p2.prodCategory);
		if(categoryComparison == 1) { 
			return Double.compare(p2.prodId, p1.prodId);
		}
		return categoryComparison;
	}
 
}
