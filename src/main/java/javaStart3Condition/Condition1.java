package javaStart3Condition;

public class Condition1 {
    // if, if-else, else
    public static void main(String[] args) {
        int age = 10; // 사용자 나이

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        int price = 10000; // 아이템 가격
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
    }
}

/**
 * if` 문은 특정 조건이 참인지 확인하고 조건이 참(`true`)일 경우 특정 코드 블록을 실행한다.
 * if문의 반복은 불필요한 조건 검사: 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사한다
 * else` 문은 `if` 문에서 만족하는 조건이 없을 때 실행하는 코드를 제공한다.
 * else if` 문은 앞선 `if` 문의 조건이 거짓일 때 다음 조건을 검사한다. 만약 앞선 `if` 문이 참이라면 `else if` 를 실행하지 않는다.
 */

/**
 * if` 문에 `else if` 를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다. 그런데 서로 관련이 없는 독립 조건이면
 * `else if` 를 사용하지 않고 `if` 문을 각각 따로 사용해야 한다.
 * `if` 문 다음에 실행할 명령이 하나만 있을 경우에는 `{}` 중괄호를 생략할 수 있다.
 */