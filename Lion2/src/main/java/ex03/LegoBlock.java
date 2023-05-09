package main.java.ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void Hanoi(int n, int from,int mid,int to){
        if(n==1){
            System.out.printf("1번 레고를 %d에서 %d로 옮깁니다.\n",from,to);
        }else{
            Hanoi(n-1,from,to,mid);
            System.out.printf("%d번 레고를 %d에서 %d로 옮깁니다.\n",n,from,to);
            Hanoi(n-1,mid,from,to);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        Hanoi(N,i,(i+j)/2,j);
    }
}
