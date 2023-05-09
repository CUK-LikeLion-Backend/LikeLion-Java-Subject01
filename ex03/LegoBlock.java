package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n, i, j를 입력하세요: ");
        int N = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int tmp = 0;
        if ((i != 1)&&(j != 1))
            tmp = 1;
        else if ((i != 2)&&(j != 2))
            tmp = 2;
        else if ((i != 3)&&(j != 3))
            tmp = 3;

        lego(N, i, tmp, j);
    }

    public static void lego(int n, int i, int tmp, int j){
        if (n == 1)
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n", n, i, j);
        else {
            //from에 있던 1,2번 레고를 tmp로 옮기기
            lego(n - 1, i, j, tmp);

            //from에 있던 3번레고를 to로
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다\n", n, i, j);

            //tmp에 있던 레고를 to로 옮기기
            lego(n - 1, tmp, i, j);
        }
    }
}

/*
n-1개를 첫번째원에서 두번째원으로 옮겨야하니까 i, j, tmp
n번째를 첫번째원에서 세번째원으로 옮겨야하니까 i, j
n-1개를 다시 두번째원에서 세번째원으로 옮겨야하니까 tmp, i, j 순으로 진행~~
 */