package interfaceexmaple.interface4;


public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;


        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
