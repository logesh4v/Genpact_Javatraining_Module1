package Testpack2;

import test1package.BaseClass;
import test1package.SubClass;
import test1package.Grandchildclass;

public class Main {
	    public static void main(String[] args) {
	        BaseClass base = new BaseClass();
	        base.publicMethod();
	        // base.privateMethod(); // Not accessible
	        // base.protectedMethod(); // Not accessible
	        // base.defaultMethod(); // Not accessible

	        SubClass sub = new SubClass();
	        sub.publicMethod();
	        // sub.privateMethod(); // Not accessible
	        //sub.protectedMethod();
	        //sub.defaultMethod();

	        Grandchildclass grandChild = new Grandchildclass();
	        grandChild.publicMethod();
	        // grandChild.privateMethod(); // Not accessible
	        //grandChild.protectedMethod();
	        //grandChild.defaultMethod();

	        subclass sub2 = new subclass();
	        sub2.publicMethod();
	        // sub2.privateMethod(); // Not accessible
	       // sub2.protectedMethod();
	        // sub2.defaultMethod(); // Not accessible

	        Grandchild2 grandChild2 = new Grandchild2();
	        grandChild2.publicMethod();
	        // grandChild2.privateMethod(); // Not accessible
	        //grandChild2.protectedMethod();
	        // grandChild2.defaultMethod(); // Not accessible
	    }
	}


