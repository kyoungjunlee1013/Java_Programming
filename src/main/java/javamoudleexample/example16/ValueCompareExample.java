package javamoudleexample.example16;

public class ValueCompareExample {
    public static void main(String[] args) {
        // 비교 객체가 만약 -128~127 사이라면 false
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(" == " +(obj1 == obj2));
        System.out.println("equals()" + obj1.equals(obj2));
        System.out.println();

        // 비교 객체가 만약 -128~127 사이라면 true
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(" == " +(obj3 == obj4));
        System.out.println("equals()" + obj3.equals(obj4));
    }
}
