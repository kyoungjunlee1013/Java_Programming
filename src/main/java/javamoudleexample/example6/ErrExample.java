package javamoudleexample.example6;

public class ErrExample {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        }catch (NumberFormatException e){
            System.err.println("에러내용: ");
            System.err.println(e.getMessage());
            System.out.println("안녕하세요");
        }
    }
}
