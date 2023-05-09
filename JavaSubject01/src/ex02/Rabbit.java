package ex02;
import java.util.Scanner;

public class Rabbit {
    int fibonacci(int N) {
        if(N <= 2) return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
    public static void main(String[] args){

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type Month : ");
        n=scanner.nextInt();
        Rabbit rabbit = new Rabbit();
        System.out.println("Result : "+rabbit.fibonacci(n));
    }
}
