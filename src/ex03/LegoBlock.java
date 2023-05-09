package ex03;

import java.util.Scanner;

public class LegoBlock {
    public void Hanoi(int n, int from, int to, int mid){
        if(n == 0) return;
        Hanoi(n-1, from, mid, to);
        System.out.println(n + "번 레고를 " + from + "에서" + to + "로 옮깁니다.");
        Hanoi(n-1, mid, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LegoBlock legoBlock = new LegoBlock();
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("i : ");
        int i = sc.nextInt();
        System.out.print("j : ");
        int j = sc.nextInt();

        legoBlock.Hanoi(n, i, j, 6 - (i+j));

    }
}
