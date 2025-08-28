package thread.example7;

public class WorkThread extends Thread{

    public boolean work = true;

    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        while(true){
            if(work){
                System.out.println(getName() + ": 작업처리");
            }else {
                Thread.yield();
            }
            //만약 yiled가 없었다면 sleep을 하는 동안에도 부적절한 실행이 계속됨.
        }
    }
}
