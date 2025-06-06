package javaStart5ScopCasting;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m= " + m); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if x= " + x);
        } // x 생존 종료

        //System.out.println("main x=" + x); // 오류, 변수 x에 접근 불가
        System.out.println("main m=" + m);

        for (int i = 0; i < 2; i++) {
            System.out.println("for m= " + m);
            System.out.println("for i= " + i);
        }
        //System.out.println("main i= " + i); // 오류, 변수 i에 접근 불가
        System.out.println("main m= " + m);
    } // m 생존 종료


}
/**
 * 변수의 접근 가능한 범위를 스코프(Scope)라 한다
 * 변수는 선언한 위치에 따라 지역 변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.
 * 지역 변수는 이름 그대로 특정 지역에서만 사용할 수 있는 변수라는 뜻이다. 그 특정 지역을 벗어나면 사용할 수 없다.
 * 여기서 말하는 지역이 바로 변수가 선언된 코드 블록(`{}` )이다. 지역 변수는 자신이 선언된 코드 블록(`{}` ) 안에서만 생존하고, 자신이 선언된 코드 블록을 벗어나면 제거된다. 따라서 이후에는 접근할 수 없다.
 * `for` 문의 경우 `for(int i=0;..)` 과 같이 `for` 문 안에서 초기식에 직접 변수를 선언할 수 있다. 그리고 이렇게 선언한 변수는 `for` 문 코드 블록 안에서만 사용할 수 있다.
 */
