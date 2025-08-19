package interface1;

public class Television implements RemoteControl {
    @Override
    public void turnOn(){
        System.out.println("Television is on");
    }
}
