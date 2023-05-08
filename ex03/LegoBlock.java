package main.java.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void hanoi(int from,int via,int to,int N){
        if(N==0)
            return;
        hanoi(from,to,via,N-1);
        System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n",N,from,to);
        hanoi(via,from,to,N-1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j;
        System.out.println("n, i, j를 입력하세요.");
        N = sc.nextInt();
        i = sc.nextInt();
        j = sc.nextInt();

        hanoi(i, 6 - (i + j), j, N);
    }
}
