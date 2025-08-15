package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);
        System.out.println("a + b =" + sum); //출력 a + b = 7

        //뺼셈
        int diff = a - b;
        System.out.println("a - b =" + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b =" + multi);

        //나눗셈
        int div = a/b; // int형은 int형으로 나옴. 소수점 표현이 안된다.
        System.out.println("a / b =" + div);

        //나머지
        int mod = a%b;
        System.out.println("a % b =" + mod);

        //.ArithmeticException
        // int z = 10 / 0;
    }
}
