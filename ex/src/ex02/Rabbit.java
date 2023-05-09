package ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(rabbit(i) + " ");
        }
    }
    public static int rabbit(int n){
        if (n <= 1){
            return n;
        }
        else {
            return rabbit(n-1) + rabbit(n -2);
        }
    }
}
