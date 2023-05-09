package 멋사재귀.ex02;

import java.util.Scanner;

public class Rabbit {
    static int func(int n){
        if(n==1||n==2){
            return 1;
        }

        return func(n-1) + func(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(func(n) + "쌍");
    }
}