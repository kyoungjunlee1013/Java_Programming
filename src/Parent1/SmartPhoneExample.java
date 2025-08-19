package Parent1;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("갤럭시","은색");

        System.out.println("모델: " + myphone.model);
        System.out.println("색상; " + myphone.color);

        System.out.println("와이파이 상태: " + myphone.wifi);

        myphone.bell();
        myphone.sendVoices("여보세요");
        myphone.receiveVoices("안녕하세요 저는 홍길동입니다.");
        myphone.sendVoices("아, 안녕하세요");
        myphone.hangUp();

        myphone.setWifi(true);
        myphone.internet();
    }
}
