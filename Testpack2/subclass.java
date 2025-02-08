package Testpack2;

import test1package.BaseClass;


public class subclass extends BaseClass {
    public void testMethods() {
        publicMethod(); // Accessible
        // privateMethod(); // Not accessible
        protectedMethod(); // Accessible because it's inherited
        // defaultMethod(); // Not accessible
    }
}