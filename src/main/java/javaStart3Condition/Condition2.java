package javaStart3Condition;

public class Condition2 {

    // switch문
    public static void main(String[] args) {
        // grade 1: 1000, 2: 2000, 3: 3000, 나머지: 500
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급된 쿠폰: " + coupon);
    }
}
/**
 * `break` 문이 없다면 중단하지 않고 바로 다음에 있는 코드도 실행한다.
 * 자바 14부터는 화살표를 사용한 switch문 도입
 */
