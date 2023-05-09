package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n, i, j를 입력하세요: ");

        int n = sc.nextInt();
        int i = sc.nextInt();
        //처음 모든 레고는 i번쨰 발판에
        int j = sc.nextInt();
        // 목표 발판.

        hanoi(n,i,6-i-j,j);
        //6-i-j = 기둥이 3개 1 2 3 만약 i = 1이고 J가 2면 middle = 3

    }

    static void hanoi(int n, int start,  int middle, int terminal){
            if(n==1){
                System.out.println(n+"번 레고를 "+start+"에서 "+terminal+"로 옮깁니다.");
                //hanoi(1, start, middle, terminal);

            }
            else {
                hanoi(n - 1, start, terminal, middle);
                System.out.println(n+"번 레고를 "+start+"에서 "+terminal+"로 옮깁니다.");
                hanoi(n - 1, middle, start, terminal);
            }

    }
    
}
