package thread.example13;

public class DaemonExample {
    public static void main(String[] args) {

        AutoSaveThread authoSaveThread = new AutoSaveThread();
        authoSaveThread.setDaemon(true);
        authoSaveThread.start();
        
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){}

        System.out.println("메인 스레드 종료");
    }
}
