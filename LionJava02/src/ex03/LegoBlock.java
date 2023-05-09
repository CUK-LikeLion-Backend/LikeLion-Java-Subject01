package ex03;

import java.util.*;

public class LegoBlock {
    int n, i , j ;
    public static void hanoi(int n , int from , int by, int to){
        if(n==0) return ;
        hanoi(n-1, from, to, by) ;
        System.out.println(n+"번 레고를 "+ from + "에서 " + to + "으로 옮깁니다.");
        hanoi(n-1, by, from ,to) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        hanoi(n,i,6-i-j,j);
    }
}
