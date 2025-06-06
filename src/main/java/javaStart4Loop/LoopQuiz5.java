package javaStart4Loop;
/*
    int rows` 를 선언해라.
    이 수만큼 다음과 같은 피라미드를 출력하면 된다.
 */
public class LoopQuiz5 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i= 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
