package main.java.classexample.Class14;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);


        k1.name = "자바";
        System.out.println(k1.name);
    }
}
