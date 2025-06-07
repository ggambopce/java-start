package javaStart7Method;

public class Method5 {
    // 메서드 오버로딩
    public static void main(String[] args) {
        addMethod(1,2);
        addMethod(1.2, 2.2);
    }

    public static void addMethod(int a, int b) {

        System.out.println(a + b);
    }
    public static void addMethod(double a, double b) {
        System.out.println(a + b);
    }
}

/**
 * 자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다.
 * 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(Overloading)이라 한다.
 * 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환 타입은 인정하지 않는다.
 * 메서드 시그니처는 메서드의 이름과 매개변수 타입(순서 포함)으로 구성되어 있다.
 * 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다. 반환 타입은 시그니처에 포함되지 않는다
 * 변수 이름은 일반적으로 명사를 사용한다. 한편 메서드는 무언가 동작하는데 사용하기 때문에 일반적으로 동사로 시작한다.
 */
