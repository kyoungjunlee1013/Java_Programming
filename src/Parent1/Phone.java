package Parent1;

public class Phone {
    public String model;
    public String color;

    public void bell(){
        System.out.println("벨이 울립니다");
    }

    public void sendVoices(String message){
        System.out.println("자긴: " + message);
    }

    public void receiveVoices(String message){
        System.out.println("상대방: " + message) ;
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
