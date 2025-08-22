package main.java.parentexample.parent10;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "Data1";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;

        child.field2 = "Data2";
        child.method3();
    }
}
