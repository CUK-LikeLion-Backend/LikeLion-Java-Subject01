package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n 입력: ");
        int n = sc.nextInt();
        System.out.println("i 입력: ");
        int i = sc.nextInt();
        System.out.println("j 입력: ");
        int j = sc.nextInt();

        int k = 6 - (i + j);
        lego(n, i, j, k); //i=출발블럭 , j=목적블럭, k=중간 거쳐가는 블럭

    }
    public static void move(int n, int i, int j){

        System.out.println(n+"번 레고를 "+i+"에서 "+j+"로 옮깁니다");
    }

    public static void lego(int n, int i, int j, int k){
        if(n == 1)
            move(1, i, j);
        else {
            lego(n - 1, i, k, j);   //1~ n-1번 레고를 중간블럭으로 일단 옮김
            move(n, i, j);  //n번 레고를 목적블럭으로 옮김
            lego(n-1, k, j, i); //중간블럭으로 옮겨뒀던 나머지 n-1개 레고를 목적블럭으로 옮김
        }
    }

}
