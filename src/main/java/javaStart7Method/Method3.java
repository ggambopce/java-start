package javaStart7Method;

public class Method3 {
    // 메서드 호출과 값 전달
    public static void main(String[] args) {
        int num1 = 5;
        changeNumber(num1);
        changeNumber1(num1);
        System.out.println(num1);

        num1 = changeNumber2(num1);
        System.out.println(num1);

    }

    public static void changeNumber(int num) {
        num = num * 2;
        System.out.println(num);
    }
    public static void changeNumber1(int num1) {
        num1 = num1 * 2;
        System.out.println(num1);
    }

    public static int changeNumber2(int num2) {
        num2 = num2 * 2;
        return num2;
    }

}

/**
 * 자바는 항상 변수의 값을 복사해서 대입한다.
 * 결과적으로 매개변수 `num` 의 값만 10으로 변경되고 `num1` 의 값은 변경되지 않고 기존 값인 5로 유지된다
 * 자바는 항상 값을 복사해서 전달하기 때문에 `num2` 의 값을 바꾸더라도 `num1` 에는 영향을 주지 않는다.
 * 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다. 물론 이름이 같아도 완전히 다른 변수다.
 * `main()` 의 `num1` 와 `changeNumber1()` 의 `num1` 는 서로 다른 변수이다.
 * 메서드를 사용해서 값을 변경하려면 메서드의 호출 결과를 반환 받아서 사용하면 된다.
 */