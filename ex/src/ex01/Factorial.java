package ex01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(Fac(num));

    }

    public static int Fac(int num){
        if(num==1){ return 1;}
        return num*Fac(num-1);
    }
}
