package ex01;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력하세요: ");
        int num = sc.nextInt();
        // num!의 값만 출력되게 하면 되는건가?
        System.out.println(num + "! = " + product(num));

    }
    public static int product(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * product(n - 1);
    }

}
