package javaStart6Array;

// 향상된 for문
public class Array3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/**
 * 각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다.
 * 배열은 처음부터 끝까지 순서대로 읽어서 사용하는 경우가 많다.
 * 배열의 값을 읽으려면 `int i` 와 같은 인덱스를 탐색할 수 있는 변수를 선언해야 한다.
 * `i < numbers.length` 와 같이 배열의 끝 조건을 지정해야주어야한다.
 * 배열의 값을 하나 읽을 때 마다 인덱스를 하나씩 증가해야 한다.
 * 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 단순히 해당 배열을 처음부터 끝까지 탐색한다.
 * `:` 의 오른쪽에 `numbers` 와 같이 탐색할 배열을 선택하고, `:` 의 왼쪽에 `int number` 와 같이 반복할 때 마다 찾은 값을 저장할 변수를 선언한다.
 * 그러면 배열의 값을 하나씩 꺼내서 왼쪽에 있는 `number` 에 담고 for문을 수행한다.
 * 향상된 for문에는 증가하는 인덱스 값이 감추어져 있다. 따라서 `int i` 와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우에는 향상된 for문을 사용할 수 없다.
 */