package ex01;
import java.util.Scanner;
class FacCal{
    int outvalue = 0;
    int innervalue = 0;
    int result = 1;
    void calFac(int outvalue){

        if(this.innervalue==0){ // 오른쪽 항 제일 처음 1에는 *이 붙지 않는 조건
            result*=++this.innervalue;
            System.out.print(this.innervalue);
            calFac(outvalue);
        }else if(this.innervalue<outvalue){ //그 외의 조건
            result*=++this.innervalue;
            System.out.print(" * "+this.innervalue);
            calFac(outvalue);
        }

    }
    void printFac(int n){

        if(this.outvalue<=n){
            System.out.print(this.outvalue+"! = ");
            calFac(this.outvalue);

            System.out.println();
            System.out.println("Result : "+result);
            System.out.println();
            this.result=1;
            this.innervalue=0;//결과값 출력 및 초기화

            this.outvalue++;
            printFac(n);//다음 팩토리얼 값 출력 및 구하기
        }
        else return;
    }
}
public class Factorial {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        FacCal faccal = new FacCal();

        System.out.print("Type Number : ");
        n=scanner.nextInt();
        faccal.printFac(n);

    }
}
