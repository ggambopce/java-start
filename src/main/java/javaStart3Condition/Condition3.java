package javaStart3Condition;

public class Condition3 {
    // 삼항 연산자
    public static void main(String[] args) {
        int age = 19;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age= " + age + ", status= " + status);
    }
}
/**
 * 삼항 연산자는 항이 3개라는 뜻이다. `조건` , `참_표현식` , `거짓_표현식` 이렇게 항이 3개이다.
 * 조건에 만족하면 `참_표현식` 이 실행되고, 조건에 만족하지 않으면 `거짓_표현식` 이 실행된다.
 */