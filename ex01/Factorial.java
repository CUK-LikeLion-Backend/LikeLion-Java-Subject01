package ex01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(n + "! = " + factorial(n));
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
