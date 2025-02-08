package Collection1;
import java.util.Comparator;

public class ComparingNamePrice implements Comparator <Product> {
		@Override
		public int compare(Product p1, Product p2) {
			// TODO Auto-generated method stub
			int categoryName = p1.prodName.compareTo(p2.prodName); //result is 0 if strings are equal
			if(categoryName == 0) { 
				return Double.compare(p2.prodPrice, p1.prodPrice);
			}
			return categoryName;
		}
	 
	}

