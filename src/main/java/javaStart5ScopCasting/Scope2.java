package javaStart5ScopCasting;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        // int temp = 0;
        if (m > 0) {

            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

    }
}
/**
 * `temp`는 `if`코드 블록에서만 필요하지만, `main()`코드 블록이 종료될 때 까지 메모리에 유지된다. 따라서 불필요한 메모리가 낭비된다.
 * temp`는 `if`코드 블록에서만 필요하고, 여기서만 사용하면 된다.
 * temp`를 `if`코드 블록 안에서 선언했다. 이제 `temp` 는 `if`코드 블록 안으로 스코프가 줄어든다.
 * 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
 * 메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
 */
