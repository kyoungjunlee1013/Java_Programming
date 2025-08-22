package main.java.StaticMemberClass;

public class A {

    static class B{}

    B field1 = new B();

    static B field2 = new B();

    A(){
        B b = new B();
    }

    static void method2(){
        B b = new B();
    }
}
