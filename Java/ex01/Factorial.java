package ex01;
import java.util.Scanner;
public class Factorial {
    public static int factorial (int num) {
        if (num == 1)
            return 1;

        return num * factorial (num - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int N = scanner.nextInt();
        System.out.printf("%d! = %d", N, factorial(N));
    }
}
