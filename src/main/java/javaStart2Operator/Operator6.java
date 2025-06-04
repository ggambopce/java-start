package javaStart2Operator;

public class Operator6 {
    // 논리 연산자
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

        int c = 15;

        //a는 10보다 크고 20보다 작다
        boolean result = c > 10 && c < 20;
        System.out.println("result = " + result);

    }
}

/**
 * &&` : 두 피연산자가 모두 참이어야 `true` 를 반환한다. 둘중 하나라도 거짓이면 `false` 를 반환한다.
 * ||` : 두 피연산자 중 하나라도 참이면 `true` 를 반환한다. 둘다 모두 거짓이면 `false` 를 반환한다.
 * `!` : 피연산자의 논리적 부정을 반환한다. 참이면 거짓을, 거짓이면 참을 반환한다.
 */
