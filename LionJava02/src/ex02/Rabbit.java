package ex02;

import java.util.Scanner;

public class Rabbit {
    public static int rabbit( int n, int baby, int adult){
        if(n==1) return baby + adult;
        return rabbit(n-1, adult, baby+adult);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rabbit(n-1,0, 2));
    }
}
