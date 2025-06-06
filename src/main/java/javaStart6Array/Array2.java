package javaStart6Array;

public class Array2 {
    // 배열 리팩토링
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{90, 60, 70, 30}; // 배열 생성과 초기화
        // int[] students = {90, 80, 70, 60, 50};

        // 변수 갑 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]);
        }

    }
}

/**
 * `students.length`배열의 길이를 제공하는 특별한 기능이다. 조회만 할 수 있다. 대입은 할 수는 없다.
 * 배열은 `{}` 를 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공한다.
 */