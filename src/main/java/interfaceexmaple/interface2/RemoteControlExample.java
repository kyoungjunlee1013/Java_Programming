package main.java.interfaceexmaple.interface2;

public class RemoteControlExample {
    // 인터페이스는 static final 특성을 갖는 불변의 상수를 자동으로 갖게 됨
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
    }
}
