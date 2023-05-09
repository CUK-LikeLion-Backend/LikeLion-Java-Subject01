package ex01;

import java.util.Scanner;

public class Factorial {
    static public int fact(int n){
        if(n == 0)
            return 1;
        else
            return n * fact(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세오 >>>");
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}

