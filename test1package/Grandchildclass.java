package test1package;

public class Grandchildclass extends SubClass {
    public void testMethods() {
        publicMethod(); // Accessible
        // privateMethod(); // Not accessible
        protectedMethod(); // Accessible
        defaultMethod(); // Accessible
    }
}