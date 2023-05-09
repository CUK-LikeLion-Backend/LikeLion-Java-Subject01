package ex00;

public class RecLion {
    // “Hello Baby Lion 00" 부터 “Hello Baby Lion 10” 까지 순서대로 출력하는 프로그램을 만들어보세요. -재귀
    public static void main(String[] args) {
        HBL(0);
    }
    public static void HBL(int n){
        if(n<=10){
            System.out.println("Hello Baby Lion " + String.format("%02d", n));
            HBL(n + 1); // 재귀 호출
        }


    }

}

