package execption3;

public class ExecptionHandlingExample {

    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String이 존재");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally 도착");
        }
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2가 존재합니다.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
