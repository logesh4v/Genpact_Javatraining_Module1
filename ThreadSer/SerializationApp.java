package ThreadSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationApp {
	
	public static void main (String[] args)
	{
		Person objP=new Person("Logesh",12345);
		
		try {
			FileOutputStream file=new FileOutputStream("Person.ser");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(objP);
			out.close();
			file.close();
			
			System.out.println("Serialized");	
		}
		catch(IOException e)
		
		{
		System.out.println("Exception Caught-"+e.getMessage());	
		}
		
	}

}
