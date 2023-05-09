package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n, i, j를 입력하세요.");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        hanoi(n, i, j);
    }

    public static void hanoi(int n, int i, int j) { // n개의 레고를 i에서 j로 옮겨라
        if (n == 1) {
            System.out.println("1번 레고를 " + i + "에서 " + j + "로 옮깁니다.");
        } else {
            int k = 6 - i - j;
            hanoi(n-1, i, k);
            System.out.println(n + "번 레고를 " + i + "에서 " + j + "로 옮깁니다.");
            hanoi(n-1, k, j);
        }
    }
}