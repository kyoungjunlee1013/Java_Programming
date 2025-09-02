package stream.example13;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5 };
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .peek(n -> System.out.println(n));
//peek도 forEach와 동일하게 루핑 함수이다. 하지만 peek는 위처럼 마무리 함수가 없을 경우에는 작동하지 못한다.
        int total = Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총합: " + total + "\n");

        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
