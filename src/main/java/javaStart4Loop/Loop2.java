package javaStart4Loop;

public class Loop2 {
    // while 문제: 1부터 하나씩 증가하는 수를 3번 더해라
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum += i;
            System.out.println("i= " + i + ", sum= " + sum );
            i++;
        }
    }
}
