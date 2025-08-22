package main.java.operator;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수: " + score);

        String grade;

        if(score >= 90) {
            grade = "A+";
        } else{
            grade = "B+";
        }
        System.out.println("학점: " + grade);
    }
}
