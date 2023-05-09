package ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(rabbit(1, 1, num-2)+2);
    }

    public static int rabbit(int num1, int num2, int count){
        if(count==0){return 0;}
        int n1=num1;
        int n2=num2;
        int result=n1+n2;
        return result+rabbit(n2, result, count-1);
        // 1 1 2 3 5 8
    }
}
