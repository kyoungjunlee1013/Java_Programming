package main.java.operator;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1>10){
            int v2 = v1 - 10;
        }
        // int v3 = v1 + v2 + 5; 해당 v2는 if문 내부에 변수초기화를 진행했기 때문에 컴파일 오류가 발생한다.
    }
}
