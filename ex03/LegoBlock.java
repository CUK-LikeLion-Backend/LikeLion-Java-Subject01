package ex03;

import java.util.Scanner;
// 313 -> 3개의 레고 블럭이 쌓여있음 처음 레고는 i번째 즉 1에 쌓여있다. i에서 j번째로 블럭을 모두 옮기고자한다.
// 1번 레고를 1에서 3로 옮깁니다.
// 2번 레고를 1에서 2로 옮깁니다.
// 1번 레고를 3에서 2로 옮깁니다. - 큰 레고를 작은 레고 위에 올릴 수 없기에 2먼저 옮기고 그 다음 1을 옮긴것
// 3번 레고를 1에서 3로 옮깁니다.
// 1번 레고를 2에서 1로 옮깁니다.
// 2번 레고를 2에서 3로 옮깁니다.
// 1번 레고를 1에서 3로 옮깁니다.

// Hanoi(n) = 2 × Hanoi(n-1) + 1 : 수열을 이용해야한다.
public class LegoBlock {

    static StringBuilder sb = new StringBuilder();
    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n,i,j를 입력하시오: ");
        int n = sc.nextInt(); // 레고 3개 - 번호 부여를 해야하는데?? for문 사용안되나?
        int i = sc.nextInt(); // 1층에 존재 
        int j = sc.nextInt(); // 3층으로 다 옮기기

        lego(n,i,j,2);
        System.out.println(sb);
    }
    // n: 블록갯수, i:출발지, j:도착지, temp : 옮기기위해 필요한 장소
    public static void lego(int n, int i, int j, int temp) {

        if(n == 0)
            return;
        else{
            lego(n-1, i, temp, j);
            sb.append(n + "번 레고를 " + i + "에서 " + j + "로 옮깁니다.\n");
            lego(n-1,temp,j,i);
        }
    }

}