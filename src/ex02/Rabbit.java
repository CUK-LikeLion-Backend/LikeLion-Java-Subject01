package ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();

        System.out.println(num+"개월 차 토끼 수: "+rabbit(num));

    }

    public static int rabbit(int num){
        int result;

        if(num <= 2)
            result = 1;
        else
            result = rabbit(num-1)+rabbit(num-2);   //피보나치

        return result;
    }
}
