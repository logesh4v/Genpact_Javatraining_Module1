package test1package;


public class SubClass extends BaseClass {
    public void testMethods() {
        publicMethod(); // Accessible
        // privateMethod(); // Not accessible
        protectedMethod(); // Accessible
        defaultMethod(); // Accessible
    }
}