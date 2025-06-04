package javaStart2Operator;

import java.sql.SQLOutput;

public class Operator5 {
    // 비교 연산자
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println( a == b);
        System.out.println( a != b);
        System.out.println( a > b);
        System.out.println( a < b);
        System.out.println( a >= b);
        System.out.println( a <= b);

        boolean result = a == b;
        System.out.println("result = " + result);

        //문자열 비교
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}

/**
 * 비교 연산자는 두 값을 비교하는 데 사용한다. 비교 연산자는 주로 뒤에서 설명하는 조건문과 함께 사용한다.
 * ==   : 동등함           (equal to),  주의 `=` : 대입 연산자, 변수에 값을 대입한다.
 * !=   : 같지 않음        (not equal to)
 * >    : 큼               (greater than)
 * <    : 작음             (less than)
 * >=   : 크거나 같음      (greater than or equal to)
 * <=   : 작거나 같음      (less than or equal to)
 * 불일치 연산자는 `!=` 를 사용한다. `!` 는 반대라는 뜻이다.
 */
