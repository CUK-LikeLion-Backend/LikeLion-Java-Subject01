package main.java.ex02;

import java.util.Scanner;

public class Rabbit {
    public static int fibo(int now){
        if(now == 0){
            return 0;
        }
        if(now == 1){
            return 2;
        }

        return (fibo(now - 1) + fibo(now - 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }
}
