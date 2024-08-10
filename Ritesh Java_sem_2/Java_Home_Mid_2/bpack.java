package bpack;
import apack.A;

public class B extends A {
    public void display() {
        System.out.println("a = " + a);
        // Error: Cannot access private variable b from outside class A
        // System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
