package ex02;
import java.util.Scanner;


public class Rabbit {

    public static int rabbit(int n) {
        if (n == 1 || n == 2) return 1;

        return rabbit(n - 1) + rabbit(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개월 차인지 입력하시오: ");
        System.out.println("N개월 차의 토끼 개체수: " + 2*rabbit(sc.nextInt()));
    }

}
