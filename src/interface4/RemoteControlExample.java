package interface4;

import interface4.Audio;
import interface4.RemoteControl;


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
