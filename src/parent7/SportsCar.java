package parent7;

public class SportsCar extends Car{

    @Override
    public void speedUp(){
        speed += 10;

//    @Override
//    public void stop(){
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    } static method 또한 부모 객체에 있다면 자식 객체는 이를 재정의(메소드 오버라이딩)을 하지 못한다.
    }
}
