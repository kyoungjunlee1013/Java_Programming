package javamoudleexample.example15;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //BOXING
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        //UNBOXING
        int value = obj;
        System.out.println("value: " + value);

        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
