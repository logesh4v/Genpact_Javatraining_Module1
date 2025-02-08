package Testpack2;

import test1package.SubClass;

public class Grandchild2 extends SubClass {
	
	public void testMethods() {
        publicMethod(); // Accessible
        // privateMethod(); // Not accessible
        protectedMethod(); // Accessible
       // defaultMethod(); // Accessible
    }
	
	

}
