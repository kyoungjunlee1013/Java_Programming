package thread.example6;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        }catch (InterruptedException e){

        }
        System.out.println("1-100의 합: " + sumThread.getSum());
    }
    //만약 join이 없다면 합을 구하는 서브스레드(sumThread)가 실행되서 sum을 진행하기 전에 값이 출력됨.
}
