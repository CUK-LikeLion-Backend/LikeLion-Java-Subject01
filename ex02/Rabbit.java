package ex02;

import java.util.Scanner;

public class Rabbit {
    public static int rabbit(int n) {
        if (n == 1 || n==2)
            return 1;
        else
            return rabbit(n-2) + rabbit(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.printf("%d개월차에 토끼가 %d마리 존재합니다", month, rabbit(month));
    }
}

/*
1 1 2 3 5 8 13 21 34

n = 3 일때, rabbit(1) + rabbit(2) = 1 + 1 => 2
n = 4 일때, rabbit(2) + rabbit(3) = 1 + 2 => 3
n = 5 일때, rabbit(3) + rabbit(4) = 2 + 3 => 5
 */
