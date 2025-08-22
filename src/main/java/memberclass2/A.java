package main.java.memberclass2;

public class A {
    String filed = "A-field";

    void method(){
        System.out.println("A-method");
    }
    class B{
        String field = "B-field";

        void print(){
            System.out.println(this.field);
            A.this.method();

            System.out.println(A.this.filed);
            A.this.method();
        }
    }
    void useB(){
        B b = new B();
        b.print();
    }
}
