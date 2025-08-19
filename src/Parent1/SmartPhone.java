package Parent1;

public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi 상태를 변경했습니다." + wifi);
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
