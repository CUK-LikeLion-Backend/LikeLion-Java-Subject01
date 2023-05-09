package ex02;

import java.util.Scanner;

//- 첫 달에는 새끼 토끼 한 쌍만이 존재한다.
//- 두 달 이상이 된 토끼는 번식 가능하다. : 이게 포인트인듯.
//- 번식 가능한 토끼 한 쌍은 매달 새끼 한 쌍을 낳는다.
public class Rabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("개월을 입력하세요: ");
        int num = sc.nextInt();

        System.out.println("총 토끼 수: " + product(num));
    }
    // 2 4 8 16 ....  규칙 : 이전 토끼 수의 2배씩 늘어난다.
    public static int product(int n){
        if (n == 1){
            return 2; // 첫달은 낳을 수 없으니 한쌍
        }
        else if (n == 2) {
            return 4;
        }
        else {
            return product(n-1) * 2;
        }
    }

}
