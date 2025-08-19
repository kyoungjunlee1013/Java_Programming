package interface10;

public class Car {
    Tire tire1 = new KumhoTire();
    Tire tire2 = new HankookTrie();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
