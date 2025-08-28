package thread.example6;

public class SumThread extends Thread {
    private long sum;

    public long getSum(){
        return sum;
    }

    public void setSum(long sum){
        this.sum = sum;
    }

    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            sum+=i;
        }
        //만약 join이 없다면 합을 구하는 서브스레드(sumThread)가 실행되서 sum을 진행하기 전에 값이 출력됨.
    }
}
