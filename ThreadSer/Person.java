package ThreadSer;


import java.io.Serializable;

 
public class Person implements Serializable{
    private String name;
    private int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
}
