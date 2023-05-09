package ex03;

import java.util.Scanner;
public class LegoBlock {
    public static void moveLego(int n, int depart, int arrive, int middle) {
        if (n == 1) { // 종료 조건
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, depart, arrive);
        }
        else {
            moveLego(n-1, depart, middle, arrive);
            // 맨 밑의 n번째 레고를 arrive 발판으로 옮기기 위해 위에 있는 n-1개의 레고를 middle 발판으로 옮긴다.
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, depart, arrive);
            // 그 다음 n번째 레고를 arrive 발판으로 옮긴다.
            moveLego(n-1, middle, arrive, depart);
            // middle 발판에 있는 n-1개의 레고를 arrive 발판으로 옮긴다.
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n, i, j를 입력하세요.");
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        moveLego(n, i, j, 6 - i - j);
        scanner.close();
    }
}
// 하노이 탑 : 프랑스 수학자 루카스에 의해 고안된 문제로, 가운데 기둥을 이용해 왼쪽 기둥에 놓인 크기가 다른 원판을 오른쪽 기둥으로 옮기는 문제