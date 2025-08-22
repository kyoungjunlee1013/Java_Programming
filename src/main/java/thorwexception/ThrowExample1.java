package main.java.thorwexception;

public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            findclass();
        } catch (ClassNotFoundException e){
            System.out.println("예외 처리: " + e.toString());
        }
    }
    public static void findclass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
