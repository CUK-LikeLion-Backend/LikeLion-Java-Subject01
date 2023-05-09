package main.java.ex02;
import java.util.Scanner;

public class Rabbit {
    public static int Fibo(int num){
        if(num<=1)
            return 2*num;
        else
            return 2*(Fibo(num-1)+Fibo(num-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Fibo(num));
    }
}