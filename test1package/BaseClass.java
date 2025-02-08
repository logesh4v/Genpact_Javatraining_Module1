package test1package;


public class BaseClass {
    public void publicMethod() {
        System.out.println("Public method in BaseClass");
    }

    private void privateMethod() {
        System.out.println("Private method in BaseClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in BaseClass");
    }

    void defaultMethod() {
        System.out.println("Default method in BaseClass");
    }
}