package ex03;
import java.util.Scanner;

public class LegoBlock {
    public static void main (String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("N, i, j를 입력하시오");
        int n=scanner.nextInt();
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        int temp=0;
        if(i==1){ //입력받는 i와 j값에 따라 중간 temp값이 지정되도록 하였다.
            if(j==2) {
                temp = 3;
            }
            else if(j==3){
                temp =2;
            }
        }
        if(i==2){
            if(j==1) {
                temp = 3;
            }
            else if(j==3){
                temp =1;
            }
        }
        if(i==3){
            if(j==1) {
                temp = 2;
            }
            else if(j==2){
                temp =1;
            }
        }




        hanoi(n, i, temp, j);
    }
        static void hanoi(int i, int from, int mid, int to){

        if(i==1){
            System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
        }else{
            hanoi(i-1, from, to, mid);
            System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
            hanoi(i-1, mid, from, to);
        }
    }
}

