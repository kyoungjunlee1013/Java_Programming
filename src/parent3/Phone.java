package parent3;

public class Phone {
    public String model;
    public String color;
    
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;

        System.out.println("phone(String model, String color) 생성자 실행");
    }
}
