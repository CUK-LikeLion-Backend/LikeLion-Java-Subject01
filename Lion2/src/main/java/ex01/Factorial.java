package main.java.ex01;
import java.util.Scanner;

public class Factorial {
    public static int Facto(int num){
       if(num<=1){
           return 2*num;
       }else
           return 2*(Facto(num-1)+Facto(num-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Facto(num));
    }
}
