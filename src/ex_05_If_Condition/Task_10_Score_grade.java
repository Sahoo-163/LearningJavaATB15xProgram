package ex_05_If_Condition;

public class Task_10_Score_grade {
    public static void main(String[] args) {
        int score=40;
        if ( score>=90 && score<100){
            System.out.println("Grade is A");
        } else if ( score>=80 && score<89) {
            System.out.println("Grade is B");
        } else if (score>=70 && score<79) {
            System.out.println("Grade is c");
        } else if (score>=60 && score<69) {
            System.out.println("Grade is d");
        } else if (score>=50 && score<59) {
            System.out.println("Grade is E");
            
        }
        else {
            System.out.println("He is failed");
        }
    }
}
