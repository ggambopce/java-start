package javaStart4Loop;

public class Loop4 {
    // break, continue
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 0) {
                System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " + sum);
                break;
            }
            i++;
        }

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

/**
 * 조건식을 잘 보면 `true` 라고 되어있다. 조건이 항상 참이기 때문에 이렇게 두면 `while` 문은 무한 반복된다.
 * 물론 `break` 문이 있기 때문에 중간에 빠져나올 수 있다.
 * continue` 를 만나면 다음 코드가 실행되지 않고 다시 조건식으로 이동한다.
 */
