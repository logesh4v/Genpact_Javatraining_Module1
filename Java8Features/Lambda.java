package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Maths
{
	int operate(int a,int b);
	}

public class Lambda {
	public static void main(String[] args)
	{
		Maths add=(a,b)->a+b;
		System.out.println(add.operate(30, 70));
		
		
		Maths sub=(a,b)->a-b;
		System.out.println(sub.operate(40, 600));
		
		List<String> names=Arrays.asList("name1","name2","name3");
		List<String> names2=new ArrayList<>();
		List<Integer> numbers=List.of(1,2,3,4,4,5,6,7,8,9,10);
		List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> incNumbers =numbers.stream().map(n -> n+10).collect(Collectors.toList());
		
		int resultsum= numbers.stream().map(n->n*2).mapToInt(Integer::intValue).sum();
		
		System.out.println(resultsum);
		
		
		names2.add("Java");
		names2.add("Traning");
		
		
		names.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(names);
		System.out.println(evenNumbers);
		System.out.println(incNumbers);
		
		names2.forEach(name->System.out.println(name));
		
		
	}
	

}
