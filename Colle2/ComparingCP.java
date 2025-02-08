package Colle2;
import java.util.Comparator;

public class ComparingCP implements Comparator <Product2> {

	@Override
	public int compare(Product2 o1, Product2 o2) {
		int nameComparsion =o1.prodName.compareTo(o2.prodName);
		// TODO Auto-generated method
		if(nameComparsion==0)
		{
			return Double.compare(o2.productPrice, o1.productPrice);
		}
		return nameComparsion;
	}

	
}
