package ex01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("자연수 입력: ");
        int num = sc.nextInt();

        System.out.println(num+"! = "+factorial(num));
    }

    public static int factorial(int num){
        int result;

        if(num <= 1)
            result = num;
        else
            result = num * factorial(num-1);

        return result;
    }


}
