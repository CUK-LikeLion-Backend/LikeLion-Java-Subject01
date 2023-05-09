package 멋사재귀.ex03;

import java.util.Scanner;

public class LegoBlock {
    static void block(int n,int from, int by, int to){
        if(n==1){
            System.out.printf("%d에서 %d로 옮깁니다.\n",from,to);
            return;
        }
        block(n-1,from,to,by);
        block(1,from,by,to);
        block(n-1,by,from,to);
    }

    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        if(i==1&&j==2 || i==2&&j==1){
            k=3;
        }
        else if(i==1&&j==3 || i==3&&j==1){
            k=2;
        }
        else {
            k=1;
        }

        block(n,i,k,j);
    }
}
