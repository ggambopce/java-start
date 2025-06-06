package javaStart7Method;

public class Method2 {
    // 매개변수가 없거나 반환 타입이 없는 경우
    public static void main(String[] args) {
         boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if(i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * 반환 타입이 있는 메서드는 반드시 `return` 을 사용해서 값을 반환해야 한다.
 * `return` 문을 누락했다는 컴파일 오류가 발생한다.
 * return` 문을 만나면 그 즉시 해당 메서드를 빠져나간다.
 * 반환 타입이 있는 메서드를 호출했는데 만약 반환 값이 필요없다면 사용하지 않아도 된다.
 */