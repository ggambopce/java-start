package javaStart2Operator;

public class Operator4 {
    // 증감 연산자
    public static void main(String[] args) {
        int a = 0;
        
        a = a + 1;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);
        
        // 증감 연산자
        ++a; // a = a + 1;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        // 전위 증감 연산자
        int b = 1;
        int c = 0;
        c = ++b; // b의 값을 먼저 증가시키고, 그 결과를 c에 대입
        System.out.println("b = " + b + ", c = " + c);
        // 후위 증감 연산자
        b = 1;
        c = 0;
        c = b++; // b의 현재 값을 c에 먼저 대입하고, 그 후 b값을 증가시킴
        System.out.println("b = " + b + ", c = " + c);

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

    }
}

/**
 * 증가 및 감소 연산자를 줄여서 증감 연산자라 한다.
 * 증감 연산자는 ++` 와 `--`로 표현되며, 이들은 변수의 값을 1만큼 증가시키거나 감소시킨다.
 * ++a` : 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위(Prefix) 증감 연산자라 한다.
 * 증감 연산이 먼저 수행된 후 나머지 연산이 수행된다.
 * `a++` : 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위(Postfix) 증감 연산자라 한다.
 * 다른 연산이 먼저 수행된 후 증감 연산이 수행된다
 * 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다. 따라서 전위이든 후위이든 둘다 결과가 같다.
 */