package Collection1;
import java.util.*;

public class Test {
	public static void main (String args[])
	{
//		Queue<Integer> number=new PriorityQueue<>();
//		number.add(6);
//		number.add(2);
//		number.add(3);
		
		
		ArrayDeque<String> numberString=new ArrayDeque<>();
		numberString.add("Hello");
		numberString.add("Abc");
		
		numberString.addFirst("A");
		numberString.addLast("L");
		
//		while (!number.isEmpty())
//		{
//			System.out.println(number.poll());
//		}
		
		
		while(!numberString.isEmpty())
		{
			System.out.println(numberString.poll());
		}
		
//		while(numberString.isEmpty())
//		{
//			System.out.println(number.poll());
//		}
//		
	}

}
//internally--comparable interface
//Assigning-invest value--highest priority