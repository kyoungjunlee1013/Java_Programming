package parentexample.parent12;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
        // vehicle 객체를 넘겨줘야하는 driver.drive 메소드, vehicle 객체를 상속한 자식 객체를 넘겨줘도 이상이 없다.
    }
}
