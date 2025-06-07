package javaStart7Method;

public class Method4 {
    // 메서드와 형변환
    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int)number);
    }

    public static void printNumber(int n) {
        System.out.println(n);
    }
}

/**
 * 메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 명시적 형변환을 사용해야 한다.
 * int < long < double` 메서드를 호출할 때 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것이다
 * 자동 형변환이 그대로 적용
 */