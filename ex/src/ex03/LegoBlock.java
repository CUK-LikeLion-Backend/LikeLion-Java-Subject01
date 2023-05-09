package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n, i ,j를 입력하세요 : ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        lego(n, i, j);
    }

    public static void lego(int n, int i, int j){
        if (n == 1){
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, i, j);
        }
        else{
            int tmp = 6 - i - j;
            lego(n - 1, i, tmp);
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.%n", n, i, j);
            lego(n - 1, tmp, j);
        }
    }
}
