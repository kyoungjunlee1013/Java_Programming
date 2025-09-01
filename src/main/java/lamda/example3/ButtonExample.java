package lamda.example3;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        // ok 버튼 객체 생성

        btnOk.setClickListner(()->{
            System.out.println("OK 버튼을 클릭했습니다.");
        });
            btnOk.click();

        Button btnCancel = new Button();

        btnCancel.setClickListner(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });
        btnCancel.click();

    }
}
