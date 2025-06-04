package javaStart2Operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println(sum);
        // 뺄셈
        int diff = a - b;
        System.out.println(diff);
        // 곱셈
        int multi = a * b;
        System.out.println(multi);
        // 나눗셈
        int div = a / b;
        System.out.println(div);
        // 나머지
        int mod = a % b;
        System.out.println(mod);
    }
}

/**
 * 5 / 2` 의 결과는 `2.5` 가 되어야 하지만 결과는 소수점이 제거된 `2` 가 나왔다.
 * 자바에서 같은 `int` 형끼리 계산하면 계산 결과도 같은 `int` 형을 사용한다. `int` 형은 정수이기 때문에 소수점 이하를 포함할 수 없다.
 * 나머지 연산자(`%`)
 * 숫자는 0으로 나눌 수 없다. 이 경우 프로그램에 오류가 발생한다.
 */