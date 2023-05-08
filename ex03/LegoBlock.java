package ex03;

import java.util.Scanner;

public class LegoBlock {
    // 레고 블럭을 발판에서 발판으로 이동시키는 함수
    public static void move(int n, int from, int to) {
        if (n == 1) {
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, from, to);
        } else { // 레고 블럭이 1개 이상인 경우
            int other = 6 - from - to; // from과 to가 아닌 발판의 번호
            move(n-1, from, other); // 가장 큰 블럭을 제외한 나머지 블럭들을 other 발판으로 이동
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, from, to); // 가장 큰 블럭을 to 발판으로 이동
            move(n-1, other, to); // other 발판에 있는 블럭들을 to 발판으로 이동
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        System.out.print("n, i, j를 입력하세요. ");
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // 레고 블럭을 i 발판에서 j 발판으로 이동
        move(n, i, j);
    }
}