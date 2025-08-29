package thread.example14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        //스레드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.shutdownNow();
    }
}
