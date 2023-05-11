package ex00;

public class RecLion {
    public static void main(String[] args) {
        recursion(0);

    }
    public static void recursion(int num){
        String formattedNum = String.format("%02d", num);   //두자리로 출력

        if(num <=10) {
            num++;
            System.out.print("Hello Baby Lion ");
            System.out.println(formattedNum);

            recursion(num);
        }

    }

}
