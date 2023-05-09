package ex02;

import java.util.Scanner;
public class Rabbit {
    public static int fibonacci(int num) {
        if (num <= 2) {
            return 2;
        }
        else {
            return 2 * (fibonacci(num - 2) + fibonacci(num - 1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자연수 입력: ");
        int N = scanner.nextInt();
        System.out.printf("%d개월 후, 토끼 수: %d마리", N, fibonacci(N));
    }
}
// 피보나치 수열 : 앞의 두 수의 합이 바로 뒤의 수가 되는 수의 배열
