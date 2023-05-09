package ex02;

import java.util.Scanner;

public class Rabbit {
    public int recursion(int n){
        if(n == 1 || n ==2) return 1;
        return recursion(n-1) + recursion(n-2);
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Scanner sc = new Scanner(System.in);
        int result = rabbit.recursion(sc.nextInt());
        System.out.println(result);
    }
}
