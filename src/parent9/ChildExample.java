package parent9;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
        child.method3();
    }
}
// child == parent 즉, child 객체이고, 따라서 child.method3()를 사용할 수 있는 것이다