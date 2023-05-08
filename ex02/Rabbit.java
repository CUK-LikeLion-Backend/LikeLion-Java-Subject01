package ex02;

import java.util.Scanner;

public class Rabbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonacci(number)*2);
    }

    public static int fibonacci(int num) {
        int result = 0;
        if(num == 1) {
            result = 1;
        } else if (num == 2) {
            result = 1;
        } else if (num >= 3) {
            result = (fibonacci(num -2) + fibonacci(num - 1));
        }

        return result;
    }
}

