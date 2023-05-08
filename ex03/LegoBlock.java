package ex03;
import java.util.Scanner;

public class LegoBlock {
    static void move(int n, int from, int to, int via) {
        if (n == 1) {
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, from, to);
        } else {
            move(n - 1, from, via, to);
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, from, to);
            move(n - 1, via, to, from);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n, i, j를 입력하세요.");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        sc.close();
        move(n, i, j, 6 - i - j);
    }
}
