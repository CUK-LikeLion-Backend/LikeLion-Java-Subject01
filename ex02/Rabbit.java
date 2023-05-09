package ex02;

import java.util.Scanner;
import java.util.SortedMap;

public class Rabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >");
        int num = sc.nextInt();

        System.out.println(fibonaci(num));
    }

    static int fibonaci(int n){
        if(n <= 2)
            return 1;
        else
            return fibonaci(n-1) + fibonaci(n-2);
    }
}
