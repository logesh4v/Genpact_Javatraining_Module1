package ThreadSer;
import java.io.*;

public class DeserializationApp {
	public static void main(String args[])
	{

		try {
			FileInputStream file=new FileInputStream("person.ser");
			ObjectInputStream in =new ObjectInputStream(file);
			
			Person person =(Person) in.readObject();
			in.close();
			file.close();
			System.out.println("Deserialized-"+person);
			
			
		}
		catch(IOException  | ClassNotFoundException e)
		{
			System.out.println("Exception caught-"+e.getMessage());
		}
		
		
		
		
	}
	
}
