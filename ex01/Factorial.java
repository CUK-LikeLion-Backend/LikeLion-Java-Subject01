package main.java.ex01;

import java.util.Scanner;

public class Factorial {

    public static int facto(int n){
        if(n == 1){
            return 1;
        }
        return n * facto(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(facto(n));

    }
}