package interface4;

import interface4.RemoteControl;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }
    @Override
    public void turnOff(){
        System.out.println("오디로를 끕니다.");
    }
    @Override
    public void setVolume(int volume){
        if(volume> interface4.RemoteControl.MAX_VOLUME){
            this.volume = interface4.RemoteControl.MAX_VOLUME;
        }else if(volume< interface4.RemoteControl.MIN_VOLUME){
            this.volume = interface4.RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다.");
            setVolume(interface4.RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
