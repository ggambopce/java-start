package javaStart7Method;
/*
    메서드를 사용해서 리펙토링해보자.
    String message = "Hello, world!";

    for (int i = 0; i < 3; i++) {
    System.out.println(message);
    }

    for (int i = 0; i < 5; i++) {
    System.out.println(message);
    }

    for (int i = 0; i < 7; i++) {
    System.out.println(message);
    }
 */
public class MethodQuiz2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

}
