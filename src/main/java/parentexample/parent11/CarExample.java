package main.java.parentexample.parent11;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();
    }
}
