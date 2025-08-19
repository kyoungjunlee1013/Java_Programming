package parent16;

public sealed class Person permits Employee, Manager {
    public String name;

    public void work(){
        System.out.println("제품을 생산합니다.");
    }
}
